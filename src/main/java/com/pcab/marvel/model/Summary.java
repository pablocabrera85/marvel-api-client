package com.pcab.marvel.model;

/**
 * Summary
 */
public class Summary {

    /**
     * The path to the individual resource,
     */
    private String resourceURI;

    /**
     * The name associated to the resourceURI.
     */
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
