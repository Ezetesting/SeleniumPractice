package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumscript {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver", "/home/cobel/seleniumpractica/practice/src/main/resources/drivers/chromedriver.exe");

        //initialize browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();

        //estos son los menu de inicio



    }
}
