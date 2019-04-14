package com.getsong.lml.server.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Model of book
 *
 * @author getsong
 * @since 14/4/2019 11:17 AM
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private Date publishedDate;
    private String author;

}
