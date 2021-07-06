package com.example;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop1=new BookShop();
        bookShop1.setShopName("BookShop 1");
        bookShop1.loadData();

        System.out.println(bookShop1);

        BookShop bookShop2=(BookShop) bookShop1.clone();

        bookShop2.setShopName("BookShop 2");
        System.out.println(bookShop2);


        bookShop1.getBooks().remove(2);

        System.out.println(bookShop1);
        System.out.println(bookShop2);


    }
}
