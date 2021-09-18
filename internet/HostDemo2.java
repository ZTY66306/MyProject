package com.heima.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class HostDemo2 {
    public static void main(String[] args) throws IOException {
//        表示从10000端口接受数据
        DatagramSocket ds=new DatagramSocket(10000);


        while (true) {
//        相当于数据的箱子   用数据的全部长度去接受数据
            byte[] bytes=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bytes, bytes.length);


            ds.receive(dp);

            byte[] data=dp.getData();
//        得到接收端得到了多少的字节长度
            int lenth=dp.getLength();
//            输出接受的信息
            System.out.println(new String(data,0,lenth));
        }

//        ds.close();



    }
}
