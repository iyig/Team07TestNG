package team07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Aslı;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US0013 {
    Aslı aslı;

    @Test
    public void TC_001() {

        //Kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanici Sign In tiklar
        aslı = new Aslı();
        aslı.signInButonu.click();
        //Kullanici gecerli e-mail 'i girer
        aslı.userEmail.sendKeys(ConfigReader.getProperty("email"));
        //Kullanici gecerli password girer
        ReusableMethods.waitFor(3);
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();
        //Kullanici SIGN IN butonuna tiklar
        ReusableMethods.waitFor(3);
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //Kullanici My Account butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.myAccountButonu);
        //Kullanici Store Manager butonuna tiklar
        ReusableMethods.waitFor(2);
        aslı.storeManagerButonu.click();
        //Kullanici Coupons butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.couponsButonnu);
        //Kullanici Add New butonuna tiklar
        ReusableMethods.waitFor(2);
        aslı.addNewButonu.click();
        //Kullanici code metin kutusuna rastgele 8 basamakli sayi girer
        ReusableMethods.waitFor(2);
        aslı.codeTextBox.sendKeys(ReusableMethods.getFaker().code().ean8());
        //Kullanici submit butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.submitButonu);
        //Coupon kodu verildigi dogrulanir
        ReusableMethods.waitForVisibility(aslı.basariliGiris, 5);
        Assert.assertTrue(aslı.basariliGiris.isDisplayed());

    }

    @Test
    public void TC_002() {

        //Kullanici tanimlama metin kutusuna 'Yildiz urunlerde gecerli' yazar
        ReusableMethods.waitFor(2);
        aslı.descriptionTextBox.sendKeys("Yildiz urunlerde gecerli");
        ReusableMethods.waitFor(2);
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        //Tanimlama metin kutusuna tanimlama yazilabildigi dogrulanir
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());

    }

    @Test
    public void TC_003() {
        //Kullanici Indirim sekli metin kutusunun tiklar
        //Kullanici Percentage discount secenegini secer
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.discountTypeTextBox);
        ReusableMethods.waitFor(2);
        Select select = new Select(aslı.discountTypeTextBox);
        ReusableMethods.waitFor(2);
        select.selectByValue("percent");
        //Kullanici draft butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        //Indirim sekli metin kutusunun secilebilir oldugu dogrulanir
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());

    }

    @Test
    public void TC_004() {

        //Kullanici coupon amout metin kutusuna '140' olarak girer
        aslı.couponAmountTextBox.clear();
        ReusableMethods.waitFor(2);
        aslı.couponAmountTextBox.sendKeys("140");
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Coupon amout metin kutusuna giris yapilabildigi dogrulanir
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_005() {

        //Coupon expiry date / urun kuponu son kullanım tarihi metin kutusuna tarih girilir
        aslı.couponExpiryDate.sendKeys("2022-10-31");
        ReusableMethods.waitFor(2);
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Coupon expiry date / urun kuponu son kullanım tarihi metin kutusuna tarih girildigi dogrulanir
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_006() {

        //Kullanici Free shipping secimi yapilir
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
        ReusableMethods.waitFor(2);
    }

    @Test
    public void TC_007() {

        //Kullanici Free shipping secimi yapilir
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
        ReusableMethods.waitFor(2);
    }
}
