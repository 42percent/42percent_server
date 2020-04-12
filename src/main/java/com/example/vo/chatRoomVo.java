package com.example.vo;

import com.example.service.chatService;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

@Data
//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class chatRoomVo {
    private int room_id; // room Id
    private String room_title; // room tilte
    private Set<WebSocketSession> sessions = new HashSet<>();

    public void handleActions(WebSocketSession session, chatMessageVo chatMessage, chatService chatService) {
        if (chatMessage.getMessageType().equals(chatMessage.getMessageType().ENTER)) {
            sessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
        }
        sendMessage(chatMessage, chatService);
    }
    public <T> void sendMessage(T message, chatService chatService) {
        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
    }
}
