package team07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Aslı;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0014 {
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
        //Kullanici Minimum spend metin kutusuna 100 yazar
        ReusableMethods.waitFor(2);
        aslı.minimumSpendTextBox.sendKeys("100");
        //Kullanici draft butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Minimum spend metin kutusuna basarili giris yapildigi dogrulanir
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_002() {

        //Kullanici Maximum spend metin kutusuna 200 yazar
        aslı.maximumSpendTextBox.sendKeys("200");
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Minimum spend metin kutusuna basarili giris yapildigi dogrulanir
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_003() {
        //Individual use only / kisisel kullanım sadece secenegi oldugu dogrulanir
        ReusableMethods.jsScrollClick(aslı.individualUseOnly);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.individualUseOnly.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Test
    public void TC_004() {
        //Exclude sale items / bazi satis ürünleri disinda tut secenegi secilebildigi dogrulanir
        aslı.excludeSaleItems.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(aslı.excludeSaleItems.isSelected());
    }

    @Test
    public void TC_005() {

       //Kullanici Exclude categories metin kutusundan Music,Film,Cok satanlar kategorilerini secer
        aslı.excludeCategories.sendKeys("Fashion",Keys.ENTER);
        ReusableMethods.waitFor(2);
       //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
       //Exclude categories / bazi kategorileri disinda tut seceneginde basarili bir sekilde secim yapildigi dogrulanir
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }
}
