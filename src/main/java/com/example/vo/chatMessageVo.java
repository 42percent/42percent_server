package com.example.vo;

import com.example.vo.enums.enums;
import lombok.Data;

@Data
public class chatMessageVo {
    private enums.MessageType type;
    private String roomId;
    private String sender;
    private String message;
}
