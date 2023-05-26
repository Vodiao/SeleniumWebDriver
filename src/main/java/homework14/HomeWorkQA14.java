package homework14;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import scroll.ScrollToTheElement;

import java.util.List;

public class HomeWorkQA14 extends BaseClass {
    static MainPage mainPage;
    @BeforeClass
    public static void startSite() {
        driver.get("https://ithillel.ua/");
       mainPage = new MainPage(driver);
    }

    @Test
    public void testClickOnProgramming() throws InterruptedException {
            WebElement element = driver.findElement(By.xpath("//ul[contains(@class,\"block-course-cats_list\")]"));
            List<WebElement> list = element.findElements(By.tagName("li"));
            for (WebElement webElement : list) {
                webElement.findElement(By.tagName("p")).click();
                break;
            }
        Thread.sleep(1000);
    }

    @Test
    public void testChooseFrontEndBasic() throws InterruptedException{
        WebElement element = driver.findElement(By.xpath("//ul[contains(@class,\"block-profession_list\")]"));
        List<WebElement> list = element.findElements(By.tagName("li"));
        for (WebElement webElement : list) {
            webElement.findElement(By.tagName("p")).click();
            break;
        }
        Thread.sleep(1000);
    }


    @Test
    public void testItButton() throws InterruptedException {
        ScrollToTheElement.scrollToElementVisibilityOf(driver,new By.ByXPath("//ul[@class=\"coach-list coaches_list\"]"));
        driver.findElement(By.id("coachesShowAllButton")).click();
        List<WebElement> webElementList=driver.findElements(By.className("coach-list_item"));
        for (WebElement element : webElementList) {
            System.out.println(element.findElement(By.className("coach-card_name")).getText());
        }

        Thread.sleep(4000);

    }


}
