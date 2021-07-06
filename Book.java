package com.example;

public class Book {
    private int BookID;
    private String BookTitle;

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", BookTitle='" + BookTitle + '\'' +
                '}';
    }
}
