package com.test;

import org.testng.annotations.BeforeSuite;

/**
 * Created by Dell on 2017/3/4.
 */
public class TestngBase {
    static String dexter;

    @BeforeSuite
    public void beforesuite(){
        TestngBase.dexter="FFF";
    }

}
