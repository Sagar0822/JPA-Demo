package com.platinum.jpademo1;

import javax.persistence.*;

//CHILD CLASS
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(nullable = false)  //this column not null
    private String title;
    private int price;

    @ManyToOne
    @JoinColumn
    Author author;

    public Books(){

    }

    public Books(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
