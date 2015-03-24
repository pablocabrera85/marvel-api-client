package com.pcab.marvel.model;

/**
 * Series resource representation.
 */
public class Series extends BaseEntity{

    /**
     * The canonical title of the series.
     */
    private String title;

    /**
     * A description of the series.
     */
    private String description;

    /**
     * The first year of publication for the series.
     */
    private Integer startYear;

    /**
     * The last year of publication for the series (conventionally, 2099 for ongoing series).
     */
    private Integer endYear;

    /**
     * The age-appropriateness rating for the series.
     */
    private String rating;

    /**
     * A resource list containing comics in this series.
     */
    private ResourceList<Summary> comics;

    /**
     * A resource list containing stories which occur in comics in this series.
     */
    private ResourceList<TypeSummary> stories;

    /**
     * A resource list containing events which take place in comics in this series.
     */
    private ResourceList<Summary> events;

    /**
     * A resource list containing characters which appear in comics in this series.
     */
    private ResourceList<RoleSummary> characters;

    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    private ResourceList<RoleSummary> creators;

    /**
     * A summary representation of the series which follows this series.
     */
    private Summary next;

    /**
     * A summary representation of the series which preceded this series.
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

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ResourceList<Summary> getEvents() {
        return events;
    }

    public void setEvents(ResourceList<Summary> events) {
        this.events = events;
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
