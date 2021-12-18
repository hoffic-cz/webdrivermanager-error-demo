package com.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        new ChromeDriver();
        System.out.println("Hello World!");
    }
}
