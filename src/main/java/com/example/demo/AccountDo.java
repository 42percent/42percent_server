package com.example.demo;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

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


//    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "uuid", unique = true)
    private String uuid;


}
