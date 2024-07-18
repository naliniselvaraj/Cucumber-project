package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class BaseClass {
	private static  TakesScreenshot ts;
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	
//1	
	public static void ChromeBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	}
	
	public static void EdgeBrowser() {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
	}
	
	public static void dateandtime() {
Date d = new Date();
System.out.println(d);
	}
	
	//2
	public static void closeBrowser() {
driver.close();
	}
	//3
	public static void maxwindow() {
driver.manage().window().maximize();
	}
	//4
	public static String pagetitle() {
String title = driver.getTitle();
return title;
			}
	//5
	public static String pageurl() {
String currentUrl = driver.getCurrentUrl();
return currentUrl;
	}
	//6
	public static void launchurl(String url) {
driver.get(url);
	}
	//7
	public static void fillTextBox(WebElement ele,String value) {
ele.sendKeys(value);
	}
	//8
	public static void btnclick(WebElement element) {
element.click();
	}
	//9
	public static void moveToElemt(WebElement ele) {
a = new Actions(driver);
a.moveToElement(ele).perform();
	} 
	//10
	public static void dragAnddrop(WebElement src,WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	//11
	public static void doubleclick(WebElement ref) {
		a = new Actions(driver);
		a.doubleClick(ref).perform();
	}
	//12
	public static void rightclick(WebElement ref) {
		a = new Actions(driver);
		a.contextClick(ref).perform();
	}
	//13
	public static void copy() throws AWTException {
r = new Robot();

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
	}
	//14
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	public static void selectall() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}
	//15
	public static void cut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	//16
	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void down() throws AWTException {
		r = new Robot();
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void backspace() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);	
	}
	
	//17
	public static void gettext(WebElement ref) {
String text = ref.getText();
System.out.println(text);
	}
	//18
	public static void attributevalue(WebElement ref) {
String attribute = ref.getAttribute("value");
System.out.println(attribute);
	}
	//19
	public static void attributename(WebElement ref,String txt) {
String attribute1 = ref.getAttribute(txt);
System.out.println(attribute1);
	}
	
	//alert
	//20
	public static void accept() {
al = driver.switchTo().alert();
al.accept();
	}
	//21
	public static void dismiss() {
al.dismiss();
	}
	//22
	public static void sendtext(String txt) {
al.sendKeys(txt);
	}
	
	public static void gettext() {
String text = al.getText();
System.out.println(text);
	}
	
	//javascript executor (Interface)
	//23
	public static void javasendkeys(WebElement ref,String txt) {
js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value',"+txt,")"+ ref);
	}
	//24
	public static void javaclick(WebElement ref) {
		js.executeScript("arguments[0].click()", ref);
	}
	//25
	public static void javaattributeValue(WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getattribute('value')", ref);
	}
	//26
	public static void attributename(WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getattribute('placeholder')", ref);
	}
	//27
	public static void scrolldown(String val,WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript(val, ref);
	}
	//28
	public static void scrollup(String val,WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript(val, ref);
}
	//29
	public static void takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);	
	}
//To switch into frame
	//Method overloading
	//30
	public static void FrameId(String id) {
driver.switchTo().frame(id);
	}
	//31
	public static void framewebelement(WebElement e) {
	driver.switchTo().frame(e);
}
//32
public static void frameindex(int i) {
	driver.switchTo().frame(i);
}
//33
public static void mainframe() {
	driver.switchTo().defaultContent();
}
//34
public static void parentframe() {
	driver.switchTo().parentFrame();
}
//35
public static void windowurl(String url) {
driver.switchTo().window(url);
}
//36
public static void windowtitle(String title) {
driver.switchTo().window(title);
}
//37
public static void windowsid(String id) {
driver.switchTo().window(id);
}
//38
public static void singlewindow() {
String parentid = driver.getWindowHandle();
System.out.println(parentid);
}

//39
public static void multiplewindows() {
Set<String> allid = driver.getWindowHandles();
System.out.println(allid);

//
//List<String> l = new ArrayList();
//l.addAll(allid);
}

//select or dropdown

//40
public static void dropdown(WebElement ref,String value) {
s = new Select(ref);
s.selectByValue(value);
}
//41
public static void selectbyindex(WebElement ref,int i) {
	s = new Select(ref);
	s.selectByIndex(i);
}
//42
public static void selectbytext(String txt) {
	s.selectByVisibleText(txt);
}
//43
public static void ismultiple() {
boolean multiple = s.isMultiple();
System.out.println(multiple);
}
//44
public static void getoptions() {
List<WebElement> options = s.getOptions();
for (WebElement txt : options) {
	System.out.println(txt.getText());
}
}
//45
public static void getallselect() {
List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
for (WebElement allselectopt : allSelectedOptions) {
	System.out.println(allselectopt.getText());
}
}

//46
public static void getfirstselct() {
WebElement first = s.getFirstSelectedOption();
System.out.println(first.getText());
}
//47
public static void deselectindex(int i) {
s.deselectByIndex(i);
}
//48
public static void deselectvalue(String txt) {
s.deselectByValue(txt);
}
//49
public static void deselecttxt(String txt) {
s.deselectByVisibleText(txt);
}
//50
public static void deselectall() {
s.deselectAll();
}

//waits
//static wait or (unconditional wait)
//51
public static void threads(long i) throws InterruptedException {
Thread.sleep(i);
}

//dynamic wait or (conditional wait)
//Implicitly wait
//52
public static void implicitlywait1(int i) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
}

//53
public static void implicitlywait2(int i) {
driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
}




}
