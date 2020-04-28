package com.example.demo.board;


import com.example.demo.ResponseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@EnableSwagger2
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @GetMapping(value = "/boards")
    public Page<BoardDo> getListOfBoards(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {

        return boardService.list(page, size);
    }

    @GetMapping(value = "/boards/{board_id}")
    public BoardDo getBoard(@PathVariable("board_id") Long board_id) {
        PostForm postForm1 = new PostForm();

        if (false) {


        }

        return boardService.getBoard(board_id);

    }

    @PutMapping(value = "/boards/{board_id}")
    public BoardDo getBoard(@PathVariable("board_id") Long board_id, @RequestBody BoardDo boardDo) {

        BoardDo boardDo1 = this.boardService.save(boardDo);

        return boardDo1;
    }

    @PostMapping(value = "/boards")
    public BoardDo NewPost(@RequestBody BoardDo boardDo) {

        BoardDo boardDo1 = this.boardService.save(boardDo);

        return boardDo1;
    }
}
