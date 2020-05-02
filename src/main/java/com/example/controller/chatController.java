package com.example.controller;

import com.example.vo.chatMessageVo;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class chatController {

//    private final chatService chatService;
//
//    @RequestMapping(method = RequestMethod.POST)
//    public chatRoomVo createRoom(@RequestParam String name) {
//        return chatService.createRoom(name);
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<chatRoomVo> findAllRoom() {
//        return chatService.findAllRoom();
//    }

//    private final SimpMessageSendingOperations messagingTemplate;

//    @MessageMapping("/chat/message")
//    public void message(chatMessageVo message) {
//        if (message.getType().JOIN.equals(message.getType()))
//            message.setMessage(message.getSender() + "님이 입장하셨습니다.");
//        messagingTemplate.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
//    }
}