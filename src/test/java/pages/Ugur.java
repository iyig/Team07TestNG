package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ugur {




    public Ugur(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement ilkLoginLinki;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath ="//button[@name='login']" )
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutLogin;



    @FindBy(xpath ="//a[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//span[@class='wcfmfa fa-user-circle']")
    public WebElement customersButtonu;

   @FindBy(xpath = "//table/thead/tr/th[6]")
    public WebElement getCustomersButtonu;

    @FindBy(xpath = "//span[text()='PDF']")
    public WebElement pdfButton;

    @FindBy(xpath = "//embed[type='application/x-google-chrome-pdf'])[2]")
    public WebElement PdfPage;



    @FindBy(xpath = "//span[text()='Excel']")
    public WebElement excelButton;

    @FindBy(xpath = "//span[text()='CSV']")
    public WebElement csvButton;

    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement addNewButton;


    @FindBy(xpath = "//input[@id='user_name']")
    public WebElement userNameCustomer;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailCustomer;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;


//@FindBy(xpath ="//input[@id='bfirst_name']" )
    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele'])[1]")
    public WebElement bfirstName;


@FindBy(xpath = "//input[@id='blast_name']")
    public WebElement blastLastName;


@FindBy(xpath = "//input[@id='bphone']")
    public WebElement bphoneBox;

@FindBy(xpath = "//input[@id='baddr_1']")
    public WebElement addresBox1;


    @FindBy(xpath = "//input[@id='baddr_2']")
    public WebElement addresBox2;

    @FindBy(xpath = "(//span[@role='combobox'])[1]")
    public WebElement countryBox1;
  // @FindBy(xpath = "(//span[@role='combobox'])[2]")
   // public WebElement countryBox2;
  @FindBy(xpath = " //span[@id='select2-scountry-container']")
  public WebElement countryBox2;


   // @FindBy(xpath="//li[@id='select2-scountry-result-amvo-US']")
  //  public WebElement shippingCountryBox;

    //public WebElement titleCountry;


    @FindBy(xpath= "//select[@id='bcountry']")
    public WebElement titleCountryBox;

    @FindBy(xpath = "//select[@id='bcountry']")
    public WebElement shippingCountryBox;


@FindBy(xpath = "//input[@id='bcity']")
    public WebElement cityBox;

@FindBy(xpath = "//input[@id='bzip']")
    public WebElement postCodeBox;

    @FindBy(xpath = "//input[@id='same_as_billing']")
    public  WebElement sameAsBiling;

    @FindBy(xpath = "//input[@id=sfirst_name']")
    public WebElement bilingFirstName;

    @FindBy(xpath = "//input[@id='slast_name']")
    public WebElement bilingLastName;
@
        FindBy(xpath = "//input[@id='scompany_name']")
        public WebElement bilingCompany;

@FindBy(xpath = "//input[@id='wcfm_customer_submit_button']")
    public WebElement submitButton;



}

