package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Akif {
    public Akif(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signinButton;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginButton;
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountButton;
    @FindBy(xpath = "(//*[.='My Account'])[3]")
    public WebElement myAccountButton2;
    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerButton;
    @FindBy(xpath = "(//span[@class=\"text\"])[14]")
    public WebElement reportsButton;
    @FindBy(xpath = "//*[.='Year']")
    public WebElement yearButton;
    @FindBy(xpath = "//*[.='Last Month']")
    public WebElement lastmouthButton;

    @FindBy(xpath = "//*[.='This Month']")
    public WebElement thismouthButton;
    @FindBy(xpath = "//*[.='Last 7 Days']")
    public WebElement lastsevendayButton;
    @FindBy(xpath = "//*[@id='chart-placeholder-canvas']")
    public WebElement tablo;
    @FindBy(xpath = "//*[@class='wcfm-date-range']")
    public WebElement chooseDate;
    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement products;
    @FindBy(xpath = "(//*[.='indirimli'])[1]")
    public WebElement indirimli;
    @FindBy(xpath = "//*[.='Default sorting']")
    public WebElement defaultSort;
    @FindBy(xpath = "//*[.='Sort by popularity']")
    public WebElement sortByPopularity;
    @FindBy(xpath = "//*[.='Sort by average rating']")
    public WebElement sortByaverageRating;
    @FindBy(xpath = "//*[.='Sort by latest']")
    public WebElement sortBylatest;
    @FindBy(xpath = "//*[.='Sort by price: low to high']")
    public WebElement sortByPriceLowHigh;
    @FindBy(xpath = "//*[.='Sort by price: high to low']")
    public WebElement sortByPriceHighLow;


}
