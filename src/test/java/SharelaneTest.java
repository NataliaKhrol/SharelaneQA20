import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SharelaneTest {

    @Test
    public void zipCode4Digits() {
        // 1. Открыть браузер
        // 2. Зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.quit();
    }
    @Test
    public void zipCode5Digits (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.quit();

    }

    @Test
    public void zipCode6Digits () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.quit();

    }
    @Test
    public void signUp (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("Rada");
        browser.quit();
    }
    @Test
    public void signUpLastName () {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    WebDriver browser = new ChromeDriver();
    browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
    browser.findElement(By.name("last_name")).sendKeys("Radan");
    browser.quit();
    }
    @Test
    public void signUpEmail () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.name("email")).sendKeys("radan@yahoo.com");
        driver.quit();
    }

    @Test
    public void signUpPassword () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.name("password1")).sendKeys("ups4");
        driver.quit();
    }
    @Test
    public void signUpConfirmPassword () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.name("password2")).sendKeys("ups4");
        driver.quit();
    }
}
