package com.pcab.marvel.model;

/**
 * Created by Mulesoft.
 */
public class Story extends BaseEntity {

    /**
     * The story title.
     */
    private String title;

    /**
     * A short description of the story.
     */
    private String description;

    /**
     * The story type e.g. interior story, cover, text story.
     */
    private String type;

    /**
     * A resource list containing comics in which this story takes place.
     */
    private ResourceList<Summary> comics;

    /**
     * A resource list containing series in which this story appears.
     */
    private ResourceList<TypeSummary> series;

    /**
     * A resource list of the events in which this story appears.
     */
    private ResourceList<Summary> events;

    /**
     * A resource list of characters which appear in this story.
     */
    private ResourceList<RoleSummary> characters;

    /**
     * A resource list of creators who worked on this story.
     */
    private ResourceList<RoleSummary> creators;

    /**
     * A summary representation of the issue in which this story was originally published.
     */
    private Summary originalissue;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceList<Summary> getComics() {
        return comics;
    }

    public void setComics(ResourceList<Summary> comics) {
        this.comics = comics;
    }

    public ResourceList<TypeSummary> getSeries() {
        return series;
    }

    public void setSeries(ResourceList<TypeSummary> series) {
        this.series = series;
    }

    public ResourceList<Summary> getEvents() {
        return events;
    }

    public void setEvents(ResourceList<Summary> events) {
        this.events = events;
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

    public Summary getOriginalissue() {
        return originalissue;
    }

    public void setOriginalissue(Summary originalissue) {
        this.originalissue = originalissue;
    }
}
