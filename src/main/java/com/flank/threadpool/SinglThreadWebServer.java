package com.flank.threadpool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 单线程的web服务器
 * @author flank
 * @date 2020/11/30 12:06
 */
public class SinglThreadWebServer {
    /**
     * 服务端
     */
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8088);
        while (true) {
            Socket connect = serverSocket.accept();
            System.out.println("客户端:"+connect.getLocalAddress()+"已连接到服务器");
            handleRequest(connect);
        }
    }
    private static void handleRequest(Socket connect){
        System.out.println("handleRequest");
    }
}
class SingleThreadWebClient{
    /**
     * 客戶端
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8088);
    }
}
