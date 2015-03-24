package com.pcab.marvel.model.comic;

/**
 * This enum represents all the possible format types for a comic.
 *
 * @since 1.0.0
 */
public enum FormatType {
    COMIC("comic"),
    COLLECTION("collection");

    private FormatType(String value){
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
