package com.pcab.marvel.model;

import java.util.List;

/**
 * Comic resource representation.
 */
public class Comic extends BaseEntity{

    /**
     * The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
     */
    private Integer digitalId;

    /**
     * The canonical title of the comic.
     */
    private String title;

    /**
     *  	The number of the issue in the series (will generally be 0 for collection formats).
     */
    private Double issueNumber;

    /**
     * If the issue is a variant (e.g. an alternate cover, second printing, or director's cut), a text description of the variant.
     */
    private String variantDescription;

    /**
     * The preferred description of the comic.
     */
    private String description;

    /**
     * The ISBN for the comic (generally only populated for collection formats).
     */
    private String isbn;

    /**
     * The UPC barcode number for the comic (generally only populated for periodical formats).
     */
    private String upc;

    /**
     * The Diamond code for the comic.
     */
    private String diamondCode;

    /**
     * The EAN barcode for the comic.
     */
    private String ean;

    /**
     * The ISSN barcode for the comic.
     */
    private String issn;

    /**
     * The publication format of the comic e.g. comic, hardcover, trade paperback.
     */
    private String format;

    /**
     * The number of story pages in the comic.
     */
    private Integer pageCount;

    /**
     * A set of descriptive text blurbs for the comic.
     */
    private List<Text> texts;

    /**
     * A summary representation of the series to which this comic belongs.
     */
    private Summary series;

    /**
     * A list of variant issues for this comic (includes the "original" issue if the current issue is a variant).
     */
    private List<Summary> variants;

    /**
     * A list of collections which include this comic (will generally be empty if the comic's format is a collection).
     */
    private List<Summary> collections;

    /**
     * A list of issues collected in this comic (will generally be empty for periodical formats such as "comic" or "magazine").
     */
    private List<Summary> collectedIssues;

    /**
     * A list of key dates for this comic.
     */
    private List<Date> dates;

    /**
     * A list of prices for this comic.
     */
    private List<Price> prices;

    /**
     * A list of promotional images associated with this comic.
     */
    private List<Image> images;

    /**
     * A resource list containing the creators associated with this comic.
     */
    private ResourceList<RoleSummary> creators;

    /**
     * A resource list containing the characters which appear in this comic.
     */
    private ResourceList<RoleSummary> characters;

    /**
     * A resource list containing the stories which appear in this comic.
     */
    private ResourceList<TypeSummary> stories;

    /**
     * A resource list containing the events in which this comic appears.
     */
    private ResourceList<Summary> events;

    public Integer getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Double issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    public Summary getSeries() {
        return series;
    }

    public void setSeries(Summary series) {
        this.series = series;
    }

    public List<Summary> getVariants() {
        return variants;
    }

    public void setVariants(List<Summary> variants) {
        this.variants = variants;
    }

    public List<Summary> getCollections() {
        return collections;
    }

    public void setCollections(List<Summary> collections) {
        this.collections = collections;
    }

    public List<Summary> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<Summary> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public ResourceList<RoleSummary> getCreators() {
        return creators;
    }

    public void setCreators(ResourceList<RoleSummary> creators) {
        this.creators = creators;
    }

    public ResourceList<RoleSummary> getCharacters() {
        return characters;
    }

    public void setCharacters(ResourceList<RoleSummary> characters) {
        this.characters = characters;
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
}
