package team07;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Beyza;
import utilities.ConfigReader;
import utilities.Driver;
public class US006 {

    @Test
    public void test01(){

        Beyza beyza = new Beyza();
        Actions actions = new Actions(Driver.getDriver());

        //Kullanıcı https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı Sign-in sekmesine tiklar
        beyza.signIn.click();
        //Kullanıcı Username girer
        beyza.username.sendKeys("ahmtaylmz1@gmail.com");
        //Store Manager Password girer
        beyza.password.sendKeys("753159abc");
        //Kullanıcı Sign-in butonuna tiklar
        beyza.signInButton.click();
        //Kullanıcı 'Sign-Out' sekmesine tiklar
        beyza.signOut.click();
        //Kullanıcı sekmesine tiklar
        beyza.storeManager.click();
        //Kullanıcı Products sekmesine tiklar
        beyza.products.click();
        //Kullanıcı add new butonuna tıklar
        beyza.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Categories menusunun gorunur oldugunu dogrular
        Assert.assertTrue(beyza.categories.isDisplayed());
        //Kullanıcı secilen urunlerin kategorilerini gorunurlugunu dogrular
        for (WebElement w:beyza.categoriesList) {
            Assert.assertTrue(w.isDisplayed());
            //System.out.println(w.getText());

            //Kullanıcı 'Accessories' kategorisine tıklar
            //Kullanıcı 'Accessories' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun1.isSelected());
            beyza.urun1.click();
            //Kullanıcı 'Books & Music & Film' kategorisine tıklar
            //Kullanıcı 'Books & Music & Film' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun2.isSelected());
            beyza.urun2.click();
            //Kullanıcı 'Electronics' kategorisine tıklar
            //Kullanıcı 'Electronics' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun3.isSelected());
            beyza.urun3.click();
            //Kullanıcı 'Food' kategorisine tıklar
            //Kullanıcı 'Food' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun4.isSelected());
            beyza.urun4.click();
            //Kullanıcı 'Gift Ideas' kategorisine tıklar
            //Kullanıcı 'Gift Ideas' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun5.isSelected());
            beyza.urun5.click();
            //Kullanıcı 'Health & Beauty' kategorisine tıklar
            //Kullanıcı 'Health & Beauty' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun6.isSelected());
            beyza.urun6.click();
            //Kullanıcı 'Home & Garden' kategorisine tıklar
            //Kullanıcı 'Home & Garden' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun7.isSelected());
            beyza.urun7.click();
            //Kullanıcı 'Kids' kategorisine tıklar
            //Kullanıcı 'Kids' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun8.isSelected());
            beyza.urun8.click();
            //Kullanıcı 'Men' kategorisine tıklar
            //Kullanıcı 'Men' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun9.isSelected());
            beyza.urun9.click();
            //Kullanıcı 'New Arrivals' kategorisine tıklar
            //Kullanıcı 'New Arrivals' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun10.isSelected());
            beyza.urun10.click();
            //Kullanıcı 'Uncategorized' kategorisine tıklar
            //Kullanıcı 'Uncategorized' kategorisinin secildigini dogrular
            Assert.assertFalse(beyza.urun11.isSelected());
            beyza.urun11.click();
            Driver.closeDriver();

        }
    }
}
