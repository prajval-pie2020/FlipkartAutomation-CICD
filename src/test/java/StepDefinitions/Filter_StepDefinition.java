package StepDefinitions;

import Baseclass.Library;
import Pages.Filter_page;
import ReusableFunctions.SeleniumReusable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.logging.Filter;

public class Filter_StepDefinition extends Library {
     Filter_page fp;
     SeleniumReusable se;

    @Then("Select Minimum and Maximum Amount")
    public void select_minimum_and_maximum_amount() throws InterruptedException {
        fp=new Filter_page(driver);
        String BeforeFilter=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]")).getText();
        System.out.println("BEFORE FILTER :"+BeforeFilter);

        fp.Min();
        se=new SeleniumReusable(driver);
        se.waits();
        fp.Max();
        se.waits();


    }
    @Then("Select the Brand")
    public void select_the_brand() throws InterruptedException {
        fp.brand();
        se.waits();
    }
    @Then("Select the Ram")
    public void select_the_ram() throws InterruptedException {
        fp.Ram();
        se.waits();

    }
    @Then("Select the Battery Capacity")
    public void select_the_battery_capacity() throws InterruptedException {
        fp.Clickbattery();
        se.waits();
    }
    @Then("It should display the Relevant result")
    public void it_should_display_the_relevant_result() {
        System.out.println("======Relevant result=======");
        String AfterFilter=driver.findElement(By.xpath("//div[@data-id='MOBFJPAQUNZRTVUX']//div[@class='col col-7-12']")).getText();
        System.out.println("AFTER FILTER :"+AfterFilter);

    }
}
