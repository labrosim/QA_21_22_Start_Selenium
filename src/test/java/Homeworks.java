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

    @Test
    public void classWork(){
        //parent
        WebElement element = driver.findElement(By.xpath("//h1/parent::*"));
        //WebElement element1 = driver.findElement(By.xpath("//div/div//input/.."));

        //ancestor
        WebElement el4 = driver.findElement(By.xpath("//h1/ancestor::*")); //all
        WebElement el5 = driver.findElement(By.xpath("//h1/ancestor::div")); //2 options of div
        WebElement el6 = driver.findElement(By.xpath("//h1/ancestor::div[2]")); //1 option

        //ancestor-or-self
        WebElement el7 = driver.findElement(By.xpath("//h1/ancestor-or-self::*"));//plus one more child
        List<WebElement> list = driver.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = driver.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement el8 = driver.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list3 = driver.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));

    }
    @BeforeClass
    public void start(){
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app/home");
    }

    @Test
    public void innerText(){
        WebElement element = driver.findElement(By.cssSelector("[name='login']"));
        String text = element.getText(); //get inner text
        System.out.println(text);

        WebElement element1 = driver.findElement(By.xpath("//form"));
        String textForm = element1.getText();
        System.out.println(textForm);

        WebElement html = driver.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println(textAll);
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

        WebElement xPath1 = driver.findElement(By.xpath("//body"));
        WebElement xPath5 = driver.findElement(By.xpath("//div"));
        WebElement xPath6 = driver.findElement(By.xpath("//h1"));
        WebElement xPath7 = driver.findElement(By.xpath("//h2"));
        WebElement xPath8 = driver.findElement(By.xpath("//h3"));
        WebElement xPath9 = driver.findElement(By.xpath("//a"));


        //by class
        WebElement class1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cl1 = driver.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement class2 = driver.findElement(By.className("container"));
        WebElement cl2 = driver.findElement(By.cssSelector(".container"));
        WebElement class3 = driver.findElement(By.className("active"));
        WebElement cl3 = driver.findElement(By.cssSelector(".active"));

        WebElement xPath2 = driver.findElement(By.xpath("//*[@class='container']"));
        WebElement xPath10 = driver.findElement(By.xpath("//*[starts-with(@class,'nav')]"));
        WebElement xPath11 = driver.findElement(By.xpath("//*[contains(@class,'ti')]"));

        //by id
        WebElement id = driver.findElement(By.id("root"));
        WebElement id1 = driver.findElement(By.cssSelector("#root"));

        WebElement xPath3 = driver.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement attrib1 = driver.findElement(By.cssSelector("[href='/home']"));
        WebElement attrib2 = driver.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement attrib3 = driver.findElement(By.cssSelector("[aria-current='page']"));

        WebElement xPath12 = driver.findElement(By.xpath("//*[starts-with(@href,'/hom')]"));
        WebElement xPath13 = driver.findElement(By.xpath("//*[contains(@style,'gh')]"));
        WebElement xPath14 = driver.findElement(By.xpath("//*[contains(@aria-current,'ge')]"));







    }

}
