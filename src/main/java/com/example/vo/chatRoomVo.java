package com.example.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.UUID;

@Data
@Slf4j
//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class chatRoomVo {
    private String room_id; // room Id
    private String room_title; // room tilte

    public static chatRoomVo create(String room_title) {
        chatRoomVo chatRoom = new chatRoomVo();
        chatRoom.room_id = UUID.randomUUID().toString();
        chatRoom.room_title = room_title;
        return chatRoom;
    }
}
