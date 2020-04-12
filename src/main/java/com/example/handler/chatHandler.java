package com.example.handler;

import com.example.service.chatService;
import com.example.vo.chatMessageVo;
import com.example.vo.chatRoomVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
public class chatHandler extends TextWebSocketHandler {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private chatService chatService;

    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        chatMessageVo chatMessage = objectMapper.readValue(payload, chatMessageVo.class);
        chatRoomVo room = chatService.findRoomById(chatMessage.getRoomId());
        log.info("room!! " +room);
        room.handleActions(session, chatMessage, chatService);
    }

}
