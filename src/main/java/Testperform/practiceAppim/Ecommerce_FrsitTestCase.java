package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;

public class Ecommerce_FrsitTestCase extends BaseTest {

//	AndroidDriver driver;
//	public Ecommerce_FrsitTestCase(AndroidDriver driver) {
//		this.driver = driver;	
//		}
	
	public void fillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mahesh Babu");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
//		String toastmasseg = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
//		System.out.println(toastmasseg);
//		Assert.assertEquals(toastmasseg, "Please enter your name");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		int productcount = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<productcount;i++) {
			String productname = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(productname.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
	}
}

