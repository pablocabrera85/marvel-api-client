package com.pcab.marvel.model.common;

/**
 * This class is just a helper class to get the supported query parameters.
 * <p>In order to get the string value just use the {@link com.pcab.marvel.model.common.QueryParam#getName} method.</p>
 * @since 1.0.0
 */
public enum QueryParam {
    NAME("name"),
    NAME_STARTS_WITH("nameStartsWith"),
    MODIFIED_SINCE("modifiedSince"),

    FIRST_NAME("firstName"),
    MIDDLE_NAME("middleName"),
    LAST_NAME("lastName"),
    SUFFIX("suffix"),
    FIRST_NAME_STARTS_WITH("firstNameStartsWith"),
    MIDDLE_NAME_STARTS_WITH("middleNameStartsWith"),
    LAST_NAME_STARTS_WITH("lastNameStartsWith"),

    COMICS("comics"),
    CREATORS("creators"),
    EVENTS("events"),
    SERIES("series"),
    STORIES("stories"),
    /**
     * Values can be assigned from {@link com.pcab.marvel.model.common.OrderBy}
     */
    ORDER_BY("orderBy"),
    TITLE("title"),
    TITLE_STARTS_WITH("titleStartsWith"),
    /**
     * Values can be assigned from {@link com.pcab.marvel.model.comic.Format}
     */
    FORMAT("format"),
    /**
     * Values can be assigned from {@link com.pcab.marvel.model.comic.FormatType}
     */
    FORMAT_TYPE("formatType"),
    /**
     * Only accepts TRUE boolean value
     */
    NO_VARIANTES("noVariants"),
    ISSUE_NUMBER("issueNumber"),
    DIAMOND_CODE("diamondCode"),
    DIGITAL_ID("digitalId"),
    UPC("upc"),
    ISBN("isbn"),
    EAN("ean"),
    ISSN("issn"),
    /**
     * Only accepts TRUE boolean value
     */
    HAS_DIGITAL_ISSUE("hasDigitalIssue"),
    SHARED_APPEARANCES("sharedAppearances"),
    COLLABORATORS("collaborators"),
    SERIES_TYPE("seriesType"),
    CONTAINS("contains"),
    /**
     * Values can be assigned from {@link com.pcab.marvel.model.common.DateDescriptor}
     */

    DATE_DESCRIPTOR("dateDescriptor"),
    DATE_RANGE("dateRange"),
    START_YEAR("startYear"),
    OFFSET("offset"),
    LIMIT("limit");

    private QueryParam(String name){
        this.name = name;
    }

    private String name;

    /**
     * Retrieves the string query parameter name.
     *
     * @return String representation of the name of the query parameter.
     */
    public String getName(){
        return name;
    }

}
