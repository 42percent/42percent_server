package com.example.demo.account;



import com.example.demo.board.BoardDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<AccountDo, Long> {


}



