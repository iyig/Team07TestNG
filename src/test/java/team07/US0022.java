package team07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Akif;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0022 {
    @Test
        public void testUS0021(){
            Akif akif = new Akif();
            Actions actions = new Actions(Driver.getDriver());
            //url` ye gidilir
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            //Sign in butonuna tiklanir
            akif.signinButton.click();

            //Gecerli kullanici bilgileri girilir
            actions.click(akif.userNameBox).sendKeys("ahmtaylmz1@gmail.com").sendKeys(Keys.TAB).sendKeys("753159abc")
                    .sendKeys(Keys.TAB).perform();

            //Sign in butonuna tiklanir
            akif.loginButton.click();
            //Hesabim sayfasina giris yapilir

            ReusableMethods.waitFor(2);
            ReusableMethods.jsclick(akif.myAccountButton);
            //Acilan sayfada store manager bolumune tiklanir
            akif.storeManagerButton.click();

            //US0022
            ReusableMethods.jsclick(akif.products);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            akif.indirimli.click();

            //ReusableMethods.jsclick(akif.indirimli);

            ReusableMethods.waitFor(2);
            //Assert.assertTrue(akif.defaultSort.isDisplayed());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            akif.sortByPopularity.click();
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            akif.sortByaverageRating.click();
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            akif.sortBylatest.click();
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            akif.sortByPriceLowHigh.click();
            ReusableMethods.waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            akif.sortByPriceHighLow.click();






        }

    }


