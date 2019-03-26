import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;



public class FunctionalClass extends WebDriverSetting implements FuncInterface {

    public boolean isElementPresent(String loc) {
        try {
            driver.findElement(By.className(loc));
            System.out.println("Element exist");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return false;
        }
    }

}
