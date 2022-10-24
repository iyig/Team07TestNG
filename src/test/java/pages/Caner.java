package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Caner {
    public Caner() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(css = ".register.inline-type")
    public WebElement registerHomePage;

    @FindBy (xpath = "//*[text()='Register']")
    public WebElement register03;

    @FindBy (xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeVendor;

    @FindBy (xpath = "//*[text()='Vendor Registration']")
    public WebElement vendorRegHeader;

    @FindBy (xpath = "//*[@id='user_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//*[@id='passoword']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@id='confirm_pwd']")
    public WebElement confirmPasswordBox;

    @FindBy (xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement emailIsRequiredErrorMessage;

    @FindBy (xpath = "//*[@class='wcfm-message email_verification_message wcfm-error']")
    public WebElement emailShouldBeValidMessage;

    @FindBy (xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement verificationCodeBox;

    @FindBy (xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement passwordStrengthMessage;

    @FindBy (xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement userNameBox;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement signInPasswordBox;

    @FindBy (xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement signInButton2; // sign in ekrani


    @FindBy (xpath = "//*[@id='wcfm_membership_registration_submit']")
    public WebElement registerSubmitButton;

    @FindBy (xpath = "//*[text()='Welcome to Pearly Market!']")
    public WebElement successRegister;

    @FindBy (xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement emailExistMessage;

    @FindBy (xpath = "//*[text()='MY ACCOUNT']")
    public WebElement myAccount;

    @FindBy (xpath = "//*[text()='My Orders']")
    public WebElement myOrders;

    @FindBy (xpath = "//*[text()='Downloads']")
    public WebElement downloadsMain;

    @FindBy (xpath = "//*[text()='Addresses']")
    public WebElement addressesMain;

    @FindBy (xpath = "//*[text()='Account Details']")
    public WebElement accountDetailsMain;

    @FindBy (xpath = "//*[text()='Wishlist']")
    public WebElement wishListMain;

    @FindBy (xpath = "//*[text()='Logout']")
    public WebElement logOutMain;

    @FindBy (xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountClickable;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerUnderDashboard;

    @FindBy (xpath = "//*[text()='Orders']")
    public WebElement ordersUnderDashboard;

    @FindBy (xpath = "//*[text()='Downloads']")
    public WebElement downloadsUnderDashboard;

    @FindBy (xpath = "//*[text()='Addresses']")
    public WebElement addressesUnderDashboard;

    @FindBy (xpath = "//*[text()='Account details']")
    public WebElement acoountDetailsUnderDashboard;

    @FindBy (xpath = "//*[text()='Wishlist']")
    public WebElement wishListUnderDashboard;

    @FindBy (xpath = "//*[text()='Support Tickets']")
    public WebElement supportTicketUnderDashboard;


    @FindBy (xpath = "//*[text()='Followings']")
    public WebElement followingsUnderDashboard;

    @FindBy (xpath = "//*[text()='Logout']")
    public WebElement flogOutUnderDashboard;

    @FindBy(xpath = "//*[.='Not right now']")
    public WebElement notRightNowButton;

    @FindBy(css = ".login.logout.inline-type")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logOutManager;

    @FindBy (xpath = "(//*[text()='Cart'])[2]")
    public WebElement cart;



    //================================================================
    //verification code div.email gecici email sitesi locate
    @FindBy(css = "div.email")
    public WebElement geciciEmail;
    @FindBy(css = "a#renew")
    public WebElement emailBoxRefresh;

    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement geciciEmailBox;

    @FindBy(xpath = "//tbody//tr[2]")
    public WebElement onayEmail;

    @FindBy(xpath = "//*[@id='body_content_inner']")
    public WebElement verificationCode;
//tbody>tr>td>div>p>b

    @FindBy(xpath = "//*[.='Visit now ...']")
    public WebElement visitNow;

    @FindBy(css = "#user_email")
    public WebElement registerEmailBox;

//==================================================================================





    @FindBy (xpath = "//*[@class='whsOnd zHQkBf']")
    public WebElement gmailEmailBox;

    @FindBy (xpath = "//*[@class='whsOnd zHQkBf']")
    public WebElement gmailPasswordBox;

    @FindBy (xpath = "//*[text()='Next']")
    public WebElement gmailNextButton;

    @FindBy (xpath = "(//*[@class='yX xY '])[1]")
    public WebElement gmailFirstEmail;

    @FindBy (xpath = "//*[@class='nU n1']")
    public WebElement gmailGelenKutusu;

    @FindBy (xpath = "(//*[@style='margin:0 0 16px'])[2]")
    public List<WebElement> gmailMailMetin;


    //@FindBy (xpath = "(//*[@class='hP']")
    //public List<WebElement> mailHeader;


}
