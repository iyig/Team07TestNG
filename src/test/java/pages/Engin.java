package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Engin {
    public Engin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement singIn;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement singin2;

    @FindBy (id = "menu-item-1079")
    public WebElement myAccount;

    @FindBy (xpath = "//h2[@class='page-title']")
    public WebElement myAccountDisplayd;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath = "(//*[@class='wcfm_menu_item '])[7]")
    public WebElement refund;

    @FindBy (xpath = "//span[@class='wcfm_dashboard_item_title']")
    public WebElement requestId;

    @FindBy (xpath = "//*[text()='#15384']")
    public WebElement orderId;

    @FindBy (xpath = "(//*[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement amount;

    @FindBy(xpath = "//*[text()='Partial Refund']")
    public WebElement type;

    @FindBy (xpath = "//*[text()='farklı beden']")
    public WebElement reason;

    @FindBy (xpath = "(//span[@class='text'])[11]")
    public WebElement followers;

    @FindBy (xpath = "//*[@class='dataTables_empty']")
    public WebElement empty;

    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> table;
}