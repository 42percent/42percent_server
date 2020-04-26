/*
package com.example.service;

import com.example.vo.chatRoomVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class chatService {

    private final ObjectMapper objectMapper;
    private Map<String, chatRoomVo> chatRooms;

    @PostConstruct
    private void init() {
        chatRooms = new LinkedHashMap<>();
    }

    public List<chatRoomVo> findAllRoom() {
        return new ArrayList<>(chatRooms.values());
    }

    public chatRoomVo findRoomById(String roomId) {
        return chatRooms.get(roomId);
    }

    public chatRoomVo createRoom(String name) {
        String randomId = UUID.randomUUID().toString();

        chatRoomVo chatRoom = chatRoomVo.builder()
                .room_id(randomId)
                .room_title(name)
                .build();
        chatRooms.put(randomId, chatRoom);

        return chatRoom;

    }

    public <T> void sendMessage(WebSocketSession session, T message) {
        try {
            session.sendMessage(new TextMessage(objectMapper.writeValueAsString(message)));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }
}
*/
