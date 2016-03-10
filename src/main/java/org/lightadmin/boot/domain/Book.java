package org.lightadmin.boot.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Books")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(name = "eBookGuid", columnDefinition = "char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String eBookGuid;

    @Column(columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String name;

    @Column(name = "totalPageNumber", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String totalPageNumber;

    @Column(name = "isPublish", columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isPublish;

    @Column(name = "isS3Ready", columnDefinition = "tinyint(1) DEFAULT 0")
    private Integer isS3Ready;

    @Column(name = "doneDate", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String doneDate;

    @Column(name = "articleAuthor", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String articleAuthor;

    @Column(columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String publisher;

    @Column(columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String editor;

    @Column(name = "EAN", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String ean;

    @Column(name = "ISBN", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String isbn;

    @Column(name = "longDescription", columnDefinition = "TEXT BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String longDescription;

    @Column(columnDefinition = "ENUM('image','epub','html') BINARY DEFAULT 'image'")
    @Enumerated(EnumType.STRING)
    private BookType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String geteBookGuid() {
        return eBookGuid;
    }

    public void seteBookGuid(String eBookGuid) {
        this.eBookGuid = eBookGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalPageNumber() {
        return totalPageNumber;
    }

    public void setTotalPageNumber(String totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public Integer getIsS3Ready() {
        return isS3Ready;
    }

    public void setIsS3Ready(Integer isS3Ready) {
        this.isS3Ready = isS3Ready;
    }

    public String getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(String doneDate) {
        this.doneDate = doneDate;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEAN() {
        return ean;
    }

    public void setEAN(String EAN) {
        this.ean = EAN;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }
}
