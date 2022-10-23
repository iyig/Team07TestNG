package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Aybuke {

    public Aybuke() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public static WebElement signin;

    @FindBy(xpath = "//*[@id='username']")
    public static WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public static WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public static WebElement ikinciSignin;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public static WebElement myAccount;


    @FindBy(xpath = "//*[text()='Store Manager']")
    public static WebElement storeManager;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public static WebElement products;

    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public static WebElement addNewProduct;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    public static WebElement virtualButton;

    @FindBy(id = "pro_title")
    public static WebElement proTitle;

    @FindBy(id = "featured_img_display")
    public static WebElement buyukResim;

    @FindBy(xpath = "//*[@id='menu-item-browse']")
    public static WebElement medyaLibraryButton;

    @FindBy(xpath = "(//*[@class='thumbnail'])[6]")
    public static WebElement eklenecekUrununResmi;

    @FindBy(xpath = "(//*[@class='media-toolbar-primary search-form'])[2]")
    public static WebElement selectButton;

    @FindBy(id = "gallery_img_gimage_0_display")
    public static WebElement kucukResim;

    @FindBy(xpath = "(//*[@class='thumbnail'])[15]")
    public static WebElement eklenecekUrununResmi2;

    @FindBy(xpath = "(//*[@type='checkbox'])[18]")
    public static WebElement clothingCategory;

    @FindBy(xpath = "(//*[text()='Add to Gallery'])[3]")
    public static WebElement addToGalleryButton;

    @FindBy(xpath = "(//*[text()='Product brands'])[1]")
    public static WebElement productBrandsMenu;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_brand '])[2]")
    public static WebElement  adidasCheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[121]")
    public static WebElement greenGrassCheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[113]")
    public static WebElement dRcheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[116]")
    public static WebElement elegantAutoGroupCheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[126]")
    public static WebElement homeDesignCheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[132]")
    public static WebElement lCwCheckbox;

    @FindBy(xpath = "(//*[@type='checkbox'])[137]")
    public static WebElement nikeCkeckbox;

    @FindBy(xpath = "//*[@id='sku']")
    public static WebElement skuTextBox;

    @FindBy(xpath = "//*[@id='manage_stock']")
    public static WebElement manageStockClickBox;

    @FindBy(xpath = "//*[@id='stock_qty']")
    public static WebElement stockQtyTextBox;

    @FindBy(xpath = "(//*[text()='Allow Backorders?'])[1]")
    public static WebElement allowBackorders;

    @FindBy(xpath = "//*[@id='backorders']")
    public static WebElement allowBackordersClickBox;

    @FindBy(xpath = "//*[text()='Do not Allow']")
    public static WebElement doNotAllow;

    @FindBy(xpath = "//*[text()='Allow, but notify customer']")
    public static WebElement allowButNotifyCustomer;

    @FindBy(xpath = "//*[text()='Allow']")
    public static WebElement allow;

    @FindBy(xpath = "//*[@id='sold_individually']")
    public static WebElement soldIndividuallyClickBox;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public static WebElement submitButton;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-success']")
    public static WebElement successMessage;

}
