package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US003 {
    @Test
    public void US003() throws InterruptedException {
        Metin pearlyPage = new Metin();

        // 1- https://pearlymarket.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // 2- Giris Yap/Uye Ol butonuna basiniz
        pearlyPage.girisYap.click();

        // 3- Uygun email ve sifre giriniz.
        pearlyPage.username.sendKeys(ConfigReader.getProperty("email"));
        pearlyPage.password.sendKeys(ConfigReader.getProperty("sifre"));
        pearlyPage.girisYap2.click();

        // 4- myorders butonuna tiklayin
        ReusableMethods.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", pearlyPage.myOrders);
        //pearlyPage.myOrders.click();

        // 5- browse products (view)
        js.executeScript("arguments[0].click();", pearlyPage.browseProducts);
        //pearlyPage.browseProducts.click();

        // 6- sepete 5 urun ekle

        /*WebDriver driver=new ChromeDriver();
        driver.get(driver.getCurrentUrl());
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='product-loop product-default content-center product type-product post-13861 status-publish first instock product_cat-best-seller product_cat-electronics product_cat-trending has-post-thumbnail sale virtual purchasable product-type-simple']//img[2]"))).perform();
        driver.findElement(By.xpath("//div[@class='product-loop product-default content-center product type-product post-13861 status-publish first instock product_cat-best-seller product_cat-electronics product_cat-trending has-post-thumbnail sale virtual purchasable product-type-simple']//a[@aria-label='Add “USB Receipt” to your cart'][normalize-space()='Add to cart']")).click();
        */
        js.executeScript("arguments[0].click();", pearlyPage.birinciUrun);
        js.executeScript("arguments[0].click();", pearlyPage.ikinciUrun);
        js.executeScript("arguments[0].click();", pearlyPage.ucuncuUrun);
        js.executeScript("arguments[0].click();", pearlyPage.dorduncuUrun);
        js.executeScript("arguments[0].click();", pearlyPage.besinciUrun);
        //  pearlyPage.birinciUrun.click();
        //  pearlyPage.ikinciUrun.click();
        //  pearlyPage.ucuncuUrun.click();
        //  pearlyPage.dorduncuUrun.click();
        //  pearlyPage.besinciUrun.click();

        // 7- sepetim ve odeme butonuna bas
        pearlyPage.sepetim.click();
        pearlyPage.checkout.click();

        // 8- Fatura detaylarını eksiksiz olarak gir

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        actions.click(pearlyPage.faturaBilgileri)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys("571")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .perform();
        ReusableMethods.waitFor(5);
        // 9- siparisi onayla butonuna bas ve siparisin onaylandigini dogrula
        js.executeScript("arguments[0].click();", pearlyPage.placeOrder);
        // pearlyPage.placeOrder.click();
        Assert.assertTrue(pearlyPage.siparisAlindi.isDisplayed(), "Siparisiniz Alinmistir");
        ReusableMethods.waitFor(5);
    }
}
