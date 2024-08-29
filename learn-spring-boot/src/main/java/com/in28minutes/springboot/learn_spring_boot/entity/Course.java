package com.in28minutes.springboot.learn_spring_boot.entity;

public class Course {
    private int id;
    private String name;
    private String author;
    public Course(int id,String name,String author){
        super();
        this.id=id;
        this.name=name;
        this.author=author;
    }
    public String getAuthor() {
        return author;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
