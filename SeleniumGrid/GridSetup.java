package com.rohit.SeleniumGridExample;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;
 
public class GridSetup {
 public static WebDriver driver;
 
 public static void main(String[]  args) throws MalformedURLException, InterruptedException{
 
 String URL = "https://app url";
 String Node = "http://ip addres:port number/wd/hub";
 
 DesiredCapabilities cap = DesiredCapabilities.firefox();
 cap.setBrowserName("firefox");
 cap.setPlatform(Platform.WINDOWS);
 
// DesiredCapabilities capability = DesiredCapabilities.chrome();
// capability.setBrowserName("chrome");
 
 driver = new RemoteWebDriver(new URL(Node), cap);
 
 driver.navigate().to(URL);
 Thread.sleep(5000);
 driver.quit();
 } 
}


