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
    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionTextBox;
    @FindBy(xpath = "//*[@id='wcfm_coupon_manager_draft_button']")
    public WebElement draftButonu;
    @FindBy(xpath = "//*[text()='Coupon Successfully Saved.']")
    public WebElement degisiklikBasarili;
    @FindBy(xpath = "//*[@id='discount_type']")
    public WebElement discountTypeTextBox;
    @FindBy(xpath = "//*[@id='coupon_amount']")
    public WebElement couponAmountTextBox;
    @FindBy(xpath = "//*[@id='expiry_date']")
    public WebElement couponExpiryDate;
    @FindBy(xpath = "//*[@id='minimum_amount']")
    public WebElement minimumSpendTextBox;
    @FindBy(xpath = "//*[@id='maximum_amount']")
    public WebElement maximumSpendTextBox;
    @FindBy(xpath = "//*[@id='individual_use']")
    public WebElement individualUseOnly;
    @FindBy(xpath = "//*[@id='exclude_sale_items']")
    public WebElement excludeSaleItems;
    @FindBy(xpath = "(//*[@class='select2-search__field'])[4]")
    public WebElement excludeCategories;
    @FindBy(xpath = "//*[@id='coupons_manage_limit']")
    public WebElement limitButonu;
    @FindBy(xpath = "//*[@id='usage_limit']")
    public WebElement usageLimitPerCoupon;
    @FindBy(xpath = "//*[@id='limit_usage_to_x_items']")
    public WebElement limitUsagetoXItems;
    @FindBy(xpath = "//*[@id='usage_limit_per_user']")
    public WebElement usageLimitPerUser;

}
