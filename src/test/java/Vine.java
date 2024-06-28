import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Vine {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        driver.manage().window().maximize();
        acceptAge();
        acceptCookies();
    }

    public void acceptAge(){
        driver.get("https://vynoteka.lt/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app__inner\"]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"))).click();
    }

    public void acceptCookies(){
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.
                xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.
                className("modal__close-button"))).click();
    }
    @Test
    public void search(){
        driver.findElement(By.className("form-control")).sendKeys("vynas");
        driver.findElement(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div/div/a")));
       //                                         /html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
    }
}
