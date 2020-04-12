package com.example.config;

import com.example.handler.chatHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Slf4j
@Configuration
@EnableWebSocket
public class webSocketConfig implements WebSocketConfigurer {
    private chatHandler chatHandler = new chatHandler();

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        log.info("registry!! " +registry);
        registry.addHandler(chatHandler, "/chat").setAllowedOrigins("*");
    }
}
