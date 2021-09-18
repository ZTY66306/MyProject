package com.heima.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class HostDemo {
    public static void main(String[] args) throws IOException {
//        表示从10000端口接受数据
        DatagramSocket ds=new DatagramSocket(10000);

        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);


        ds.receive(dp);

        byte[] data=dp.getData();
//        得到接收端得到了多少的字节长度
        int lenth=dp.getLength();
        System.out.println(new String(data,0,lenth));

        ds.close();



    }
}
