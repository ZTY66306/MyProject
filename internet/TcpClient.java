package com.heima.internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Properties;

public class TcpClient {
    public static void main(String[] args) throws IOException {
//        创建一个socket对象   socket.shutdown是用来传递一个结束的标记
        Socket socket = new Socket("127.0.0.1",9999);

        OutputStream os= socket.getOutputStream();
        os.write("hello".getBytes());


        os.close();
        socket.close();
    }
}
