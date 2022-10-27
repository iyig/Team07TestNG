package team07;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Metin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;


public class US004 {
    Metin pearlyPage = new Metin();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US004() throws InterruptedException, IOException {

        // 1. SEÇİLEN ÜRÜNLER VİEW CARTTA GÖRÜLMELİ: RAKAM (fiyat), MİKTAR ve (ara) TOPLAM OLARAK GÖRÜLMELİ
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(5);
        //pearlyPage.shopNow.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", pearlyPage.urun);
        // pearlyPage.urun.click(); //Bir ürüne tıklanır
        pearlyPage.addChart.click(); //ve sepete eklenir.
        ReusableMethods.waitFor(5);
        pearlyPage.chart.click();
        ReusableMethods.waitFor(5);
        pearlyPage.viewChart.click(); //View charta tıklanır.
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        Thread.sleep(3000);

        Assert.assertTrue(pearlyPage.sepettekiUrunResmi.isDisplayed()); //Sepete eklenen ürünler görünüyor mu kontrol edilir.

        Assert.assertTrue(pearlyPage.sepettekiFiyat.isEnabled()); //Ürün fiyatı görünüyor mu

        Assert.assertTrue(pearlyPage.sepettekiUrunMiktari.isDisplayed()); //Ürün miktarı görünüyor mu

        Assert.assertTrue(pearlyPage.sepettekiToplamFiyat.isEnabled());

// 2. ARTI ile URUN RAKAMI ARTIRILABİLMELİ ve EKSİ ile RAKAMLAR DÜŞÜRÜLEBİLMELİ
        ReusableMethods.waitFor(5);
        pearlyPage.urunArttirmaTusu.click();
        ReusableMethods.getScreenshot("urun arttı");
        pearlyPage.urunEksiltmeTusu.click();
        ReusableMethods.getScreenshot("urun eksildi");


       /* String sepettekiIlkUrunMiktari = pearlyPage.sepettekiUrunMiktariKutusu.getAttribute("value");
        int value = Integer.parseInt(sepettekiIlkUrunMiktari);

        System.out.println("Urun İlk Miktarı = " + sepettekiIlkUrunMiktari);
        pearlyPage.urunArttirmaTusu.click();

        Thread.sleep(3000); // update için gerekli zaman
        String sepettekiIkinciUrunMiktari = pearlyPage.sepettekiUrunMiktariKutusu.getAttribute("value");
        Assert.assertTrue(Integer.parseInt(sepettekiIkinciUrunMiktari) > Integer.parseInt(sepettekiIlkUrunMiktari));
        ReusableMethods.getScreenshot("Artı butonu ile miktar bir arttı");
        pearlyPage.urunEksiltmeTusu.click();
        String sepettekiUcuncuUrunMiktari = pearlyPage.sepettekiUrunMiktariKutusu.getAttribute("value");
        Assert.assertTrue(Integer.parseInt(sepettekiUcuncuUrunMiktari) < Integer.parseInt(sepettekiIkinciUrunMiktari));
        ReusableMethods.getScreenshot("Eksi butonu ile miktar bir azaldı"); */

// 3 STOK FAZLASI URUN EKLENEMEMELİ ve UPDATE CART ile RAKAM ORTALAMALARI GÜNCELLENMELİ
// 3.a Manuel giriş ile stok fazlası girilememeli :
        Driver.getDriver().get(ConfigReader.getProperty("asusUrl"));
        Assert.assertTrue(pearlyPage.asusStokMiktarı.isDisplayed());
        ReusableMethods.waitFor(5);

        pearlyPage.addChart.click();
        pearlyPage.urunArttirmaTusu.click();
        pearlyPage.addChart.click();

        //pearlyPage.asusQuantityBox.click();
        actions.sendKeys("4").click(pearlyPage.addChart).perform();
        Assert.assertTrue(pearlyPage.addChart.isDisplayed());
        ReusableMethods.getScreenshot("Sepete stok miktarından fazla ürün eklenemedi");
        ReusableMethods.waitFor(7);

// 4. CLEAR CART ile RAKAMLAR SİLİNEBİLMELİ:
        js.executeScript("arguments[0].click();", pearlyPage.chart2);

        pearlyPage.viewChart.click();
        pearlyPage.clearChart.click();
        Assert.assertTrue(pearlyPage.sepetBosYazisi.isDisplayed());
        ReusableMethods.getScreenshot("Your cart is currently empty.");

// 5. COUPON SECENEĞİ OLMALI

        pearlyPage.magazayaDon.click();
        ReusableMethods.waitFor(5);
        pearlyPage.urunLaptop.click();
        ReusableMethods.waitFor(5);
        pearlyPage.addChart.click();
        pearlyPage.chart.click();
        pearlyPage.viewChart.click();
        Assert.assertTrue(pearlyPage.applyCoupon.isDisplayed());

// 6. TEKRAR SHOPPİNG DEVAM ETME BUTONU OLMALI
        Assert.assertTrue(pearlyPage.alışveriseDevamEt.isDisplayed());

//7. SHİPİNG BİLGİLERİ SAG TARAFTA GÖRÜLMELİ ve TOPLAM RAKAM SAĞDA POPULATE ETMELİ

        Assert.assertTrue(pearlyPage.chartTotals.isDisplayed());

        pearlyPage.satınAl.click();
// 8 PROCEED TO CHECKOUT BASARILI BİR ŞEKİLDE ÖDENEKLERE YÖNLENDİRİLMELİ:
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        ReusableMethods.waitFor(5);
        actions.click(pearlyPage.faturaBilgileri)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys("571")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .perform();
        ReusableMethods.waitFor(5);
        //Proceed to checkout ta tıklanır ve ödeme ekranına ulaşıp ulaşmadığı kontrol edilir.
        pearlyPage.placeOrder.click();
        Assert.assertTrue(pearlyPage.siparisAlindi.isDisplayed());
        Driver.closeDriver();
    }
}
