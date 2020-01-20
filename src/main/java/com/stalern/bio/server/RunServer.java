package com.stalern.bio.server;

/**
 * @author stalern
 * @date 2020/01/20~15:27
 */
public class RunServer {
    public static void main(String[] args) {
        Server server = new Server(100);
        server.start();
    }
}
