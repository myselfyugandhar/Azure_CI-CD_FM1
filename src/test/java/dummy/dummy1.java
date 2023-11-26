package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class dummy1 {
	@Test(priority=9,enabled=true)
	public void dummy12() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
        Thread.sleep(5000);
        String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[1]")).getText();
        System.out.println(text);
        driver.quit();
    }


}
