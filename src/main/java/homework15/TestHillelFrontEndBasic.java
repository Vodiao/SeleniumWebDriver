package homework15;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import scroll.ScrollToTheElement;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestHillelFrontEndBasic extends BaseClass {
    static HillelFrontEndBasic hillelFrontEndBasic = null;
    @BeforeClass
    public static void openSite(){
        driver.get("https://dnipro.ithillel.ua/courses/front-end-basic");
        hillelFrontEndBasic = PageFactory.initElements(driver,HillelFrontEndBasic.class);
    }

    @Test
    public void testCourseTitle(){
    assertEquals("Курс Front-end Basic",hillelFrontEndBasic.getCourseTitle());
    }

    @Test
    public void testCourseRate(){
        assertEquals("5",hillelFrontEndBasic.getCourseRate());
    }

    @Test
    public void testCourseDescription(){
        assertEquals("Навчися верстати сайти!",hillelFrontEndBasic.getCourseDescription());
    }

    @Test
     public void testListCoachesNames()  {
        ScrollToTheElement.scrollToElementVisibilityOf(driver, new By.ByXPath("//ul[@class=\"coach-list coaches_list\"]"));
        driver.findElement(By.id("coachesShowAllButton")).click();
        List<String> myList = hillelFrontEndBasic.getListCoachesNames();

    }

}
