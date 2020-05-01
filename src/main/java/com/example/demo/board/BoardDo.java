package com.example.demo.board;

import com.example.demo.AccountDo;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
public class BoardDo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition="double")
    private int id;

    //    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "uuid", unique = true)
    private String uuid;

    @Column(name = "title",columnDefinition="VARCHAR(45)")
    private String title;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "account",
            referencedColumnName = "id"
    )
    private AccountDo account;


    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }


    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }
}
