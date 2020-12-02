package com.flank.threadpool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 每个请求创建一个线程去处理入口
 *
 * @author flank
 * @date 2020/12/1 17:07
 */
public class ThreadPerTaskServer {
    /**
     * 定义执行器
     */
    private static final Executor executor = ExecutorFactory.newExecutor("Single");

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            Socket connect = serverSocket.accept();
            Runnable task=()->handleRequest(connect);
            executor.execute(task);
        }
    }
    private static void handleRequest(Socket connect){
        System.out.println("handleRequest");
    }
}
