package com.pcab.marvel.model.comic;

/**
 * This enum represents all the possible comic formats supported.
 */
public enum Format {
    COMIC("comic"),
    MAGAZINE("magazine"),
    TRADE_PAPERBACK("trade paperback"),
    HARDCOVER("hardcover"),
    DIGEST("digest"),
    GRAPHIC_NOVEL("graphic novel"),
    DIGITAL_COMIC("digital comic"),
    INFINITE_COMIC("infinite comic");

    private Format(String value){
        this.value = value;
    }

    private String value;

    /**
     * Retrieves the string value that can be used as a query parameter value
     *
     * @return String representation of the value
     */
    public String getValue(){
        return value;
    }
}
