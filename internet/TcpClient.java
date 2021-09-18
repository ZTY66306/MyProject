package com.heima.internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
//        创建一个socket对象
        Socket socket = new Socket("127.0.0.1",9999);

        OutputStream os= socket.getOutputStream();
        os.write("hello".getBytes());

        os.close();
        socket.close();
    }
}
