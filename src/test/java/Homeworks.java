import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homeworks {
    WebDriver driver;

    @BeforeClass
    public void start(){
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app/home");
    }

    @AfterClass
    public void finish(){
        driver.quit();
    }

    @Test
    public void searching(){
        //by tags
        WebElement e1 = driver.findElement(By.tagName("body"));
        WebElement el1 = driver.findElement(By.cssSelector("body"));
        List<WebElement> list = driver.findElements(By.tagName("div"));
        List<WebElement> l1 = driver.findElements(By.cssSelector("div"));
        List<WebElement> list2 = driver.findElements(By.tagName("h1"));
        List<WebElement> l2 = driver.findElements(By.cssSelector("h1"));
        List<WebElement> list3 = driver.findElements(By.tagName("a"));
        List<WebElement> l3 = driver.findElements(By.cssSelector("a"));
        WebElement e2 = driver.findElement(By.tagName("h2"));
        WebElement el2 = driver.findElement(By.cssSelector("h2"));
        WebElement e3 = driver.findElement(By.tagName("h3"));
        WebElement el3 = driver.findElement(By.cssSelector("h3"));

        WebElement xPath1 = driver.findElement(By.xpath("//h2"));

        //by class
        WebElement class1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cl1 = driver.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement class2 = driver.findElement(By.className("container"));
        WebElement cl2 = driver.findElement(By.cssSelector(".container"));
        WebElement class3 = driver.findElement(By.className("active"));
        WebElement cl3 = driver.findElement(By.cssSelector(".active"));

        WebElement xPath2 = driver.findElement(By.xpath("//*[@class='container']"));

        //by id
        WebElement id = driver.findElement(By.id("root"));
        WebElement id1 = driver.findElement(By.cssSelector("#root"));

        WebElement xPath3 = driver.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement attrib1 = driver.findElement(By.cssSelector("[href='/home']"));
        WebElement attrib2 = driver.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement attrib3 = driver.findElement(By.cssSelector("[aria-current='page']"));






    }

}
