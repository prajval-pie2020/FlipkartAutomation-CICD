package Pages;

import Baseclass.Library;
import ReusableFunctions.SeleniumReusable;
import gherkin.lexer.Pa;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchPage extends Library {
     SeleniumReusable se;
    public SearchPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement Searchtext;

    @FindBy(xpath = "//html[@lang='en-IN']")
    public WebElement Homepage;

    @FindBy(xpath = "//div[@id='container']")
    public WebElement Searchresult;


    public void Search(String text){
         se=new SeleniumReusable(driver);
        se.EnterValue(Searchtext,text);
    }

    public void ClickSearch(){
        Searchtext.sendKeys(Keys.ENTER);
    }

    public void Homescreen(){
        System.out.println(Homepage.isDisplayed());
    }

    public void Result(){
        System.out.println(Searchresult.isDisplayed());
        System.out.println(driver.getTitle());
    }

}
