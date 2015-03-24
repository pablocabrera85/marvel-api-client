package com.pcab.marvel.model.common;

/**
 * This enum just contains all the supported Order By clauses, check each request documentation to see the supported ones.
 *
 * @since 1.0.0
 */
public enum OrderBy {
    ID("id"),
    ID_DESC("-id"),
    NAME("name"),
    NAME_DESC("-name"),
    MODIFIED("modified"),
    MODIFIED_DESC("-modified"),
    FOC_DATE("focDate"),
    FOC_DATE_DESC("-focDate"),
    ON_SALE_DATE("onsaleDate"),
    ON_SALE_DATE_DESC("-onsaleDate"),
    TITLE("title"),
    TITLE_DESC("-title"),
    ISSUE_NUMBER("issueNumber"),
    ISSUE_NUMBER_DESC("-issueNumber"),
    START_DATE("startDate"),
    START_DATE_DESC("-  startDate"),
    START_YEAR("startYear"),
    START_YEAR_DESC("-startYear"),
    LAST_NAME("lastName"),
    LAST_NAME_DESC("-lastName"),
    FIRST_NAME("firstName"),
    FIRST_NAME_DESC("-firstName"),
    MIDDLE_NAME("middleName"),
    MIDDLE_NAME_DESC("-middleName"),
    SUFFIX("suffix"),
    SUFFIX_DESC("-suffix"),;

    private OrderBy(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
