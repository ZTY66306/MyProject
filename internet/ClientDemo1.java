package com.heima.internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        DatagramSocket ds =new DatagramSocket();

        while(true){
            String s= sc.nextLine();
            if(s.equals("886")){
                break;
            }
//            发送的时候要是字节类型的
            byte[] bytes=s.getBytes();
            InetAddress addr=InetAddress.getByName("255,255,255,255");
            int port = 10000;
            DatagramPacket dp=new DatagramPacket(bytes, bytes.length,addr,port);
//        发送
            ds.send(dp);
        }


//        关闭
        ds.close();
    }

//
}
