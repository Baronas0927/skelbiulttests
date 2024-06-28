import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class skelbiult {
    public static WebDriver driver;
    public static WebDriver wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        acceptCookies();
    }

    @Test
    public void all() throws InterruptedException {
        search("verpimo ratelis");
        Thread.sleep(500);

        int firstdataline1 = driver.findElements(By.className("first-dataline")).size();
        int firstdataline2 = driver.findElements(By.className("first-dataline")).size();
        int firstdataline3 = driver.findElements(By.className("first-dataline")).size();
        int pages = firstdataline1 + firstdataline2 + firstdataline3;

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[3]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[4]/div[1]/a[3]")).click();
        System.out.println("rasta: " + pages);
        ////html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[4]/div[1]/a[3]


    }

    public void acceptCookies() {
        driver.get("https://www.skelbiu.lt/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void search(String searchWord) {
        driver.findElement(By.id("searchKeyword")).sendKeys(searchWord);
        driver.findElement(By.id("searchButton")).click();
//        driver.findElement(By.id("searchKeyword")).clear();
    }
//    public void stetoskopas(){
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.skelbiu.lt/");
//        driver.findElement(By.id("searchKeyword")).sendKeys("stetoskopas");
//    }
//    public void butas(){
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.skelbiu.lt/");
//        driver.findElement(By.id("searchKeyword")).sendKeys("butas");
//    }
//    public void asjedrhgfsjkhfbsef(){
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.skelbiu.lt/");
//        driver.findElement(By.id("searchKeyword")).sendKeys("asjedrhgfsjkhfbsef");
//    }
}

