package com.pcab.marvel;

import com.pcab.marvel.model.*;
import com.pcab.marvel.model.Character;

import java.util.Map;

/**
 * Marvel API Interface.
 * <p>
 * To read the full documentation visit <a href="http://developer.marvel.com/">Marvel Developer Portal</a>.
 * </p>
 */
public interface IMarvelAPI {

    /**
     * Fetches lists of characters.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Return only characters matching the specified full character name (e.g. Spider-Man).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return characters with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only characters which appear in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only characters which appear the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only characters which appear in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only characters which appear the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getCharacters(Map<String, Object> queryParams);

    /**
     * Fetches a single character by id.
     *
     * @param characterId A single character id.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getCharacter(Integer characterId);

    /**
     * Fetches lists of comics filtered by a character id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param characterId The character id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getCharacterComics(Integer characterId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events filtered by a character id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param characterId The character id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getCharacterEvents(Integer characterId, Map<String, Object> queryParams);

    /**
     * Fetches lists of series filtered by a character id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Filter by series title.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return series with titles that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only series matching the specified start year.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only series which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only series which contain the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only series which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only series which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES_TYPE}: Filter the series by publication frequency type. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#COLLECTION}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ONE_SHOT}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#LIMITED}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ON_GOING}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param characterId The character id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getCharacterSeries(Integer characterId, Map<String, Object> queryParams);

    /**
     * Fetches lists of stories filtered by a character id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param characterId The character id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getCharacterStories(Integer characterId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comics with optional filters. See notes on individual parameters below.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getComics(Map<String, Object> queryParams);

    /**
     * Fetches a single comic resource.
     *
     * @param comicId A single comic.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getComic(Integer comicId);

    /**
     * Fetches lists of characters filtered by a comic id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Return only characters matching the specified full character name (e.g. Spider-Man).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return characters with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only characters which appear in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only characters which appear the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only characters which appear in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only characters which appear the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param comicId A single comic.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getComicCharacters(Integer comicId, Map<String, Object> queryParams);

    /**
     * Fetches lists of creators filtered by a comic id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME}: Filter by creator first name (e.g. Brian).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME}: Filter by creator middle name (e.g. Michael).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME}: Filter by creator last name (e.g. Bendis).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SUFFIX}: Filter by suffix or honorific (e.g. Jr., Sr.).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Filter by creator names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME_STARTS_WITH}: Filter by creator first names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME_STARTS_WITH}: Filter by creator middle names that match critera (e.g. Mi).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME_STARTS_WITH}: Filter by creator last names that match critera (e.g. Ben).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only creators which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only creators who worked on the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param comicId A single comic.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getComicCreators(Integer comicId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events filtered by a comic id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param comicId A single comic.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getComicEvents(Integer comicId, Map<String, Object> queryParams);

    /**
     * Fetches lists of stories filtered by a comic id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param comicId A single comic.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getComicStories(Integer comicId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME}: Filter by creator first name (e.g. Brian).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME}: Filter by creator middle name (e.g. Michael).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME}: Filter by creator last name (e.g. Bendis).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SUFFIX}: Filter by suffix or honorific (e.g. Jr., Sr.).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Filter by creator names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME_STARTS_WITH}: Filter by creator first names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME_STARTS_WITH}: Filter by creator middle names that match critera (e.g. Mi).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME_STARTS_WITH}: Filter by creator last names that match critera (e.g. Ben).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only creators which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only creators who worked on the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getCreators(Map<String, Object> queryParams);

    /**
     * Fetches a single creator by id.
     *
     * @param creatorId A single creator id.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getCreator(Integer creatorId);

    /**
     * Fetches lists of comics filtered by a creator id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param creatorId A single creator id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getCreatorComics(Integer creatorId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events filtered by a creator id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param creatorId A single creator id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getCreatorEvents(Integer creatorId, Map<String, Object> queryParams);

    /**
     * Fetches lists of series filtered by a creator id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Filter by series title.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return series with titles that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only series matching the specified start year.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only series which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only series which contain the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only series which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only series which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES_TYPE}: Filter the series by publication frequency type. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#COLLECTION}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ONE_SHOT}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#LIMITED}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ON_GOING}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param creatorId A single creator id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getCreatorSeries(Integer creatorId, Map<String, Object> queryParams);

    /**
     * Fetches lists of stories filtered by a creator id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param creatorId A single creator id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getCreatorStories(Integer creatorId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events with optional filters. See notes on individual parameters below.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getEvents(Map<String, Object> queryParams);

    /**
     * Fetches a single event by id.
     *
     * @param eventId A single event Id.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getEvent(Integer eventId);

    /**
     * Fetches lists of characters filtered by an event id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Return only characters matching the specified full character name (e.g. Spider-Man).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return characters with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only characters which appear in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only characters which appear the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only characters which appear in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only characters which appear the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param eventId A single event Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getEventCharacters(Integer eventId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comics filtered by an event id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param eventId A single event Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getEventComics(Integer eventId, Map<String, Object> queryParams);

    /**
     * Fetches lists of creators filtered by an event id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME}: Filter by creator first name (e.g. Brian).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME}: Filter by creator middle name (e.g. Michael).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME}: Filter by creator last name (e.g. Bendis).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SUFFIX}: Filter by suffix or honorific (e.g. Jr., Sr.).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Filter by creator names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME_STARTS_WITH}: Filter by creator first names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME_STARTS_WITH}: Filter by creator middle names that match critera (e.g. Mi).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME_STARTS_WITH}: Filter by creator last names that match critera (e.g. Ben).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only creators which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only creators who worked on the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param eventId A single event Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getEventCreators(Integer eventId, Map<String, Object> queryParams);

    /**
     * Fetches lists of series filtered by an event id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Filter by series title.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return series with titles that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only series matching the specified start year.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only series which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only series which contain the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only series which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only series which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES_TYPE}: Filter the series by publication frequency type. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#COLLECTION}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ONE_SHOT}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#LIMITED}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ON_GOING}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param eventId A single event Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getEventSeries(Integer eventId, Map<String, Object> queryParams);

    /**
     * Fetches lists of stories filtered by an event id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param eventId A single event Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getEventStories(Integer eventId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comic series with optional filters. See notes on individual parameters below.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Filter by series title.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return series with titles that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only series matching the specified start year.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only series which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only series which contain the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only series which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only series which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES_TYPE}: Filter the series by publication frequency type. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#COLLECTION}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ONE_SHOT}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#LIMITED}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ON_GOING}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getSeries(Map<String, Object> queryParams);

    /**
     * Fetches a single comic series by id.
     *
     * @param seriesId A single series Id.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getSeries(Integer seriesId);

    /**
     * Fetches lists of characters filtered by a series id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Return only characters matching the specified full character name (e.g. Spider-Man).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return characters with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only characters which appear in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only characters which appear the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only characters which appear in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only characters which appear the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param seriesId A single series Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getSeriesCharacters(Integer seriesId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comics filtered by a series id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param seriesId A single series Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getSeriesComics(Integer seriesId, Map<String, Object> queryParams);

    /**
     * Fetches lists of creators filtered by a series id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME}: Filter by creator first name (e.g. Brian).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME}: Filter by creator middle name (e.g. Michael).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME}: Filter by creator last name (e.g. Bendis).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SUFFIX}: Filter by suffix or honorific (e.g. Jr., Sr.).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Filter by creator names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME_STARTS_WITH}: Filter by creator first names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME_STARTS_WITH}: Filter by creator middle names that match critera (e.g. Mi).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME_STARTS_WITH}: Filter by creator last names that match critera (e.g. Ben).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only creators which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only creators who worked on the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param seriesId A single series Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getSeriesCreators(Integer seriesId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events filtered by a series id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param seriesId A single series Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getSeriesEvents(Integer seriesId, Map<String, Object> queryParams);

    /**
     * Fetches lists of stories filtered by a series id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param seriesId A single series Id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getSeriesStories(Integer seriesId, Map<String, Object> queryParams);
    /**
     * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only stories which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only stories contained in the specified (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only stories contained the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only stories which take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ID_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getStories(Map<String, Object> queryParams);

    /**
     * Fetches a single comic story by id.
     *
     * @param storyId A single story id.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Story> getStory(Integer storyId);

    /**
     * Fetches lists of characters filtered by a story id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Return only characters matching the specified full character name (e.g. Spider-Man).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return characters with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only characters which appear in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only characters which appear the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only characters which appear in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only characters which appear the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param storyId A single story id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Character> getStoryCharacters(Integer storyId, Map<String, Object> queryParams);

    /**
     * Fetches lists of comics filtered by a story id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT}: Filter by the issue format (e.g. comic, digital comic, hardcover).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FORMAT_TYPE}: Filter by the issue format type (comic or collection).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NO_VARIANTES}: Exclude variant comics from the result set.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_DESCRIPTOR}: Return comics within a predefined date range.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DATE_RANGE}: Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02). Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Return only issues in series whose title matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return only issues in series whose title starts with the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only issues in series whose start year matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSUE_NUMBER}: Return only issues in series whose issue number matches the input.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIAMOND_CODE}: Filter by diamond code.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#DIGITAL_ID}: Filter by digital comic id.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#UPC}: Filter by UPC.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISBN}: Filter by ISBN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EAN}: Filter by EAN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ISSN}: Filter by ISSN.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#HAS_DIGITAL_ISSUE}: Include only results which are available digitally.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only characters which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only comics which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only comics which take place in the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only comics which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SHARED_APPEARANCES}: Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COLLABORATORS}: Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FOC_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ON_SALE_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#ISSUE_NUMBER_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param storyId A single story id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Comic> getStoryComics(Integer storyId, Map<String, Object> queryParams);

    /**
     * Fetches lists of creators filtered by a story id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME}: Filter by creator first name (e.g. Brian).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME}: Filter by creator middle name (e.g. Michael).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME}: Filter by creator last name (e.g. Bendis).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SUFFIX}: Filter by suffix or honorific (e.g. Jr., Sr.).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Filter by creator names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#FIRST_NAME_STARTS_WITH}: Filter by creator first names that match critera (e.g. B, St L).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MIDDLE_NAME_STARTS_WITH}: Filter by creator middle names that match critera (e.g. Mi).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LAST_NAME_STARTS_WITH}: Filter by creator last names that match critera (e.g. Ben).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only creators which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only creators who worked on the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only creators who worked on the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#LAST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#FIRST_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MIDDLE_NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#SUFFIX_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param storyId A single story id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Creator> getStoryCreators(Integer storyId, Map<String, Object> queryParams);

    /**
     * Fetches lists of events filtered by a story id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME}: Filter the event list by name.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#NAME_STARTS_WITH}: Return events with names that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only events which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only events which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES}: Return only events which are part of the specified series (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only events which take place in the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only events which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#NAME_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_DATE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param storyId A single story id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Event> getStoryEvents(Integer storyId, Map<String, Object> queryParams);

    /**
     * Fetches lists of series filtered by a story id.
     * <p>
     * Supported parameters are:
     * <ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE}: Filter by series title.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#TITLE_STARTS_WITH}: Return series with titles that begin with the specified string (e.g. Sp).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#START_YEAR}: Return only series matching the specified start year.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#MODIFIED_SINCE}: Return only series which have been modified since the specified date.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#COMICS}: Return only series which contain the specified comics (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#STORIES}: Return only series which contain the specified stories (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#EVENTS}: Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#CREATORS}: Return only series which feature work by the specified creators (accepts a comma-separated list of ids).</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#SERIES_TYPE}: Filter the series by publication frequency type. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#COLLECTION}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ONE_SHOT}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#LIMITED}</li>
     *     <li>{@link com.pcab.marvel.model.series.PublicationFrecuencyType#ON_GOING}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#ORDER_BY}: Order the result set by a field or fields. Multiple values are given priority in the order in which they are passed. Supported fields are:</li>
     * <ul>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#TITLE_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#START_YEAR_DESC}</li>
     *     <li>{@link com.pcab.marvel.model.common.OrderBy#MODIFIED_DESC}</li>
     * </ul>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#LIMIT}: Limit the result set to the specified number of resources.</li>
     * <li>{@link com.pcab.marvel.model.common.QueryParam#OFFSET}: Skip the specified number of resources in the result set.</li>
     * </ul>
     * </p>
     * @param storyId A single story id.
     * @param queryParams Map containing the query parameters.
     * @return The {@link com.pcab.marvel.model.Result} of the request.
     */
    Result<Series> getStorySeries(Integer storyId, Map<String, Object> queryParams);
}
