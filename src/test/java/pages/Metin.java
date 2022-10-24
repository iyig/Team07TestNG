package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Metin {

    public Metin() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//span[normalize-space()='Sign In']")
    public WebElement girisYap;
    @FindBy (xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy (xpath = "//button[@name='login']")
    public WebElement girisYap2;

    @FindBy (xpath = "//a[normalize-space()='My Orders']")
    public WebElement myOrders;

    @FindBy (xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    public WebElement browseProducts;
    @FindBy (xpath = "//a[@aria-label=\"Add “2'li yastık kılıfı” to your cart\"]")
    public WebElement birinciUrun;
    @FindBy (xpath = "//a[@aria-label='Add “Abra A5 V19.3.4 15,6\" Oyun Bilgisayarı” to your cart']")
    public WebElement ikinciUrun;

    @FindBy (xpath = "//a[@aria-label='Add “Adidas Erkek Ayakkabı” to your cart']")
    public WebElement ucuncuUrun;

    @FindBy (xpath = "//a[@aria-label='Add “aiü” to your cart']")
    public WebElement dorduncuUrun;

    @FindBy (xpath = "//a[@aria-label='Add “Apple Iphone 14” to your cart']")
    public WebElement besinciUrun;

    @FindBy (xpath = "//a[@class='cart-toggle']//i[@class='w-icon-cart']")
    public WebElement sepetim;

    @FindBy (xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkout;
    @FindBy (xpath = "//input[@id='billing_first_name']")
    public WebElement faturaBilgileri;

    @FindBy (xpath = "//button[@id='place_order']")
    public WebElement placeOrder;

    @FindBy (xpath = "//button[@id='place_order']")
    public WebElement siparisAlindi;

    @FindBy (xpath = "//a[contains(text(),'My Account')]")
    public WebElement hesabim;

    @FindBy (xpath = "//a[normalize-space()='Orders']")
    public WebElement orders;

    @FindBy (xpath = "//a[contains(text(),'My Account')]")
    public WebElement alisverisedevametbuttom;

    @FindBy (xpath = "//div[contains(@class,'animated- slide-animate none show-content')]//a[contains(@class,'btn btn-solid btn-lg btn-rounded btn-primary btn-icon-right')][normalize-space()='Shop Now']")
    public WebElement shopNow;

    @FindBy (xpath = "//div[@class='product-loop product-default content-center product type-product post-13962 status-publish onbackorder product_cat-cosmetic-men product_cat-men product_cat-new-arrivals has-post-thumbnail sale shipping-taxable purchasable product-type-simple']//img[2]")
    public WebElement urun;

    @FindBy (xpath = "//button[@name='add-to-cart']")
    public WebElement addChart;

    @FindBy (xpath = "//a[@class='cart-toggle']//span[@class='cart-count'][normalize-space()='1']")
    public WebElement chart;
    @FindBy (xpath = "//a[@class='cart-toggle']//i[@class='w-icon-cart']")
    public WebElement chart2;
    @FindBy (xpath = "//a[@class='button wc-forward']")
    public WebElement viewChart;

    @FindBy (xpath = "//td[@class='product-thumbnail']//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public WebElement sepettekiUrunResmi;

    @FindBy (xpath = "//td[@class='product-thumbnail']//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public WebElement sepettekiFiyat;

    @FindBy (xpath = "//td[@class='product-price']//bdi[1]")
    public WebElement sepettekiUrunMiktari;

    @FindBy (xpath = "//td[@class='product-subtotal']//bdi[1]")
    public WebElement sepettekiToplamFiyat;

    @FindBy (xpath = "//input[@id='quantity_63562924b8a5e']")
    public WebElement sepettekiUrunMiktariKutusu;

    @FindBy (xpath = "//button[@title='Plus']")
    public WebElement urunArttirmaTusu;

    @FindBy (xpath = "//button[@title='Minus']")
    public WebElement urunEksiltmeTusu;

    @FindBy (xpath = "//input[@id='quantity_63510023bbb5b']")
    public WebElement sepettekiYeniMiktar;

    @FindBy (xpath = "//a[contains(text(),'Home')]")
    public WebElement home;

    @FindBy (xpath = "//input[@id='quantity_635104e2263a3']")
    public WebElement quantity;

    @FindBy (xpath = "//p[@class='stock in-stock']")
    public WebElement asusStokMiktarı;

    @FindBy (xpath = "//input[@id='quantity_635631b3c159a']")
    public WebElement asusQuantityBox;

    @FindBy (xpath = "//button[@name='clear_cart']")
    public WebElement clearChart;

    @FindBy (xpath = "//div[@role='alert']")
    public WebElement sepetBosYazisi;

    @FindBy (xpath = "//a[@class='button wc-backward btn btn-rounded btn-dark']")
    public WebElement magazayaDon;

    @FindBy (xpath = "//div[contains(@class,'product-loop product-default content-center product type-product post-14339 status-publish last instock product_cat-computer-tablet has-post-thumbnail virtual sold-individually purchasable product-type-simple')]//img[2]")
    public WebElement urunLaptop;

    @FindBy (xpath = "//button[@name='apply_coupon']")
    public WebElement applyCoupon;

    @FindBy (xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alışveriseDevamEt;

    @FindBy (xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alısverisiTamamla;

    @FindBy (xpath = "//td[@class='product-name']//span[contains(text(),'Abra A5 V19.3.4 15,6\" Oyun Bilgisayarı')]")
    public WebElement kargoBilgileri;


    @FindBy (xpath = "//h3[@class='cart-title']")
    public WebElement chartTotals;
    @FindBy (xpath = "//tr[@class='order-total']//bdi[1]")
    public WebElement toplamFiyat;

    @FindBy (xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement siparişAlındı;

    @FindBy (xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement satınAl;

}