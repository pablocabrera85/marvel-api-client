package com.pcab.marvel.model;

/**
 * Creator resource representation.
 */
public class Creator extends BaseEntity {

    /**
     * The first name of the creator.
     */
    private String firstName;

    /**
     * The middle name of the creator.
     */
    private String middleName;

    /**
     * The last name of the creator.
     */
    private String lastName;

    /**
     * The suffix or honorific for the creator.
     */
    private String suffix;

    /**
     * The full name of the creator (a space-separated concatenation of the above four fields).
     */
    private String fullName;

    /**
     * A resource list containing the comics which feature work by this creator.
     */
    private ResourceList<Summary> comics;

    /**
     * A resource list containing the stories which feature work by this creator.
     */
    private ResourceList<TypeSummary> stories;

    /**
     * A resource list containing the series which feature work by this creator.
     */
    private ResourceList<Summary> series;

    /**
     * A resource list containing the events which feature work by this creator.
     */
    private ResourceList<Summary> events;

    public ResourceList<Summary> getEvents() {
        return events;
    }

    public void setEvents(ResourceList<Summary> events) {
        this.events = events;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
}
