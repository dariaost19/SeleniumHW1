package Homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Amazon {
    //1. launch the browser
    // 2. navigate to amazon website
    // 3. print out the title and the url in the console
    //  4. close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        String title=  driver.getTitle();
        String URL=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(URL);
        driver.close();

    }
}
