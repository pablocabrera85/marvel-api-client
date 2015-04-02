package com.pcab.marvel.model.common;

/**
 * This enum represents all the Date options supported for query parameters.
 */
public enum DateDescriptor {
    LAST_WEEK("lastWeek"),
    THIS_WEEK("thisWeek"),
    NEXT_WEEK("nextWeek"),
    THIS_MONTH("thisMonth");

    private DateDescriptor(String value){
        this.value = value;
    }

    private String value;

    /**
     * Retrieves the string value that can be used as a query parameter value
     *
     * @return String representation of the value
     */
    public String getValue(){
        return value;
    }
}
