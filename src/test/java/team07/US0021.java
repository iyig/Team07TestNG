package team07;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Akif;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0021 {
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
        //Acilan sayfada reports butonuna tiklanir
        ReusableMethods.jsclick(akif.reportsButton);
        //Yillik rakamlar, en son ay, icinde bulunan ay, en son 7 gun butonunun gorunur oldugu test edilir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        akif.yearButton.click();
        Assert.assertTrue(akif.yearButton.isDisplayed());
        Assert.assertTrue(akif.tablo.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        akif.lastmouthButton.click();
        Assert.assertTrue(akif.tablo.isDisplayed());
        Assert.assertTrue(akif.lastmouthButton.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        akif.thismouthButton.click();
        Assert.assertTrue(akif.tablo.isDisplayed());
        Assert.assertTrue(akif.thismouthButton.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        akif.lastsevendayButton.click();
        Assert.assertTrue(akif.tablo.isDisplayed());
        Assert.assertTrue(akif.lastsevendayButton.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        akif.chooseDate.click();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys("2022-10-03 to 2022-10-17").sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(akif.tablo.isDisplayed());
        ReusableMethods.waitFor(2);
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
