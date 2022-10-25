package team07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Aslı;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0015 {

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
       //Kullanici Limit butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.limitButonu);
       //Kullanici Usage limit per coupon / kupon basina kullanım limiti 150 olarak yazar
        ReusableMethods.waitFor(2);
        aslı.usageLimitPerCoupon.sendKeys("150");
       //Kullanici draft butonuna tiklar
        ReusableMethods.waitFor(2);
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
       //Usage limit per coupon / kupon basina kullanim limitinin basarili bir sekilde eklendigi dogrulanir.
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_002() {
        //Limit usage to X items/ Belli urunlere kupon kullanım limiti 175 olarak yazar
        ReusableMethods.jsScrollClick(aslı.limitUsagetoXItems);
        ReusableMethods.waitFor(2);
        aslı.limitUsagetoXItems.sendKeys("175");
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Limit usage to X items/ Belli urunlere kupon kullanım limitinin basarili bir sekilde eklendigi dogrulanir.
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }

    @Test
    public void TC_003() {
        //Usage limit per user / belli kimselere kullanım limiti 3 olarak yazar
        ReusableMethods.jsScrollClick(aslı.usageLimitPerUser);
        ReusableMethods.waitFor(2);
        aslı.usageLimitPerUser.sendKeys("3");
        //Kullanici draft butonuna tiklar
        ReusableMethods.jsScrollClick(aslı.draftButonu);
        ReusableMethods.waitFor(2);
        //Limit usage to X items/ Belli urunlere kupon kullanım limitinin basarili bir sekilde eklendigi dogrulanir.
        Assert.assertTrue(aslı.degisiklikBasarili.isDisplayed());
    }
}
