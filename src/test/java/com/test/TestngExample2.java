package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Dell on 2017/3/3.
 */
public class TestngExample2 extends TestngBase {
    String testname = "";
    SoftAssert sa = new SoftAssert();
    @BeforeClass
    public void beforeClass() {
        System.out.println("VALUE is" +TestngBase.dexter);
        System.out.println("this is before class");
        testname = "Jackson";

    }

    @Test
    public void TestNgPass() {

        assertEquals("Jackson", testname);

    }

    @Test
    public void TestNgFPass2() {

        assertEquals("Jackson", testname);
        sa.assertAll();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
