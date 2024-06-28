import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Vine {
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
    public void acceptAge(){
        driver.get("https://vynoteka.lt/");
        driver.findElement(By.xpath("//*[@id=\"app__inner\"]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
    }
    @Test
    public void acceptCookies(){
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(By.id("omnisend-form-63ff1f31b40d6530aba59a6d-close-action")).click();
    }
    @Test
    public void search(){
        driver.findElement(By.className("form-control")).sendKeys("vynas");
        driver.findElement(By.id("btn btn--sm secondary hidden-then-sticky")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("btn transparent modal__close-button")).click();
    }
}
