package com.heima.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-MVQ9L5R");

        String hostName = address.getHostName();
        System.out.println("主机名"+hostName);

        String ip=address.getHostAddress();
        System.out.println("IP为"+ip);
    }
}
