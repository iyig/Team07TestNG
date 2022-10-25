package team07;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Ugur;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0016 {


        @Test
        public void Test01(){
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            Ugur ugur=new Ugur();

            Actions actions = new Actions(Driver.getDriver());
            ugur.ilkLoginLinki.click();

            ugur.usernameBox.click();
            ugur.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
            ugur.passwordBox.click();
            ugur.passwordBox.sendKeys("753159abc");

            ugur.loginButton.click();


            ugur.signOutLogin.click();
            ugur.storeManagerButton.click();
            ReusableMethods.waitFor(3);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ugur.customersButtonu.click();

            Assert.assertTrue(ugur.getCustomersButtonu.isDisplayed());
            Driver.closeDriver();
        }

        @Test
        public void Test02(){
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            Ugur ugur=new Ugur();

            Actions actions = new Actions(Driver.getDriver());
            ugur.ilkLoginLinki.click();

            ugur.usernameBox.click();
            ugur.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
            ugur.passwordBox.click();
            ugur.passwordBox.sendKeys("753159abc");

            ugur.loginButton.click();


            ugur.signOutLogin.click();
            ugur.storeManagerButton.click();
            ReusableMethods.waitFor(5);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ugur.customersButtonu.click();

            ugur.pdfButton.click();

            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(5);
            ugur.excelButton.click();
            // actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(5);

            ugur.csvButton.click();

            Driver.closeDriver();
        }


        @Test
        public void Test03(){
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            Ugur ugur=new Ugur();
            Faker faker=new Faker();
            Actions actions = new Actions(Driver.getDriver());
            ugur.ilkLoginLinki.click();

            ugur.usernameBox.click();
            ugur.usernameBox.sendKeys("ahmtaylmz1@gmail.com");
            ugur.passwordBox.click();
            ugur.passwordBox.sendKeys("753159abc");

            ugur.loginButton.click();


            ugur.signOutLogin.click();
            ugur.storeManagerButton.click();
            ReusableMethods.waitFor(5);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ugur.customersButtonu.click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();

            ugur.addNewButton.click();
            // projePage.userNameCustomer.click();

            actions.sendKeys(Keys.PAGE_DOWN).perform();

            // actions.click(projePage.userNameCustomer)

            ugur.userNameCustomer.click();



            actions.sendKeys(faker.name().username())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.internet().emailAddress())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.name().firstName())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.name().lastName()).perform();



            Driver.closeDriver();
        }


    }





