package com.example.demo.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardDao boardDao;


    public Page<BoardDo> list(int page, int size) {

        return boardDao.findAll(PageRequest.of(page, size));

    }

    public BoardDo save(BoardDo boardDo) {

        return this.boardDao.save(boardDo);
    }


    public BoardDo getBoard(Long board_id) {

        return boardDao.getOne(board_id);
    }
}
