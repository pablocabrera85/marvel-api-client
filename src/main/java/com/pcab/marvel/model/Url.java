package com.pcab.marvel.model;

/**
 * URLs are references to web pages or deep links into applications. (When present in a resultset, it is preferred that you use these to link back to Marvel.)
 * <p>Many resources will have more than one representation on the web so URLs are generally presented as an array of URL resources.</p>
 */
public class Url extends BaseObject{

    /**
     * A full URL (including scheme, domain, and path).
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
