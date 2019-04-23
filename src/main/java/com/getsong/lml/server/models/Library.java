package com.getsong.lml.server.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Model for a library
 *
 * @author getsong
 * @since 23/4/2019 9:15 PM
 */
@Entity
@Data
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

}
