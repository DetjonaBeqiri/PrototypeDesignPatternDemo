package com.example;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books=new ArrayList<>();

    public void loadData(){
        for(int i=1;i<=10;i++){
            Book book=new Book();
            book.setBookID(i);
            book.setBookTitle("Book " + i);
            books.add(book);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        BookShop bookShop=new BookShop();
        for(Book b :getBooks() ){
            bookShop.getBooks().add(b);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
