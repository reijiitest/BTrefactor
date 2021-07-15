package com.rer.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestDataReader {

    public static String testDataReader(int n) {
        String dataGet = null;
        try {
            dataGet = Files.readAllLines(Paths.get("src\\main\\resources\\testData.txt")).get(n-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataGet;
        //  n:
//  0 - email/username;
//  1 - password;
//  3 - homepage;
//  4 - loginpage;
//  5 - usercabinet;
//  7 - from(world)
//  8 - to(world)
//  10 - from(Berlin)
//  11 - to(Berlin)
//  13 - fixedPricingPage
//  22 - taxiPage
    }

}
