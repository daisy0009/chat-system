package com.example.chatsystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
public class WebSocketEventListener {

    public void handlerWebSocketDisconnectListener(SessionDisconnectEvent event) {
        // todo implement
    }
}
