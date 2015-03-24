package com.pcab.marvel.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Result of the API request.</p>
 * <p>Results returned by the API endpoints have the same general format, no matter which entity type the endpoint returns.</p>
 * <p>Every successful call will return a wrapper object, which contains metadata about the call and a container object, which displays pagination information and an array of the results returned by this call.</p>
 * <p>This pattern is consistent even if you are requesting a single object.</p>
 */
@XmlRootElement
public class Result<T> {

    /**
     * The HTTP status code of the returned result
     */
    private Integer code;

    /**
     * A string description of the call status
     */
    private String status;

    /**
     * The copyright notice for the returned result
     */
    private String copyright;

    /**
     * The attribution notice for this result
     */
    private String attributionText;

    /**
     * An HTML representation of the attribution notice for this result
     */
    private String attributionHTML;

    /**
     * A digest value of the content
     */
    private String etag;

    /**
     * The results returned by the call
     */
    private DataContainer<T> data;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public DataContainer<T> getData() {
        return data;
    }

    public void setData(DataContainer<T> data) {
        this.data = data;
    }

}
