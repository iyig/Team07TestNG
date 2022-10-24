package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Aslı {
    public Aslı() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButonu;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userEmail;
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountButonu;
    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;
    @FindBy(xpath = "(//*[@class='text'])[6]")
    public WebElement couponsButonnu;
    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNewButonu;
    @FindBy(xpath = "//*[@id='title']")
    public WebElement codeTextBox;
    @FindBy(xpath = "(//*[@class='wcfm_submit_button'])[1]")
    public WebElement submitButonu;
    @FindBy(xpath = "//*[contains(text(),'Coupon Successfully Published')]")
    public WebElement basariliGiris;

}
