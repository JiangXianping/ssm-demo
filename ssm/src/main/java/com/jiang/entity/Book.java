package com.jiang.entity;

import java.util.Date;

public class Book {
    private String bookCode;

    private String bookName;

    private String bookAuthor;

    private String bookPublishing;

    private Date bookPublicationDate;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode == null ? null : bookCode.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookPublishing() {
        return bookPublishing;
    }

    public void setBookPublishing(String bookPublishing) {
        this.bookPublishing = bookPublishing == null ? null : bookPublishing.trim();
    }

    public Date getBookPublicationDate() {
        return bookPublicationDate;
    }

    public void setBookPublicationDate(Date bookPublicationDate) {
        this.bookPublicationDate = bookPublicationDate;
    }
}