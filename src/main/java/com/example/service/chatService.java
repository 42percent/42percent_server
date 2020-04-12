package com.example.service;

import com.example.vo.chatRoomVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

@Slf4j
@Service
public class chatService {

    private ObjectMapper objectMapper;

    public chatRoomVo createRoom(chatRoomVo vo) {

       vo.setRoom_id(vo.getRoom_id());

        return vo;
    }

    public <T> void sendMessage(WebSocketSession session, T message) {
        try {
            session.sendMessage(new TextMessage(objectMapper.writeValueAsString(message)));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    public static chatRoomVo findRoomById( int room_id){
        chatRoomVo chatRoomVo = new chatRoomVo();
        chatRoomVo.setRoom_id(room_id);
        return chatRoomVo;
    }
}
