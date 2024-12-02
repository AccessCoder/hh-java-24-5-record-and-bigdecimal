package org.example;

import java.util.Objects;

public class BookClass {

    private final String ISBN;
    private final String title;
    private final double price;

    public BookClass(String ISBN, String title, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }



    public String getTitle() {
        return title;
    }



    public double getPrice() {
        return price;
    }



    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookClass bookClass = (BookClass) o;
        return Double.compare(price, bookClass.price) == 0 && Objects.equals(ISBN, bookClass.ISBN) && Objects.equals(title, bookClass.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, price);
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
