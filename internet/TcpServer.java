package com.heima.internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);

//        accept的方法是阻塞，等待客户端的连接  read（）方法也是阻塞的，一直等着读下一个字节
        Socket accept=ss.accept();

//        服务器是输入流 客户端是输出流
        InputStream is=accept.getInputStream();
        int b;
//        一次读取一个字节   当没有任何的客户端连接的时候  关os的时候，客户端有向服务器输出关流的标记
        while((b=is.read())!=-1){
            System.out.println(((char)b));
        }

        is.close();
        ss.close();





    }
}
