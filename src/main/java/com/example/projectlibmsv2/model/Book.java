package com.example.projectlibmsv2.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "isbn")
	private String isbn;
    @Column(name = "title")
	private String title;
    @Column(name = "publication_year")
	private int publicationYear;
	@Column(name = "language")
	private String language;
    @Column(name = "author")
	private String author;
	@Column(name = "published")
	private boolean published;

	public Book() {

	}

	public Book(String isbn, String title, int publicationYear, String language, String author, boolean published) {
		this.isbn = isbn;
		this.title = title;
        this.publicationYear = publicationYear;
		this.language = language;
        this.author = author;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getISBN() {
		return isbn;
	}
    public void setISBN(String isbn) {
		this.isbn = isbn;
	}

    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

    public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", publicationYear=" + publicationYear + ", language=" + language + ", author=" + author + ", published=" + published + "]";
	}
}
