package com.tensquare.test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Created by aheadx on 2020/4/14.
 */
public class MongoTest {
    public static void main(String[] args) {
        //连接mongo服务器
        MongoClient client = new MongoClient("192.168.68.130");
        //得到要操作的数据库
        MongoDatabase spitdb = client.getDatabase("spitdb");
    }
}
