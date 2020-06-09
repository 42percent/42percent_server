package com.example.demo.account;


import com.example.demo.board.BoardDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public Page<AccountDo> list(int page, int size) {

        return accountDao.findAll(PageRequest.of(page, size));

    }
    public AccountDo save(AccountDo AccountDo) {

        return this.accountDao.save(AccountDo);
    }


    public AccountDo getaccount(Long Account_id) {

        return accountDao.getOne(Account_id);
    }

}
