package com.pcab.marvel.model;

/**
 * Images are represented as a partial path and an extension. See the guide to images for information about how to construct full paths to image files.
 */
public class Image {

    /**
     * The directory path of to the image.
     */
    private String path;

    /**
     * The file extension for the image.
     */
    private String extension;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
