import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest {
    @Test
    public void discount19Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "0", "Discount percent is not correct");
        driver.quit();
    }
    //((//table)[3]//td)[13]
    //((//table)[3]//td)[14]

    @Test
    public void discount20Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "2", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discountAmount() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountValue = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountValue, "4.0", "Discount amount is not correct");
        driver.quit();
    }

    @Test
    public void total() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountValue = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(discountValue, "196.0", "Total is not correct");
        driver.quit();
    }

    @Test
    public void discount49Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("49");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "2", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount50Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount51Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("51");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount99Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("99");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount100Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "4", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount499Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("499");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "4", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount500Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "5", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "5", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount1000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "6", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount4999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("4999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "6", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount5000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "7", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount9999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("9999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "7", "Discount percent is not correct");
        driver.quit();
    }

    @Test
    public void discount10000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=6");
        //<a href="./add_to_cart.py?book_id=6"><img src="../images/add_to_cart.gif" border="0"></a>
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=6']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "8", "Discount percent is not correct");
        driver.quit();
    }
}
