package com.example.demo.account;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "account")
public class AccountDo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="double")
    private int id;

    @Column(name = "name",columnDefinition="VARCHAR(45)")
    private String name;

    // 6.08 Singup에 추가된 컬럼 추가
    @Column(name = "password",columnDefinition="VARCHAR(45)")
    private String password;

    @Column(name = "phone_number",columnDefinition="VARCHAR(45)")
    private String phone_number;

    @Column(name = "email",columnDefinition = "VARCHAR(45)")
    private String email;

    //    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "uuid", unique = true)
    private String uuid;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

}
