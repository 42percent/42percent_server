package com.example.demo.board;

import com.example.demo.AccountDo;
import com.example.demo.AccountService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/boards")
    public Page<BoardDo> getListOfBoards(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {

        return boardService.list(page, size);
    }
}
