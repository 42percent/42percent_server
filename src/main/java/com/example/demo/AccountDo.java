package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class AccountDo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="double")
    private int id;

    @Column(name = "name",columnDefinition="VARCHAR(45)")
    private String name;

}
