package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {

    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h3")
    public WebElement pageHeader;

    @FindBy(css = "div:nth-child(3) > button")
    public WebElement addElementButton;

    @FindBy(xpath ="//div[@id='elements']")
    public List<WebElement> elementsAdded;

}
