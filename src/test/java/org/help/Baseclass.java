package org.help;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
       public static String name;
      public static  Select select ;
      public static TakesScreenshot tk;
	public static void openChrome() {
	 driver=new ChromeDriver();
	}
	public static void openEdge() {
		 driver=new EdgeDriver();
		}
	public static void openFirefox() {
		 driver=new FirefoxDriver();
		}
public static void launchUrl(String value) {
	driver.get(value);
	
}
public static void maxBrowser() {
driver.manage().window().maximize();

}
public static void waitTime() throws InterruptedException {
Thread.sleep(4000);

}
public static String getThePageTitle() {
String title = driver.getTitle();
System.out.println("Page Title:"+title);
return title;
}

public static void getCurrentPageUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println("Current page url:"+currentUrl);
}
public static void passTheValue(WebElement element, String value)
{
    element.sendKeys(value);
}

public static void buttonClick(WebElement element) {
element.click();
}
public static void mouseHovering(WebElement element) {
	a=new Actions(driver);
	a.moveToElement(element).perform();
}
public static void dragToDrop(WebElement source, WebElement target) {
	a.dragAndDrop(source, target).perform();
}

public static void doubleclk(WebElement element) {
	a.doubleClick(element).perform();
}
public static void contextclk(WebElement element) {
	a.contextClick(element).perform();
}
public static void pressEnter() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}

public static void scrollTo(WebElement element) {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	
}
public static String xlDataFetch(String loc,String sheetname,int rowno,int cellno) throws IOException {
	
	File f=new File(loc);
	
	FileInputStream fill=new FileInputStream(f);
	
	Workbook book=new XSSFWorkbook(fill);
     Sheet sh = book.getSheet(sheetname);
    
   int rows = sh.getPhysicalNumberOfRows();
String name="";
     for(int i=0; i<sh.getPhysicalNumberOfRows();i++) {
		Row eachrow = sh.getRow(rowno);
	
		for(int j=0; j<eachrow.getPhysicalNumberOfCells();j++) {
			Cell eachcell = eachrow.getCell(cellno);
		
		int type = eachcell.getCellType();
		
		if (type==1) {
		 name = eachcell.getStringCellValue();
		
		}
		else if (DateUtil.isCellDateFormatted(eachcell)) {
			Date date = eachcell.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd.MM.yyyy");
			 name = sim.format(date);
		
		}
		else {
			double d= eachcell.getNumericCellValue();
		long l=(long)d;
	 name = String.valueOf(l);

		}

		}
     }
return name;
}
public static void dateTime() {
Date d=new Date();
System.out.println(d);

}
public static void selectIndex(WebElement element, int date) {
	select = new Select(element);
 select.selectByIndex(date);
}
public static void selectText(WebElement element, String month) {
	select=new Select(element);
	select.selectByVisibleText(month);

}
public void screenShot(String name) throws IOException {
tk=(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\src\\Screenshot\\name.png");
FileUtils.copyFile(src, dest);
System.out.println("Screenshot saved: " + dest.getAbsolutePath());

}
public static void closeBrowser() {
	driver.quit();
}
}
