package com.pcab.marvel.model;

/**
 * Text objects are bits of descriptive text which are attached to an entity.
 */
public class Text extends BaseObject{

    /**
     * A language code denoting which language the text object is written in.
     */
    private String language;

    /**
     * The text of the text object.
     */
    private String text;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
