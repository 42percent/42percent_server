package com.example.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<AccountDo> list() {


        return accountDao.findAll();
    }
}
