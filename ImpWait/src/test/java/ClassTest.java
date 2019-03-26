import org.junit.Test;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ClassTest extends FunctionalClass {

    @Test

    public void test() {
        driver.get("http://www.rozetka.com.ua");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.name("search")).sendKeys("Ноутбук");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        if (driver.findElement(By.className("button-inner")).isEnabled()) {

            System.out.println("Element is clickable");

            driver.findElement(By.className("button-inner")).click();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            isElementPresent("pab-h4");
            driver.quit();
        } else {
            System.out.println("Element is not  clickable");
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

    }

}
