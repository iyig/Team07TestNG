package team07;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Aslı;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0013 {
    Aslı aslı;
    @Test
    public void TC_001() {

       //Kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       //Kullanici Sign In tiklar
        aslı=new Aslı();
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
        ReusableMethods.
       //Kullanici Store Manager butonuna tiklar
       //Kullanici Coupons butonuna tiklar
       //Kullanici Add New butonuna tiklar
       //Kullanici code metin kutusuna rastgele 8 basamakli sayi girer
       //Kullanici submit butonuna tiklar
       //Coupon kodu verildigi dogrulanir
       //Sayfa kapatilir
    }
}
