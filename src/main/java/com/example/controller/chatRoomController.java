package com.example.controller;

import com.example.vo.chatRoomVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@RequiredArgsConstructor
//@Controller
//@RequestMapping("/chat")
//public class chatRoomController {
//    private final chatRepository chatRoomRepository;
//
//채팅 리스트 화면
//    @RequestMapping(value = "/room")
//    public String rooms() {
//        return "/chat/room";
//    }
//
//     모든 채팅방 목록 반환
//    @ResponseBody
//    @RequestMapping(value = "/roomList")
//    public List<chatRoomVo> room() {
//        return chatRoomRepository.findAllRoom();
//    }
//
//     채팅방 생성
//    @ResponseBody
//    @RequestMapping(value = "/createRoom")
//    public chatRoomVo createRoom(chatRoomVo chatRoomVo) {
//        return chatRoomRepository.createChatRoom(chatRoomVo);
//    }
//
//     채팅방 입장 화면
//    @RequestMapping(value = "/room/enter/{roomId}")
//    public String roomDetail(Model model, @PathVariable String roomId) {
//        model.addAttribute("roomId", roomId);
//        return "/chat/roomDetail";
//    }
//
//     특정 채팅방 조회
//    @ResponseBody
//    @RequestMapping(value = "/room/{roomId}")
//    public chatRoomVo roomInfo(@PathVariable String roomId) {
//        return chatRoomRepository.findRoomById(roomId);
//    }
//}
