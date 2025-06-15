package Pages;

import Baseclass.Library;
import ReusableFunctions.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filter_page extends Library {
     SeleniumReusable se;
    public Filter_page(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='suthUA']//select[@class='Gn+jFg']")
    WebElement MinimumAmount;

    @FindBy(xpath = "//div[@class='tKgS7w']//select[@class='Gn+jFg']")
    WebElement MaximumAmount;

    @FindBy(xpath = "//div[@title='SAMSUNG']//div[@class='XqNaEv']")
    WebElement Brand;

    @FindBy(xpath = "//div[@title='3 GB']//div[@class='XqNaEv']")
    WebElement Ram;

    @FindBy(xpath = "//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp col-2-12']/div[@class='DOjaWF gdgoEp col-12-12']/div[@class='cPHDOP col-12-12']/div[@class='_0BvurA']/section[9]/div[1]//*[name()='svg']")
    WebElement BatteryCapacity;

    @FindBy(xpath = "//div[@title='4000 - 4999 mAh']//div[@class='XqNaEv']")
    WebElement Battery;

    public void Min(){
        se=new SeleniumReusable(driver);
        se.dropdown(MinimumAmount,"10000");
    }

    public void Max(){
        se.dropdown(MaximumAmount, "30000");
    }

    public void brand(){
        se.click(Brand);
    }

    public void Ram(){
        se.Scrolldown(Ram);
        se.click(Ram);
    }
    public void Clickbattery(){
        se.Scrolldown(BatteryCapacity);
        se.click(BatteryCapacity);
        se.click(Battery);
    }




}
