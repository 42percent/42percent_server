package com.example.controller;

import com.example.service.chatService;
import com.example.vo.chatRoomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.WebSocketSession;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/chat")
public class chatController {

    @Autowired
    private chatService chatService;

    @ResponseBody
    @RequestMapping(value = "/roomList")
    public List<HashMap<String, Object>> roomList(HttpServletRequest request) {
        List<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();


        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/{room_id}")
    public chatRoomVo chat(chatRoomVo vo, @PathVariable int room_id) {
        vo.setRoom_id(room_id);
        log.info("vo!!  "+vo);
        return chatService.createRoom(vo);
    }
}
