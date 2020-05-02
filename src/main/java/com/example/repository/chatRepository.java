package com.example.repository;

import com.example.vo.chatRoomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

//@Repository
//@Slf4j
//public class chatRepository {
//    private Map<String, chatRoomVo> chatRoomMap;
//
//    @PostConstruct
//    private void init() {
//        chatRoomMap = new LinkedHashMap<>();
//    }
//
//    public List<chatRoomVo> findAllRoom() {
//         채팅방 생성순서 최근 순으로 반환
//        List chatRooms = new ArrayList<>(chatRoomMap.values());
//        Collections.reverse(chatRooms);
//        return chatRooms;
//    }
//
//    public chatRoomVo findRoomById(String id) {
//        return chatRoomMap.get(id);
//    }
//
//    public chatRoomVo createChatRoom(chatRoomVo chatRoomVo) {
//        chatRoomVo.create(chatRoomVo.getRoom_title());
//        chatRoomMap.put(chatRoomVo.getRoom_id(), chatRoomVo);
//        return chatRoomVo;
//    }
//}
