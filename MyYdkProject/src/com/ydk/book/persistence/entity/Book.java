package com.ydk.book.persistence.entity;

// Generated Jan 25, 2010 9:49:58 AM by Hibernate Tools 3.2.4.GA

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
import org.springframework.transaction.annotation.Transactional;
import com.ydk.account.persistence.entity.*;



/**
 * Owners generated by hbm2java
 */
@Entity
@Table(name = "book", catalog = "ydk", uniqueConstraints = @UniqueConstraint(columnNames = "isbn"))
public class Book implements java.io.Serializable {

	//public enum Role{GUEST, VIP, ADMIN};
	//public enum BookStatus{INACTIVED, ACTIVED, TOBE_DELETED};
	
	private Long id;
	private String ydkBookId;
	private String title;
	private Author author;
	private String subTitle;
	private String imageSmall;
	private String imageLarge;
	private String image3DSmall;
	private String image3DLarge;
	private Publisher publisher;
	private Author author1;
	private Author author2;
	private Author author3;
	private Translator translator;
	private Translator translator1;
	private Translator translator2;
	private Translator translator3;
	private Integer pages;
	private Double size;
	private String edition;
	private String summary;
	private String toc;
	private String bookContent;
	private Date publishDate;	
	private String isbn;
	private Double	paperPrice;
	private Double	marketPrice;
	private Double	selectedEPrice;
	private Double	ydkPaperPrice;
	private Double score;
	private Integer scoreReaderNum;
	private Category category;
	private List<BookTag> bookTags = new ArrayList<BookTag>(0); 
	private ArrayList<String> authorOthers = new ArrayList<String>(0);
	private ArrayList<String> translatorOthers = new ArrayList<String>(0);
	private List<BookShelf> bookShelves = new ArrayList<BookShelf>(0);
	private List<Transaction> transactions = new ArrayList<Transaction>(0);
	private List<Interview> interviews = new ArrayList<Interview>(0); 
	private List<Event> events = new ArrayList<Event>(0);
	private List<BookNews> bookNews = new ArrayList<BookNews>(0);
	private List<BookReview> bookReviews = new ArrayList<BookReview>(0);
	private List<BookMark> bookMarks = new ArrayList<BookMark>(0);

	public Book() {
	}




	public Book(Long id,String ydkBookId, String title, Author author, String subTitle,
			String imageSmall, String imageLarge, String image3dSmall,
			String image3dLarge, Publisher publisher, Author author1,
			Author author2, Author author3, Translator translator,
			Translator translator1, Translator translator2,
			Translator translator3, Integer pages, Double size, String edition,
			String summary, String toc, String bookContent, Date publishDate,
			String isbn, Double paperPrice, Double marketPrice,
			Double selectedEPrice, Double ydkPaperPrice, Double score,
			Integer scoreReaderNum, Category category,
			ArrayList<String> authorOthers, ArrayList<String> translatorOthers,
			List<BookShelf> bookShelves, List<Transaction> transactions,
			List<Interview> interviews, List<Event> events,
			List<BookNews> bookNews, List<BookReview> bookReviews,
			List<BookMark> bookMarks) {
		super();
		this.id = id;
		this.ydkBookId = ydkBookId;
		this.title = title;
		this.author = author;
		this.subTitle = subTitle;
		this.imageSmall = imageSmall;
		this.imageLarge = imageLarge;
		image3DSmall = image3dSmall;
		image3DLarge = image3dLarge;
		this.publisher = publisher;
		this.author1 = author1;
		this.author2 = author2;
		this.author3 = author3;
		this.translator = translator;
		this.translator1 = translator1;
		this.translator2 = translator2;
		this.translator3 = translator3;
		this.pages = pages;
		this.size = size;
		this.edition = edition;
		this.summary = summary;
		this.toc = toc;
		this.bookContent = bookContent;
		this.publishDate = publishDate;
		this.isbn = isbn;
		this.paperPrice = paperPrice;
		this.marketPrice = marketPrice;
		this.selectedEPrice = selectedEPrice;
		this.ydkPaperPrice = ydkPaperPrice;
		this.score = score;
		this.scoreReaderNum = scoreReaderNum;
		this.category = category;
		this.authorOthers = authorOthers;
		this.translatorOthers = translatorOthers;
		this.bookShelves = bookShelves;
		this.transactions = transactions;
		this.interviews = interviews;
		this.events = events;
		this.bookNews = bookNews;
		this.bookReviews = bookReviews;
		this.bookMarks = bookMarks;
	}





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(generator="UniqueIdGenerator")
//	@GenericGenerator(name="UniqueIdGenerator", strategy="increment")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorName")  
	//@TableGenerator(name="generatorName", allocationSize=5)
	@Column(name = "BOOK_ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "ydkBookId", unique = true)
	public String getYdkBookId() {
		return ydkBookId;
	}

	public void setYdkBookId(String ydkBookId) {
		this.ydkBookId = ydkBookId;
	}
	
	@Column(name = "title", unique = true, nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_first_author",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="author_pk")
    )
	public Author getAuthor() {
		return this.author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Column(name = "SUB_TITLE")
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_first_translator",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="translator_pk")
    )
	public Translator getTranslator() {
		return this.translator;
	}
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}
	
	@Column(name = "isbn")
	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Column(name = "pages")
	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	@Column(name = "PAPER_PRICE")
	public Double getPaperPrice() {
		return this.paperPrice;
	}

	public void setPaperPrice(Double price) {
		this.paperPrice = price;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher")
	public Publisher getPublisher() {
		return this.publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Column(name = "publish_date")
	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date date) {
		this.publishDate = date;
	}
	
//	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(name = "book_content",
//        joinColumns = 
//        	@JoinColumn(name="book_content_fk"),
//        inverseJoinColumns = 
//        	@JoinColumn(name="file_descriptor_fk")
//    )
    @Column(name = "book_content")
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

	
//	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(name = "book_image_s",
//        joinColumns = 
//        	@JoinColumn(name="image_small_fk"),
//        inverseJoinColumns = 
//        	@JoinColumn(name="file_descriptor_fk")
//    )
	@Column(name = "imageSmall")
	public String getImageSmall() {
		return imageSmall;
	}
	public void setImageSmall(String imageSmall) {
		this.imageSmall = imageSmall;
	}

	
//	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(name = "book_image_l",
//        joinColumns = 
//        	@JoinColumn(name="image_large_fk"),
//        inverseJoinColumns = 
//        	@JoinColumn(name="file_descriptor_fk")
//    )
	@Column(name = "imageLarge")
	public String getImageLarge() {
		return imageLarge;
	}
	public void setImageLarge(String imageLarge) {
		this.imageLarge = imageLarge;
	}
	
	
//	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(name = "book_image_3d_s",
//        joinColumns = 
//        	@JoinColumn(name="image_3d_s_fk"),
//        inverseJoinColumns = 
//        	@JoinColumn(name="file_descriptor_fk")
//    )
    @Column(name = "image3DSmall")
	public String getImage3DSmall() {
		return image3DSmall;
	}
	public void setImage3DSmall(String image3DSmall) {
		this.image3DSmall = image3DSmall;
	}
	
//	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(name = "book_image_3d_l",
//        joinColumns = 
//        	@JoinColumn(name="image_3d_l_fk"),
//        inverseJoinColumns = 
//        	@JoinColumn(name="file_descriptor_fk")
//    )
	@Column(name = "image3DLarge")
	public String getImage3DLarge() {
		return image3DLarge;
	}
	public void setImage3DLarge(String image3DLarge) {
		this.image3DLarge = image3DLarge;
	}


	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_second_author",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="author_pk")
    )
	public Author getAuthor1() {
		return author1;
	}
	public void setAuthor1(Author author1) {
		this.author1 = author1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_third_author",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="author_pk")
    )
	public Author getAuthor2() {
		return author2;
	}
	public void setAuthor2(Author author2) {
		this.author2 = author2;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_fourth_author",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="author_pk")
    )
	public Author getAuthor3() {
		return author3;
	}
	public void setAuthor3(Author author3) {
		this.author3 = author3;
	}

	@Column(name = "author_others")
	public ArrayList<String> getAuthorOthers() {
		return authorOthers;
	}
	public void setAuthorOthers(ArrayList<String> authorOthers) {
		this.authorOthers = authorOthers;
	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_second_translator",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="translator_pk")
    )
	public Translator getTranslator1() {
		return translator1;
	}
	public void setTranslator1(Translator translator1) {
		this.translator1 = translator1;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_third_translator",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="translator_pk")
    )
	public Translator getTranslator2() {
		return translator2;
	}
	public void setTranslator2(Translator translator2) {
		this.translator2 = translator2;
	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(
            name="book_fourth_translator",
            joinColumns = @JoinColumn( name="book_pk"),
            inverseJoinColumns = @JoinColumn( name="translator_pk")
    )
	public Translator getTranslator3() {
		return translator3;
	}
	public void setTranslator3(Translator translator3) {
		this.translator3 = translator3;
	}

	@Column(name = "translator_others")
	public ArrayList<String> getTranslatorOthers() {
		return translatorOthers;
	}
	public void setTranslatorOthers(ArrayList<String> translatorOthers) {
		this.translatorOthers = translatorOthers;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	@Column(name = "SIZE")
	public Double getSize() {
		return size;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	@Column(name = "EDITION")
	public String getEdition() {
		return edition;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "SUMMARY")
	public String getSummary() {
		return summary;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	@Column(name = "TOC")
	public String getToc() {
		return toc;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Column(name = "MARKET_PRICE")
	public Double getMarketPrice() {
		return marketPrice;
	}

	public void setSelectedEPrice(Double selectedEPrice) {
		this.selectedEPrice = selectedEPrice;
	}

	@Column(name = "SELECTED_E_PRICE")
	public Double getSelectedEPrice() {
		return selectedEPrice;
	}



	@Column(name = "YDK_PAPER_PRICE")
	public Double getYdkPaperPrice() {
		return ydkPaperPrice;
	}
	public void setYdkPaperPrice(Double ydkPaperPrice) {
		this.ydkPaperPrice = ydkPaperPrice;
	}

	/**
	 * @return the score
	 */
	@Column(name = "score")
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		score = score;
	}
	
	/**
	 * @return the scoreReaderNum
	 */
	@Column(name = "scoreReaderNum")
	public Integer getScoreReaderNum() {
		return scoreReaderNum;
	}
	public void setScoreReaderNum(Integer scoreReaderNum) {
		this.scoreReaderNum = scoreReaderNum;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category")
	public Category getCategory() {
		return this.category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE},
			mappedBy = "book")
	public List<BookShelf> getBookShelves() {
		return this.bookShelves;
	}
	public void setBookShelves(List<BookShelf> bookShelves) {
		this.bookShelves = bookShelves;
	}

	@OneToMany(fetch = FetchType.LAZY, /* cascade={CascadeType.REMOVE},*/ //Transaction should not be deleted
			mappedBy = "book")
	@OrderBy("date")
	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	@JoinTable(
            name="book_interviews",
            joinColumns = @JoinColumn( name="subject_pk"),
            inverseJoinColumns = @JoinColumn( name="book_pk")
    )
	public List<Interview> getInterviews() {
		return this.interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	@JoinTable(
            name="book_events",
            joinColumns = @JoinColumn( name="subject_pk"),
            inverseJoinColumns = @JoinColumn( name="book_pk")
    )
	public List<Event> getEvents() {
		return this.events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	@JoinTable(
            name="book_book_news",
            joinColumns = @JoinColumn( name="subject_pk"),
            inverseJoinColumns = @JoinColumn( name="book_pk")
    )
	public List<BookNews> getBookNews() {
		return this.bookNews;
	}
	public void setBookNews(List<BookNews> bookNews) {
		this.bookNews = bookNews;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	@JoinTable(
            name="book_book_reviews",
            joinColumns = @JoinColumn( name="subject_pk"),
            inverseJoinColumns = @JoinColumn( name="book_pk")
    )
	public List<BookReview> getBookReviews() {
		return this.bookReviews;
	}
	public void setBookReviews(List<BookReview> bookReviews) {
		this.bookReviews = bookReviews;
	}
	
	@OneToMany(fetch = FetchType.LAZY/*, cascade = CascadeType.REMOVE*/,
			mappedBy = "book")
	public List<BookMark> getBookMarks() {
		return this.bookMarks;
	}
	public void setBookMarks(List<BookMark> bookMarks) {
		this.bookMarks = bookMarks;
	}
	
	
	
	
	
	/**
	 * @return the bookTags
	 */
	@ManyToMany(
			targetEntity=BookTag.class,
			fetch = FetchType.LAZY
			)
	@JoinTable(
            name="book_book_tag",
            joinColumns = @JoinColumn(name="tag_pk"),
            inverseJoinColumns = @JoinColumn(name="book_pk")
    )
	public List<BookTag> getBookTags() {
		return bookTags;
	}
	public void setBookTags(List<BookTag> bookTags) {
		this.bookTags = bookTags;
	}




	@Override
	public String toString() {
		return new ToStringCreator(this)

		.append("id", this.getId())
		
		.append("title", this.getTitle())
		
		.append("new", this.isNew())
		
		.append("author", this.getAuthor())

		.append("subTitle", this.getSubTitle())

		.append("publisher", this.publisher)

		.append("author1", this.author1)

		.append("author2", this.author2)
		
		.append("author3", this.author3)
		
		.append("authorOthers", this.authorOthers)
		
		.append("translator", this.translator)
		
		.append("translator1", this.translator)
		
		.append("translator2", this.translator2)
		.append("translator3", this.translator3)
		.append("translatorOthers", this.translatorOthers)
		.append("pages", this.pages)
		.append("size", this.size)
		.append("edition", this.edition)
		.append("summary", this.summary)
		.append("toc", this.toc)
		.append("publishDate", this.publishDate)
		.append("isbn", this.isbn)
		.append("paperPrice", this.paperPrice)
		.append("marketPrice", this.marketPrice)
		.append("selectedEPrice", this.selectedEPrice)
		.append("ydkPaperPrice", this.ydkPaperPrice)
		.toString();
	}
	
	
	
	/*
	 * Add more helper methods here...
	 */
	@Transient
	public boolean isNew() {
		return (this.id == null);
	}
	/**
	 * For more strict JPA
	 */
	@Transient
	public void setNew(boolean isNew) {
		;
	}
	@Transient
	public boolean getNew() {
		return (this.id == null);
	}
	
	@Transient
	public Book setToPlainObject(Book instance)
	{
		//Get self
		getTitle();
		Book result = new Book();
		result.cloneBook(this);
		
		//Eager get @ManytoOne, @OnetoOne
		if (getAuthor() != null)
		result.setAuthor(getAuthor().setToPlainObjectQuick(getAuthor()));
		if (getAuthor1() != null)
		result.setAuthor1(getAuthor1().setToPlainObjectQuick(getAuthor1()));
		if (getAuthor2() != null)
		result.setAuthor2(getAuthor2().setToPlainObjectQuick(getAuthor2()));
		if (getAuthor3() != null)
		result.setAuthor3(getAuthor3().setToPlainObjectQuick(getAuthor3()));
		

		if (getTranslator() != null)
		result.setTranslator(getTranslator().setToPlainObjectQuick(getTranslator()));
		if (getTranslator1() != null)
		result.setTranslator1(getTranslator1().setToPlainObjectQuick(getTranslator1()));
		if (getTranslator2() != null)
		result.setTranslator2(getTranslator2().setToPlainObjectQuick(getTranslator2()));
		if (getTranslator3() != null)
		result.setTranslator3(getTranslator3().setToPlainObjectQuick(getTranslator3()));
		
		if (getCategory() != null)
		result.setCategory(getCategory().setToPlainObjectQuick(getCategory()));
		if (result.getPublisher() != null)
		result.setPublisher(getPublisher().setToPlainObjectQuick(getPublisher()));
		
		result.setBookTags(new ArrayList<BookTag>(0));

		for (BookTag bg: getBookTags())
		{
			result.getBookTags().add(bg.setToPlainObject(bg));
		}

		
		//Null the @one to Many
		result.setBookMarks(null);
		result.setBookNews(null);
		result.setBookReviews(null);
		result.setBookShelves(null);
		result.setEvents(null);
		result.setInterviews(null);
		result.setTransactions(null);
		
		return result;
	}
	
	@Transient
	public Book setToPlainObjectQuick(Book instance)
	{
		//Get self
		getTitle();
		
		Book result = new Book();
		result.cloneBook(this);
		
		//Eager get @ManytoOne, @OnetoOne
		result.setAuthor(null);
		result.setAuthor1(null);
		result.setAuthor2(null);
		result.setAuthor3(null);
		
		result.setTranslator(null);
		result.setTranslator1(null);
		result.setTranslator2(null);
		result.setTranslator3(null);
		
		result.setCategory(null);
		result.setPublisher(null);
		
		//Null the @one to Many
		result.setBookMarks(null);
		result.setBookNews(null);
		result.setBookReviews(null);
		result.setBookShelves(null);
		result.setEvents(null);
		result.setInterviews(null);
		result.setTransactions(null);
		result.setBookTags(null);
		
		return result;
	}
	
	@Transient
	public void cloneBook(Book book) {
		id = book.id;
		ydkBookId = book.ydkBookId;
		title = book.title;
		author = book.author;
		subTitle = book.subTitle;
		imageSmall = book.imageSmall;
		imageLarge = book.imageLarge;
		image3DSmall = book.image3DSmall;
		image3DLarge = book.image3DLarge;
		publisher = book.publisher;
		author1 = book.author1;
		author2 = book.author2;
		author3 = book.author3;
		translator = book.translator;
		translator1 = book.translator1;
		translator2 = book.translator2;
		translator3 = book.translator3;
		pages = book.pages;
		size = book.size;
		edition = book.edition;
		summary = book.summary;
		toc = book.toc;
		bookContent = book.bookContent;
		publishDate = book.publishDate;
		isbn = book.isbn;
		paperPrice = book.paperPrice;
		marketPrice = book.marketPrice;
		selectedEPrice = book.selectedEPrice;
		ydkPaperPrice = book.ydkPaperPrice;
		score = book.score;
		scoreReaderNum = book.scoreReaderNum;
		category = book.category;
		authorOthers = book.authorOthers;
		translatorOthers = book.translatorOthers;
		bookShelves = book.bookShelves;
		transactions = book.transactions;
		interviews = book.interviews;
		events = book.events;
		bookNews = book.bookNews;
		bookReviews = book.bookReviews;
		bookMarks = book.bookMarks;
		bookTags = book.bookTags;
	}
	
	
}