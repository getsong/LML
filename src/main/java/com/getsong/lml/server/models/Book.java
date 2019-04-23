package com.getsong.lml.server.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Model of book
 *
 * @author getsong
 * @since 14/4/2019 11:17 AM
 */

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private Date publishedDate;
    private String author;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

}
