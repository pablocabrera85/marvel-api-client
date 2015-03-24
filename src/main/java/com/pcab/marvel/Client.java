package com.pcab.marvel;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.pcab.marvel.model.*;
import com.pcab.marvel.model.Character;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;
import org.joda.time.DateTimeUtils;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/**
 * Implementation of the {@link com.pcab.marvel.IMarvelAPI}.
 *
 * This client automatically uses
 */
public class Client implements IMarvelAPI {

    public static final String COMICS = "comics";
    public static final String CHARACTERS = "characters";
    public static final String EVENTS = "events";
    public static final String SERIES = "series";
    public static final String STORIES = "stories";
    public static final String CREATORS = "creators";

    private static Logger logger = LogManager.getLogger(Client.class);

    private String baseUrl = "http://gateway.marvel.com";
    private String version = "v1";

    private WebTarget baseTarget;

    private final Gson gson;

    private final String publicKey;
    private final String privateKey;
    private URLCodec encoder;

    /**
     * Create an {@link com.pcab.marvel.IMarvelAPI} instance.
     * @param publicKey public key to be used on the requests.
     * @param privateKey private key to be used for the hash calculation.
     * @return A client ready to start consuming the API.
     */
    public static IMarvelAPI newInstance(String publicKey,String privateKey) {
        if(StringUtils.isEmpty(publicKey) || StringUtils.isEmpty(privateKey)){
            throw new IllegalArgumentException("You need to provide a public and a private key.");
        }
        return new Client(publicKey,privateKey);
    }
    
    @Override
    public Result<Comic> getComic(Integer comicId) {
        Response response = executeRequest(COMICS, comicId.toString());
        return getComicResponse(response);
    }

    @Override
    public Result<Character> getComicCharacters(Integer comicId, Map<String, Object> queryParams) {
        Response response = executeRequest(COMICS, comicId, CHARACTERS, queryParams);
        return getCharacterResponse(response);
    }

    @Override
    public Result<Creator> getComicCreators(Integer comicId, Map<String, Object> queryParams) {
        Response response = executeRequest(COMICS, comicId, CREATORS, queryParams);
        return getCreatorResponse(response);
    }

    @Override
    public Result<Event> getComicEvents(Integer comicId, Map<String, Object> queryParams) {
        Response response = executeRequest(COMICS, comicId, EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Story> getComicStories(Integer comicId, Map<String, Object> queryParams) {
        Response response = executeRequest(COMICS, comicId, STORIES, queryParams);
        return getStoryResponse(response);
    }

    @Override
    public Result<Character> getCharacter(Integer characterId) {
        Response response = executeRequest(CHARACTERS, characterId.toString());
        return getCharacterResponse(response);
    }

    @Override
    public Result<Comic> getCharacterComics(Integer characterId, Map<String, Object> queryParams) {
        Response response = executeRequest(CHARACTERS, characterId, COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Event> getCharacterEvents(Integer characterId, Map<String, Object> queryParams) {
        Response response = executeRequest(CHARACTERS, characterId, EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Series> getCharacterSeries(Integer characterId, Map<String, Object> queryParams) {
        Response response = executeRequest(CHARACTERS, characterId, SERIES, queryParams);
        return getSeriesResponse(response);
    }

    @Override
    public Result<Story> getCharacterStories(Integer characterId, Map<String, Object> queryParams) {
        Response response = executeRequest(CHARACTERS, characterId, STORIES, queryParams);
        return getStoryResponse(response);
    }

    @Override
    public Result<Creator> getCreator(Integer creatorId) {
        Response response = executeRequest(CREATORS, creatorId.toString());
        return getCreatorResponse(response);
    }

    @Override
    public Result<Comic> getCreatorComics(Integer creatorId, Map<String, Object> queryParams) {
        Response response = executeRequest(CREATORS, creatorId, COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Event> getCreatorEvents(Integer creatorId, Map<String, Object> queryParams) {
        Response response = executeRequest(CREATORS, creatorId, EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Series> getCreatorSeries(Integer creatorId, Map<String, Object> queryParams) {
        Response response = executeRequest(CREATORS, creatorId, SERIES, queryParams);
        return getSeriesResponse(response);
    }

    @Override
    public Result<Story> getCreatorStories(Integer creatorId, Map<String, Object> queryParams) {
        Response response = executeRequest(CREATORS, creatorId, STORIES, queryParams);
        return getStoryResponse(response);
    }

    @Override
    public Result<Event> getEvent(Integer eventId) {
        Response response = executeRequest(EVENTS, eventId.toString());
        return getEventResponse(response);
    }

    @Override
    public Result<Character> getEventCharacters(Integer eventId, Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, eventId, CHARACTERS, queryParams);
        return getCharacterResponse(response);
    }

    @Override
    public Result<Comic> getEventComics(Integer eventId, Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, eventId, COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Creator> getEventCreators(Integer eventId, Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, eventId, CREATORS, queryParams);
        return getCreatorResponse(response);
    }

    @Override
    public Result<Series> getEventSeries(Integer eventId, Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, eventId, SERIES, queryParams);
        return getSeriesResponse(response);
    }

    @Override
    public Result<Story> getEventStories(Integer eventId, Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, eventId, STORIES, queryParams);
        return getStoryResponse(response);
    }

    @Override
    public Result<Series> getSeries(Integer seriesId) {
        Response response = executeRequest(SERIES, seriesId.toString());
        return getSeriesResponse(response);
    }

    @Override
    public Result<Character> getSeriesCharacters(Integer seriesId, Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, seriesId, CHARACTERS, queryParams);
        return getCharacterResponse(response);
    }

    @Override
    public Result<Comic> getSeriesComics(Integer seriesId, Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, seriesId, COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Creator> getSeriesCreators(Integer seriesId, Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, seriesId, CREATORS, queryParams);
        return getCreatorResponse(response);
    }

    @Override
    public Result<Event> getSeriesEvents(Integer seriesId, Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, seriesId, EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Story> getSeriesStories(Integer seriesId, Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, seriesId, STORIES, queryParams);
        return getStoryResponse(response);
    }

    @Override
    public Result<Story> getStory(Integer storyId) {
        Response response = executeRequest(STORIES, storyId.toString());
        return getStoryResponse(response);
    }

    @Override
    public Result<Character> getStoryCharacters(Integer storyId, Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, storyId, CHARACTERS, queryParams);
        return getCharacterResponse(response);
    }

    @Override
    public Result<Comic> getStoryComics(Integer storyId, Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, storyId, COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Creator> getStoryCreators(Integer storyId, Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, storyId, CREATORS, queryParams);
        return getCreatorResponse(response);
    }

    @Override
    public Result<Event> getStoryEvents(Integer storyId, Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, storyId, EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Series> getStorySeries(Integer storyId, Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, storyId, SERIES, queryParams);
        return getSeriesResponse(response);
    }

    @Override
    public Result<Comic> getComics(Map<String, Object> queryParams) {
        Response response = executeRequest(COMICS, queryParams);
        return getComicResponse(response);
    }

    @Override
    public Result<Character> getCharacters(Map<String, Object> queryParams) {
        Response response = executeRequest(CHARACTERS, queryParams);
        return getCharacterResponse(response);
    }

    @Override
    public Result<Creator> getCreators(Map<String, Object> queryParams) {
        Response response = executeRequest(CREATORS, queryParams);
        return getCreatorResponse(response);
    }


    @Override
    public Result<Event> getEvents(Map<String, Object> queryParams) {
        Response response = executeRequest(EVENTS, queryParams);
        return getEventResponse(response);
    }

    @Override
    public Result<Series> getSeries(Map<String, Object> queryParams) {
        Response response = executeRequest(SERIES, queryParams);
        return getSeriesResponse(response);
    }

    @Override
    public Result<Story> getStories(Map<String, Object> queryParams) {
        Response response = executeRequest(STORIES, queryParams);
        return getStoryResponse(response);
    }

    private Client(String publicKey,String privateKey) {
        this.publicKey=publicKey;
        this.privateKey=privateKey;

        ClientConfig config = new ClientConfig();
        javax.ws.rs.client.Client client = ClientBuilder.newClient(config);
        baseTarget = client.target(baseUrl);
        encoder = new URLCodec(CharEncoding.UTF_8);
        gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializer()).create();
    }

    private Response executeRequest(String resource, String subPath) {
        WebTarget baseRequest = buildBaseRequest(resource, Collections.EMPTY_MAP);
        Response response = baseRequest.
                path(subPath).
                request(MediaType.APPLICATION_JSON_TYPE).
                get(Response.class);
        return response;
    }

    private Response executeRequest(String resource, Integer id, String subPath, Map<String, Object> queryParams) {
        WebTarget baseRequest = buildBaseRequest(resource, queryParams);
        Response response = baseRequest.
                path(id.toString()).
                path(subPath).
                request(MediaType.APPLICATION_JSON_TYPE).
                get(Response.class);
        return response;
    }

    private Response executeRequest(String resource, Map<String, Object> queryParams) {
        WebTarget baseRequest = buildBaseRequest(resource, queryParams);

        Response response = baseRequest.
                request(MediaType.APPLICATION_JSON_TYPE).
                get(Response.class);
        return response;
    }

    private WebTarget buildBaseRequest(String resource, Map<String, Object> queryParams) {
        Long currentTime = DateTimeUtils.currentTimeMillis();
        byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + getPrivateKey() + getPublicKey());
        final String result = new String(Hex.encodeHex(hash));
        WebTarget baseRequest = baseTarget.path(version).
                path("public").
                path(resource).
                queryParam("ts", currentTime).
                queryParam("apikey", publicKey).
                queryParam("hash", result);
        if (queryParams != null) {
            for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                try {
                    baseRequest = baseRequest.queryParam(entry.getKey(), encoder.encode(entry.getValue().toString()));
                } catch (EncoderException e) {
                    throw new RuntimeException("Could not encode query parameter value: " + entry.getValue(), e);
                }
            }
        }
        return baseRequest;
    }

    private Result<Character> getCharacterResponse(Response response) {
        return getResponseWithToken(response, new TypeToken<Result<Character>>() { }.getType());
    }

    private Result<Comic> getComicResponse(Response response) {
        return getResponseWithToken(response, new TypeToken<Result<Comic>>() { }.getType());
    }

    private Result<Creator> getCreatorResponse(Response response) {
        return getResponseWithToken(response, new TypeToken<Result<Creator>>() { }.getType());
    }

    private Result<Story> getStoryResponse(Response response) {
        return getResponseWithToken(response, new TypeToken<Result<Story>>() { }.getType());
    }

    private Result<Event> getEventResponse(Response response) {
        return getResponseWithToken(response, new TypeToken<Result<Event>>() { }.getType());
    }

    private Result<Series> getSeriesResponse(Response response) {
        return getResponseWithToken(response,new TypeToken<Result<Series>>() { }.getType());
    }

    private <T extends BaseEntity> Result<T> getResponseWithToken(Response response,Type token ) {
        String entity = response.readEntity(String.class);
        logger.debug(entity);
        return gson.fromJson(entity, token);
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    private static final String[] DATE_FORMATS = new String[] {
            "yyyy-MM-dd'T'HH:mm:ssZ",
            "yyyy-MM-dd HH:mm:ss"
    };

    private class DateSerializer implements JsonDeserializer<Date> {

        @Override
        public Date deserialize(JsonElement jsonElement, Type typeOF,
                JsonDeserializationContext context) throws JsonParseException {
            for (String format : DATE_FORMATS) {
                try {
                    return new SimpleDateFormat(format, Locale.US).parse(jsonElement.getAsString());
                } catch (ParseException e) {
                }
            }
            throw new JsonParseException("Unparseable date: \"" + jsonElement.getAsString()
                    + "\". Supported formats: " + Arrays.toString(DATE_FORMATS));
        }
    }
}
