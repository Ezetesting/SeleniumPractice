package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumscript {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver", "/home/cobel/seleniumpractica/practice/src/main/resources/drivers/chromedriver.exe");

        //initialize browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();

        //Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        //Locator by ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

//        WebElement loginBtn = driver.findElement(By.id("login-button"));

        //Locator by CLASS NAME
//        WebElement loginBtn = driver.findElement(By.className("submit-button"));

        //Locator by Name
//        WebElement loginBtn = driver.findElement(By.name("login-button"));

        //Locator by Xpath
//        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Locator by CSS Selector
        WebElement loginBtn = driver.findElement(By.cssSelector("input.submit-button"));

       //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();








    }
}
