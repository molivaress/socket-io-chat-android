package com.olivares.demochat.utils;

import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.socket.client.IO;
import io.socket.client.Socket;

@Singleton
public class SocketHelper {
    private Socket socket;

    private int counter;

    @Inject
    public SocketHelper() {
        counter++;
        try {
            this.socket = IO.socket(Constants.CHAT_SERVER_URL);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return socket;
    }
}
