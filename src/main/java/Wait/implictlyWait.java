package Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implictlyWait {
//  Indica al webdriver que espere X cantidad de tiempo antes de que aparezca la exepcion: No Such Element Exception
//  AUMENTA EL TIEMPO DE EJECUCION: Hace que cada comando espere el tiempo definido

    public static void main(String[] args) throws InterruptedException {
        String url = "https://demoqa.com/dynamic-properties";

        System.setProperty("Webdriver.Chrome.driver", "/home/cobel/seleniumpractica/practice/src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get(url);

        try{
            WebElement button = driver.findElement(By.id("visibleAfter"));
            button.click();
            System.out.println("Boton clicked");
        }catch(Exception e){
            System.out.println(e);
        }



    }
}