package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by UNIT6 on 2017/3/9.
 */
public class TestngLoginAda {
        public static  void main (String[] str) throws Exception {

            System.setProperty("webdriver.gecko.driver", "C:\\Windows\\System32\\geckodriver.exe");
            //找到火狐浏览器
            WebDriver driver=new FirefoxDriver();
            //打开网址
            driver.get("http:192.168.0.120:8080");
            //在用户名输入框输入用户名
           // WebElement element=driver.findElement(By.xpath("//input[@id='Account']"));
            WebElement element=driver.findElement(By.name("Account"));
            element.sendKeys("director");
            //获取密码栏输入密码
            element=driver.findElement(By.xpath("//input[@id='Password']"));
            element.sendKeys("123fff");
            //找到登录按钮
            element=driver.findElement(By.xpath("//input[@id='btn-submit']"));
            element.click();
            System.out.print("登录成功");
            //加入等待时间
            Thread.sleep(2000);
            //进入快速登录页面，并且点击快速登录按钮
            element=driver.findElement(By.xpath("//a[@id='btn_quickly']"));
            element.click();
            Thread.sleep(2000);
            //点击同意按钮
            element=driver.findElement(By.xpath("//input[@id='agree']"));
            element.click();
            Thread.sleep(2000);



        }
}
