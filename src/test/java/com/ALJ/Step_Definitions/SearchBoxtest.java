package com.ALJ.Step_Definitions;

import com.ALJ.Pages.DashBoardPage;
import com.ALJ.utilities.ConfigurationReader;
import com.ALJ.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class SearchBoxtest {
    DashBoardPage dashBoardPage=new DashBoardPage();

    @Given("the user go to the Toyota home Page")
    public void the_user_go_to_the_Toyota_home_Page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Then("the user verify that search box is seen")
    public void the_user_verify_that_search_box_is_seen() throws InterruptedException {
        Thread.sleep(15000);

       //Boolean status=dashBoardPage.SearchBox.isDisplayed();
       // Assert.assertTrue(status);
        System.out.println("dashBoardPage.MegaAccessories.size() = " + dashBoardPage.MegaAccessories.size());
        System.out.println("dashBoardPage.MegaAccessories.get(0).getText() = " + dashBoardPage.MegaAccessories.get(0).getText());
        System.out.println("dashBoardPage.MegaAccessories.get(1).getText() = " + dashBoardPage.MegaAccessories.get(1).getText());
        System.out.println("dashBoardPage.MegaAccessories.get(2) = " + dashBoardPage.MegaAccessories.get(2).getText());
        System.out.println("dashBoardPage.MegaAccessories.get(3).getText() = " + dashBoardPage.MegaAccessories.get(3).getText());
        Assert.assertEquals(5,dashBoardPage.MegaAccessories.size());
        String actual=dashBoardPage.MegaAccessories.get(2).getText();
        Assert.assertEquals("Exterior",actual);

    }

    @Given("The user verify that Search Button is disabled")
    public void the_user_verify_that_Search_Button_is_disabled() {

        Boolean status= dashBoardPage.SearcButton.isEnabled();
        Assert.assertFalse(status);

    }

    @Then("the user type any letter to search Box")
    public void the_user_type_any_letter_to_search_Box() {
        dashBoardPage.SearchBox.sendKeys("Gasket");

    }

    @Then("The user verify that Search Button is enabled")
    public void the_user_verify_that_Search_Button_is_enabled() {
        Boolean status = dashBoardPage.SearcButton.isEnabled();
        Assert.assertTrue(status);

    }

    @When("the user types {string} on Search Box")
    public void the_user_types_on_Search_Box(String string) throws InterruptedException {
        Thread.sleep(15000);
        dashBoardPage.SearchBox.clear();
        dashBoardPage.SearchBox.sendKeys("Gasket");



    }

    @When("the user click Search button")
    public void the_user_click_Search_button() {
        dashBoardPage.SearcButton.click();

    }

    @Then("the user verify that {string} is written on the car copatitable box")
    public void the_user_verify_that_is_written_on_the_car_copatitable_box(String string) {
        String Text= dashBoardPage.CarCheck.getText();
        Assert.assertEquals(string,Text);

    }
}
