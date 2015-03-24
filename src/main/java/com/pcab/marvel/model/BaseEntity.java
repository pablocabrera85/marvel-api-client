package com.pcab.marvel.model;

import java.util.Date;
import java.util.List;

/**
 * Base Entity for the resources provided by the API.
 */
public abstract class BaseEntity {

    /**
     * The unique ID of the character resource.
     */
    private Integer id;

    /**
     * Resource URIs are references to the representation of a resource within the API.
     */
    private String resourceURI;

    /**
     * The representative image for this Entity.
     */
    private Image thumbnail;

    /**
     * The date the resource was most recently modified.
     */
    private Date modified;

    /**
     * A set of public web site URLs for the resource.
     */
    private List<Url> urls;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }
}
