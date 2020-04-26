/*
package com.example.handler;

import com.example.service.chatService;
import com.example.vo.chatMessageVo;
import com.example.vo.chatRoomVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
@RequiredArgsConstructor
public class chatHandler extends TextWebSocketHandler {
    private final ObjectMapper objectMapper;
    private final chatService chatService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        chatMessageVo chatMessage = objectMapper.readValue(payload, chatMessageVo.class);
        chatRoomVo room = chatService.findRoomById(chatMessage.getRoomId());
        room.handleActions(session, chatMessage, chatService);
    }
}
*/
