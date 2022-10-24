package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Beyza {

    public Beyza(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath = ("(//*[@class='text'])[4]"))
    public WebElement products;

    @FindBy (xpath = ("(//*[text()='Status'])[1]"))
    public WebElement status;

    @FindBy (xpath = ("(//*[text()='Stock'])[1]"))
    public WebElement stock;

    @FindBy (xpath = ("(//*[text()='Price'])[1]"))
    public WebElement price;

    @FindBy (xpath = ("(//*[text()='Date'])[1]"))
    public WebElement date;

    @FindBy (xpath = ("(//*[text()='Add New'])[1]"))
    public WebElement addNew;

    @FindBy (xpath = ("(//*[text()='Virtual'])[1]"))
    public WebElement virtual;

    @FindBy(xpath = ("(//*[text()='Downloadable'])[1]"))
    public WebElement downloadable;

    @FindBy (xpath = ("//*[@id='pro_title']"))
    public WebElement productTitle;

    @FindBy (xpath = ("//*[@id='featured_img_display']"))
    public WebElement bigPhoto;

    @FindBy (xpath = ("//*[text()='Select']"))
    public WebElement select1;

    @FindBy (xpath = ("//*[@id='gallery_img_gimage_0_display']"))
    public WebElement photo;

    @FindBy (xpath = ("(//*[@class='thumbnail'])[1]"))
    public WebElement photo1;

    @FindBy (xpath = ("(//*[@class='thumbnail'])[10]"))
    public WebElement photo2;

    @FindBy (xpath = ("//*[text()='Media Library']"))
    public WebElement mediaLibrary1;

    @FindBy (xpath = ("(//*[text()='Media Library'])[2]"))
    public WebElement mediaLibrary2;

    @FindBy (xpath = ("(//*[text()='Add to Gallery'])[3]"))
    public WebElement addToGallery;

    @FindBy (xpath = ("//*[@id='gallery_img_gimage_0_display']"))
    public WebElement eklenenPhoto;

    @FindBy (xpath = ("(//*[text()='Categories'])[1]"))
    public WebElement categories;

    @FindBy (xpath = ("//*[@id='product_cats_checklist']"))
    public List<WebElement> categoriesList;

    @FindBy (xpath = ("(//*[@value='229'])[1]"))
    public WebElement urunIlk;

    @FindBy (xpath = ("//*[@id='wcfm_products_simple_submit_button']"))
    public  WebElement submit;

    @FindBy (xpath = ("//*[text()='Published']"))
    public  WebElement published;

    @FindBy (xpath = ("//*[@class='wcfm-message wcfm-success']"))
    public  WebElement succesfullyPublished;

    @FindBy (xpath = ("(//*[@value='229'])[1]"))
    public  WebElement urun1;

    @FindBy (xpath = ("(//*[@value='232'])[1]"))
    public  WebElement urun2;

    @FindBy (xpath = ("(//*[@value='230'])[1]"))
    public  WebElement urun3;

    @FindBy (xpath = ("(//*[@value='345'])[1]"))
    public  WebElement urun4;

    @FindBy (xpath = ("(//*[@value='397'])[1]"))
    public  WebElement urun5;

    @FindBy (xpath = ("(//*[@value='235'])[1]"))
    public  WebElement urun6;

    @FindBy (xpath = ("(//*[@value='228'])[1]"))
    public  WebElement urun7;

    @FindBy (xpath = ("(//*[@value='353'])[1]"))
    public  WebElement urun8;

    @FindBy (xpath = ("(//*[@value='352'])[1]"))
    public  WebElement urun9;

    @FindBy (xpath = ("(//*[@value='226'])[1]"))
    public  WebElement urun10;

    @FindBy (xpath = ("(//*[@value='15'])[1]"))
    public  WebElement urun11;

    @FindBy (xpath = ("(//*[@value='351'])[1]"))
    public  WebElement urun12;

}
