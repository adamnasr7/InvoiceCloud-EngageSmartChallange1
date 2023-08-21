package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HerokuappPage;
import utilities.Driver;

public class InvoiceCloud_EngageSmart_Steps {

    WebDriver driver;
    HerokuappPage herokuappPage;
    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        herokuappPage = new HerokuappPage();
    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Given("the user should see the {string}")
    public void the_user_should_see_the(String string) {
        Assert.assertTrue(herokuappPage.pageHeader.isDisplayed());
    }
    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        for (int i = 0; i < 5; i++) {
            herokuappPage.addElementButton.click();
        }
    }
    @Then("the use should see the {string} button")
    public void the_use_should_see_the_button(String string) {

        for (int i = 0; i < herokuappPage.elementsAdded.size(); i++) {
            Assert.assertTrue(herokuappPage.elementsAdded.get(i).isDisplayed());
        }
    }
}
