package com.pcab.marvel.model;

/**
 * Character resource representation.
 */
public class Character extends BaseEntity{

    /**
     * The name of the character.
     */
    private String name;

    /**
     * A short bio or description of the character.
     */
    private String description;

    /**
     * A resource list containing comics which feature this character.
     */
    private ResourceList<Summary> comics;

    /**
     * A resource list of stories in which this character appears.
     */
    private ResourceList<TypeSummary> stories;

    /**
     * A resource list of events in which this character appears.
     */
    private ResourceList<Summary> events;

    /**
     * A resource list of series in which this character appears.
     */
    private ResourceList<Summary> series;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ResourceList<Summary> getEvents() {
        return events;
    }

    public void setEvents(ResourceList<Summary> events) {
        this.events = events;
    }

    public ResourceList<Summary> getSeries() {
        return series;
    }

    public void setSeries(ResourceList<Summary> series) {
        this.series = series;
    }
}
