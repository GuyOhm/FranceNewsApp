package com.example.android.francenewsapp;

/**
 * Represent a News object. It contains : article title, name of section, url to article
 */

public class News {

    // String value for title of the article
    private String newsTitle;

    // String value for the section the article belongs to
    private String newsSection;

    // String value for url to the article webpage
    private String newsUrl;

    /**
     * Constructor of a News object with initial value for title, section and
     * url of the article
     *
     * @param newsTitle   Title of the news article
     * @param newsSection Section of the news article
     * @param newsUrl     URL to the news article webpage
     */
    public News(String newsTitle, String newsSection, String newsUrl) {
        this.newsTitle = newsTitle;
        this.newsSection = newsSection;
        this.newsUrl = newsUrl;
    }

    /**
     * get the value for article title
     *
     * @return String for title
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * get the value for article section
     *
     * @return String for section
     */
    public String getNewsSection() {
        return newsSection;
    }

    /**
     * get the value for article url
     *
     * @return String for url
     */
    public String getNewsUrl() {
        return newsUrl;
    }
}
