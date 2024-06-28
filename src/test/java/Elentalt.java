import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Elentalt {
    public static WebDriver driver;

    @Test
    public void Upload() throws InterruptedException {
        //vardas 3-20 simbolių, raidės skaičiai ir tarpai galimi
        //passwordas 8 simboliai maža, didelė raidė, skaicius, 8 simboliai. viskas kartu privaloma
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=AutoMoto_Automobiliai&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("GAZ-52");
        driver.findElement(By.id("text")).sendKeys("blabla");
        driver.findElement(By.id("price")).sendKeys("1000");
        driver.findElement(By.id("location-search-box")).sendKeys("marsas");
        driver.findElement(By.id("phone")).sendKeys("861748613");
        driver.findElement(By.id("email")).sendKeys("blah@blah.com");
        driver.findElement(By.id("submit-button")).click();
        WebElement uploadElement = driver.findElement(By.id("inputfile"));
        uploadElement.sendKeys("C:\\Users\\Dovydas\\Desktop\\licensed-image.jpg");
        Thread.sleep(600);
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();

    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        AcceptCookies();
    }

    public void AcceptCookies() {
        driver.get("https://www.elenta.lt/");
        driver.findElement(By.className("fc-cta-consent")).click();

    }
}

