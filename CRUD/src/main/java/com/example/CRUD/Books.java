package com.example.CRUD;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Books
{
    //Defining book id as primary key
    @Id
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;


    //if using a constructor use method shown below
//    public class Books(int bookid,String bookname, String author,int price){
//        this.bookid=bookid;
//        this.bookname=bookname;
//        this.authord=author;
//        this.price=price;
//    }
//    public int getBookid()
//    {
//        return bookid;
//    }
//    public void setBookid(int bookid)
//    {
//        this.bookid = bookid;
//    }
//    public String getBookname()
//    {
//        return bookname;
//    }
//    public void setBookname(String bookname)
//    {
//        this.bookname = bookname;
//    }
//    public String getAuthor()
//    {
//        return author;
//    }
//    public void setAuthor(String author)
//    {
//        this.author = author;
//    }
//    public int getPrice()
//    {
//        return price;
//    }
//    public void setPrice(int price)
//    {
//        this.price = price;
//    }
}  