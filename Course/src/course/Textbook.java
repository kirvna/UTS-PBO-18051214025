/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author HP
 */
public class Textbook {
    String title, author, publisher;

//    Constructor
    public Textbook(String textTitle, String author, String pub){
        this.title = textTitle;
        this.author = author;
        this.publisher = pub;
    }
    public Textbook(TextBook object2){
        this.title = object2.title;
        this.author = object2.author;
        this.publisher = object2.publisher;
    }
//    Methods
    public void set(String textTitle, String auth, String pub){
        this.title = textTitle;
        this.author = auth;
        this.publisher = pub;
    }

    public String toString(){
        String str = "Text Book Title : " + this.title + "\n";
        str += "Author : " + this.author + "\n";
        str += "Publisher : " + this.publisher;
        return str;
    }
}

