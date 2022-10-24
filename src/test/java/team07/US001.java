package team07;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Caner;
import utilities.*;

import java.util.List;

import static org.testng.TestRunner.PriorityWeight.priority;

public class US001 {
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Caner page= new Caner();
    @Test
    public void TC_001() {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Register" butonuna tiklar
        page.register.click();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();
        //Kullanici "Vendor Registration" sayfasını görüntüler
        String expectedHeader = "Vendor Registration";
        String actualHeader = page.vendorRegHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);

    }

    @Test (priority =1)
    public void TC_002() {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Register" butonuna tiklar
        page.register.click();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();
        // Kullanici açılan sayfada "Email" box olduğunu goruntuler
        Assert.assertTrue(page.emailBox.isDisplayed());

        // Kullanici açılan sayfada "Password" box olduğunu goruntuler
        Assert.assertTrue(page.passwordBox.isDisplayed());

        // Kullanici açılan sayfada "Confirm Password" box olduğunu goruntuler
        Assert.assertTrue(page.confirmPasswordBox.isDisplayed());
    }

    @Test (priority=2)
    public void TC_003() throws InterruptedException {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Register" butonuna tiklar
        page.register.click();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();

        //Kullanici açılan sayfada "Email" kutucugunu tıklar
        page.emailBox.click();

        //Kullanici Email girilmeden kutucugu gecer (TAB)
        actions.sendKeys(Keys.TAB).perform();


        //Kullanici email kutusu bos birakilarak gecildiginde hata mesaji aldigini goruntuler
        Assert.assertTrue(page.emailIsRequiredErrorMessage.isDisplayed());


        //Kullanici email kutusuna gecersiz bir email adresi girer ve kutucugu gecer (TAB)
        page.emailBox.sendKeys("gecersizemail");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);

        //Kullanici geçersiz bir email adresi girdiginde hata mesaji aldigini goruntuler
        Assert.assertTrue(page.emailShouldBeValidMessage.isDisplayed());
    }

    @Test (priority=3)
    public void TC_004() throws InterruptedException {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Register" butonuna tiklar
        page.register.click();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();

        //Kullanici geçerli bir e-posta adresi girer
        page.emailBox.sendKeys(faker.internet().emailAddress());

        //Kullanici "Verification Code"'a tıklar
        actions.sendKeys(Keys.TAB).perform();

        //"Verification Code" alanına rastgele 6 haneli bir sayı girilir
        actions.sendKeys(faker.number().digits(6)).perform();

        //Kullanici sadece küçük harflerden oluşan 8 haneli bir şifre girer
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("abcdefgh").perform();
        //Kullanici ayni şifreyi "Confirm Password" kutusuna da girer
        actions.sendKeys(Keys.TAB)
                .sendKeys("abcdefgh").perform();
        //Kullanici "Register" butonunu tiklar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        //Kullanici ekranda "Password strength should be atleast "Good"." hata mesajı aldigini goruntuler
        Assert.assertTrue(page.passwordStrengthMessage.isDisplayed());
    }

    @Test (priority=4)
    public void TC_005() throws InterruptedException {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String pearlyHandle= Driver.getDriver().getWindowHandle();

        //Kullanici "Register" butonuna tiklar
        page.register.click();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();

        //Kullanici geçerli bir e-posta adresi girer
        VerificationCode.getEmailCode();

        //Kullanici gulch bir password oluşturularak password kutusuna girer
        page.passwordBox.sendKeys("Abcdefgh-01");

        //Kullanici oluşturulan şifreyi "Confirm Password" kutusuna da girer ve şifreyi dogrular
        page.confirmPasswordBox.sendKeys("Abcdefgh-01");
        //Kullanici "Register" butonunu tiklar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //Kullanici kaydın başarılı bir şekilde tamamlandığıni goruntuler
        Assert.assertTrue(page.successRegister.isDisplayed());
        page.notRightNowButton.click();
        ReusableMethods.jsScrollClick(page.logOutManager);

    }

    @Test (priority=5)
    public void TC_006() throws InterruptedException {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Register" butonuna tiklar
        ReusableMethods.jsScrollClick(page.registerHomePage);
        String pearlyHandle= Driver.getDriver().getWindowHandle();

        //Kullanici açılan pencerede "Become a Vendor" tıklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.becomeVendor.click();

        //Kullanici geçerli bir e-posta adresi girer
        page.emailBox.sendKeys("pearlydeneme09@gmail.com");
        //Kullanici "Verification Code" kutusuna tıklar
        actions.sendKeys(Keys.TAB).perform();

        //Kullanici girilen email adresine gelen doğrulama kodunu "Verification Code" kutusuna girer
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get("https://www.gmail.com");
        String gmailHandle=Driver.getDriver().getWindowHandle();
        ReusableMethods.waitFor(2);
        page.gmailEmailBox.sendKeys("pearlydeneme09@gmail.com");
        page.gmailNextButton.click();
        Thread.sleep(5000);
        page.gmailPasswordBox.sendKeys("perly009");
        page.gmailNextButton.click();
        Thread.sleep(3000);
        page.gmailGelenKutusu.click();
        Thread.sleep(3000);
        page.gmailFirstEmail.click();
        List<WebElement> mailHeader = Driver.getDriver().findElements(By.xpath("//*[@class='hP']"));
        String emailBaslik = mailHeader.get(0).getText();
        String [] verificationCode=emailBaslik.split(" ");
        Driver.getDriver().switchTo().window(pearlyHandle);
        page.verificationCodeBox.sendKeys(verificationCode[6]);

        //Kullanici gulch bir password oluşturularak password kutusuna girer
        page.passwordBox.sendKeys("Abcdefgh-01");

        //Kullanici oluşturulan şifreyi "Confirm Password" kutusuna da girer ve şifreyi dogrular
        page.confirmPasswordBox.sendKeys("Abcdefgh-01");
        //Kullanici "Register" butonunu tiklar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //Kullanici kaydın başarılı bir şekilde tamamlandığıni goruntuler
        Assert.assertTrue(page.emailExistMessage.isDisplayed());

    }
}
