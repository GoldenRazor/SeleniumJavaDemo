package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by UNIT6 on 2017/3/9.
 */
public class TestngExampleAda {
public static  void main (String[] str) throws Exception{

    System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
    //实例化驱动对象
    WebDriver webdrivers=new FirefoxDriver();
    //打开百度一下页面
    webdrivers.get("http:www.baidu.com");
    //找到百度一下的搜索输入框
    WebElement webElements=webdrivers.findElement(By.name("wd"));
    //在搜索输入框输入长滩岛
    webElements.sendKeys("长滩岛");
    //加入等待时间
    webdrivers.wait(2000);
    //webElements.findElement(By.id("su"));//获取百度一下搜索按钮（通过id获取按钮）
    //获取百度一下搜索按钮（通过xpath获取）
    webElements.findElement(By.xpath("//input[@id='su']"));
    //点击百度一下搜索按钮
    webElements.click();
    //加入等待时间
    webdrivers.wait(2000);
    //退出
    webdrivers.quit();



    }

}
