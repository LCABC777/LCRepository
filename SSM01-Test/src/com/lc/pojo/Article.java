package com.lc.pojo;

public class Article {
private int id;
private String name;
private String author;
private int count;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public Article() {
	super();
	// TODO Auto-generated constructor stub
}
public Article(int id, String name, String author, int count) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.count = count;
}
@Override
public String toString() {
	return "Article [id=" + id + ", name=" + name + ", author=" + author + ", count=" + count + "]";
}

}
