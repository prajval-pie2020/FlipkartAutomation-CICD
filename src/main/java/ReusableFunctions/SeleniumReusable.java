package ReusableFunctions;

import Baseclass.Library;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.time.Duration;

public class SeleniumReusable extends Library {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    

    public SeleniumReusable(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void EnterValue(WebElement element, String Text) {
    	try {
    		element.sendKeys(Text);
    	}
    		catch(Exception e) {
    			System.out.println("No such element Exception");
    		}
    }

    // Click method
    public void click(WebElement element) {
       
    	try {
    		element.click();
    	}
    	catch(Exception e) {
    		System.out.println("Nosuchelement Exception");
    	}
    }

    // Send keys method
    public void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    // Get text from element
    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

  
    public void dropdown(WebElement element, String Text) {
    	Select drp = new Select(element);
    	drp.selectByValue(Text);
    }
    
    public void Scrolldown(WebElement eleemnt) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', {bubbles: true}));", eleemnt);

    }
    
    public void waits() throws InterruptedException {
    	Thread.sleep(2000);
    }
    // Take screenshot and save to given path
    public void screenshot(String filePath) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File(filePath);
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved at: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}