package team07;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Ugur;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.charset.StandardCharsets;

public class US0017 {


    @Test
    public void Test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Ugur ugur = new Ugur();
        Actions actions = new Actions(Driver.getDriver());
        ugur.ilkLoginLinki.click();
        Faker faker = new Faker();

        ugur.usernameBox.click();
        ugur.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
        ugur.passwordBox.click();
        ugur.passwordBox.sendKeys("753159abc");

        ugur.loginButton.click();

        Thread.sleep(1000);
        ugur.signOutLogin.click();
        ugur.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        // actions.sendKeys(Keys.PAGE_DOWN).perform();

        ugur.customersButtonu.click();

        Thread.sleep(1000);
        //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        ugur.addNewButton.click();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String address1 = faker.address().fullAddress();
        String address2 = faker.address().fullAddress();
        String city = faker.address().city();
        String zipCode = faker.address().zipCode();


        actions.click(ugur.userNameCustomer).
                sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)

                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(company)
                .sendKeys(Keys.TAB)
                .sendKeys(phoneNumber)
                .sendKeys(Keys.TAB)
                .sendKeys(address1)
                .sendKeys(Keys.TAB)
                .sendKeys(address2)
                .sendKeys(Keys.TAB)
                .perform();
        Thread.sleep(1000);

        ugur.countryBox1.click();
        Thread.sleep(1000);
        Select select = new Select(ugur.titleCountryBox);


        select.selectByVisibleText("United States (US)");
        Thread.sleep(2000);
        ugur.countryBox1.click();


        actions.sendKeys(Keys.TAB)
                .sendKeys(city)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(zipCode)
                .perform();


        ugur.sameAsBiling.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(company)
                .sendKeys(Keys.TAB)
                .sendKeys(address1)
                .sendKeys(Keys.TAB)
                .sendKeys(address2)
                .sendKeys(Keys.TAB)
                .perform();

        Thread.sleep(2000);

        ugur.countryBox2.click();
        Thread.sleep(2000);
        Select select1 = new Select(ugur.shippingCountryBox);

        select1.selectByVisibleText("United States (US)");
        Thread.sleep(2000);
        ugur.countryBox2.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB)
                .sendKeys(city)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(zipCode)
                .perform();

        ugur.submitButton.click();

        // ugur.bfirstName.sendKeys();
// ugur.bfirstName.click();
    }


    @Test
    public void Test02() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Ugur ugur = new Ugur();
        Actions actions = new Actions(Driver.getDriver());
        ugur.ilkLoginLinki.click();
        Faker faker = new Faker();

        ugur.usernameBox.click();
        ugur.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
        ugur.passwordBox.click();
        ugur.passwordBox.sendKeys("753159abc");

        ugur.loginButton.click();

        Thread.sleep(1000);
        ugur.signOutLogin.click();
        ugur.storeManagerButton.click();
        ReusableMethods.waitFor(3);
         actions.sendKeys(Keys.PAGE_DOWN).perform();

        ugur.customersButtonu.click();

        Thread.sleep(1000);

        ugur.addNewButton.click();
        actions.sendKeys(Keys.TAB).
        click(ugur.userNameCustomer).
                sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
       .sendKeys(Keys.TAB) .perform();


        Thread.sleep(1000);

        ugur.countryBox1.click();
        Thread.sleep(1000);

        Select select = new Select(ugur.titleCountryBox);


        select.selectByVisibleText("United States (US)");
        Thread.sleep(2000);
        ugur.countryBox1.click();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);

                actions.sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
                        actions.sendKeys(faker.address().zipCode())
                .perform();


    }

}