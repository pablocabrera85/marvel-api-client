package com.pcab.marvel;

import com.pcab.marvel.model.*;
import com.pcab.marvel.model.Character;
import com.pcab.marvel.model.common.QueryParam;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test API client calls.
 */
public class ClientTest {

    IMarvelAPI client;
    @Before
    public void init(){
        //You need to define this system properties in order to run the tests.
        String publicKey = System.getProperty("marvel.public.key");
        String privateKey = System.getProperty("marvel.private.key");

        client = Client.newInstance(publicKey,privateKey);
    }
    @Test
    public void getComics(){
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put(QueryParam.TITLE.getName(),"Ant-Man");
        Result<Comic> comics=client.getComics(queryParams);
        assertNotNull(comics);
        assertEquals(Integer.valueOf(200), comics.getCode());
        comics=client.getComic(comics.getData().getResults().get(0).getId());
        assertEquals(Integer.valueOf(200), comics.getCode());
    }

    @Test
    public void getCharacters(){
        Result<Character> characters=client.getCharacters(Collections.EMPTY_MAP);
        assertNotNull(characters);
        assertEquals(Integer.valueOf(200), characters.getCode());
        characters=client.getCharacter(characters.getData().getResults().get(0).getId());
        assertEquals(Integer.valueOf(200), characters.getCode());

        Result<Comic> comics=client.getCharacterComics(characters.getData().getResults().get(0).getId(),null);
        assertEquals(Integer.valueOf(200), comics.getCode());
    }

    @Test
    public void getCreators(){
        Result<Creator> creators=client.getCreators(Collections.EMPTY_MAP);
        assertNotNull(creators);
        assertEquals(Integer.valueOf(200), creators.getCode());
        creators=client.getCreator(creators.getData().getResults().get(0).getId());
        assertEquals(Integer.valueOf(200), creators.getCode());
    }

    @Test
    public void getEvents(){
        Result<Event> creators=client.getEvents(null);
        assertNotNull(creators);
        assertEquals(Integer.valueOf(200), creators.getCode());
    }

    @Test
    public void getSeries(){
        Result<Series> creators=client.getSeries(Collections.EMPTY_MAP);
        assertNotNull(creators);
        assertEquals(Integer.valueOf(200), creators.getCode());
    }

    @Test
    public void getStories(){
        Result<Story> stories=client.getStories(Collections.EMPTY_MAP);
        assertNotNull(stories);
        assertEquals(Integer.valueOf(200), stories.getCode());
    }
}
