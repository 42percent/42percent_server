package com.example.vo;

import com.example.vo.enums.enums;
import lombok.Data;

@Data
public class chatMessageVo {
    private enums.MessageType messageType;
    private int roomId;
    private String sender;
    private String message;
}
