package com.test;

import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Dell on 2017/3/3.
 */
public class TestngExample extends TestngBase {
    String testname = "";
    SoftAssert as = new SoftAssert();
    Assertion Has = new Assertion();



    @BeforeClass
    public void beforeClass() {
        System.out.println("VALUE is" +TestngBase.dexter);
        System.out.println("this is before class");
        testname = "Jackson";

    }

    @Test
    public void TestNgPass() {
        as.assertEquals(true,true,"Boolean test");
        assertEquals("Jackson", testname);
  //      Has.assertEquals("this","that","Des");

    }

    @Test
    public void TestNgFail() {
        as.assertEquals(true,false,"Boolean test");
        assertEquals("Jackson", testname);
        as.assertAll();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}
