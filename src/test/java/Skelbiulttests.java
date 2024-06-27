import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Skelbiulttests {
    public static WebDriver driver;

    @Test
    public void openWebsite() {
        driver.get("https://www.skelbiu.lt/users/signin");

    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        openWebsite();
        AcceptCookies();
    }
public void AcceptCookies(){
    driver.get("https://www.skelbiu.lt/users/signin");
    driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

}
public void Registration(){
        AcceptCookies();
        driver.findElement(By.xpath("//*[@id=\"nick-input\"]")).click();
        



}
}
