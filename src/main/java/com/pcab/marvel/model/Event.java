package com.pcab.marvel.model;

import java.util.Date;

/**
 * Event resource representation.
 */
public class Event extends BaseEntity {

    /**
     * The title of the event.
     */
    private String title;

    /**
     * A description of the event.
     */
    private String description;

    /**
     * The date of publication of the first issue in this event.
     */
    private Date start;

    /**
     * The date of publication of the last issue in this event.
     */
    private Date end;

    /**
     * A resource list containing the comics in this event.
     */
    private ResourceList<Summary> comics;

    /**
     * A resource list containing the stories in this event.
     */
    private ResourceList<TypeSummary> stories;

    /**
     * A resource list containing the series in this event.
     */
    private ResourceList<Summary> series;

    /**
     * A resource list containing the characters which appear in this event.
     */
    private ResourceList<RoleSummary> characters;

    /**
     * A resource list containing creators whose work appears in this event.
     */
    private ResourceList<RoleSummary> creators;

    /**
     * A summary representation of the event which follows this event.
     */
    private Summary next;

    /**
     * A summary representation of the event which preceded this event.
     */
    private Summary previous;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public ResourceList<Summary> getComics() {
        return comics;
    }

    public void setComics(ResourceList<Summary> comics) {
        this.comics = comics;
    }

    public ResourceList<TypeSummary> getStories() {
        return stories;
    }

    public void setStories(ResourceList<TypeSummary> stories) {
        this.stories = stories;
    }

    public ResourceList<Summary> getSeries() {
        return series;
    }

    public void setSeries(ResourceList<Summary> series) {
        this.series = series;
    }

    public ResourceList<RoleSummary> getCharacters() {
        return characters;
    }

    public void setCharacters(ResourceList<RoleSummary> characters) {
        this.characters = characters;
    }

    public ResourceList<RoleSummary> getCreators() {
        return creators;
    }

    public void setCreators(ResourceList<RoleSummary> creators) {
        this.creators = creators;
    }

    public Summary getNext() {
        return next;
    }

    public void setNext(Summary next) {
        this.next = next;
    }

    public Summary getPrevious() {
        return previous;
    }

    public void setPrevious(Summary previous) {
        this.previous = previous;
    }
}
