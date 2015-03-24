package com.pcab.marvel.model;

/**
 * Base Object for all elements that need a type identifier.
 */
public class BaseObject {

    /**
     * A text identifier for the Object.
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
