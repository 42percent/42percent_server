package com.example.demo.board;


import com.example.demo.AccountDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao extends JpaRepository<BoardDo, Long> {


}


