package com.github.tlavrova.chatroom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<Message> messages = new ArrayList<>();

    public void saveMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getAll() {
        return messages;
    }
}
