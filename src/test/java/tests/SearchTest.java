package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class SearchTest extends TestBase {
    @Test
    void successfulSearchTest() throws MalformedURLException, InterruptedException {

//        WebElement searchElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(
//                        AppiumBy.accessibilityId("Search Wikipedia")));
//        searchElement.click();

        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();

//        WebElement insertTextElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(
//                        AppiumBy.id("org.wikipedia.alpha:id/search_src_text")));
//        insertTextElement.sendKeys("Appium");

            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

//        Thread.sleep(5000);
//        List<WebElement> allProductsName = driver.findElements(AppiumBy.className(
//                "android.widget.TextView"));
//        assert (allProductsName.size() > 0);

        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));

    }
}
