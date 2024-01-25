package nopStationAPP;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ObjectLocators {

    private	static WebElement locator=null;
	
	public static WebElement AcceptBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnAccept\"]"));
		return locator;
		
	}
	
	public static WebElement Category(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("	\r\n"
				+ "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rvHomeCategories\"]"));
		return locator;
		
	}
	
	public static WebElement ElectronicsBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[5]"));
		return locator;
		
	}
	
	public static WebElement ElectronicPage(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rvProductList\"]"));
		return locator;
		
	}
	
	public static WebElement MattressBedroomDetails(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[7]"));
		return locator;
		
	}
	
	public static WebElement MattressBedroomPage(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/productDetailsScrollView\"]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView"));
		return locator;
		
	}
	
	public static WebElement QtyIn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnPlus\"]"));
		return locator;
		
	}
	
	public static WebElement AddCartBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart\"]"));
		return locator;
		
	}
	
	public static WebElement CartBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/counterIcon\"]"));
		return locator;
		
	}
	
	public static WebElement CheckoutBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut\"]"));
		return locator;
		
	}
	
	public static WebElement AsGuestBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout\"]"));
		return locator;
		
	}
	
	public static WebElement AddressPage(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rootScrollViewBillingAddress\"]"));
		return locator;
		
	}
	
	public static WebElement FName(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFirstName\"]"));
		return locator;
		
	}
	
	public static WebElement LName(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etLastName\"]"));
		return locator;
		
	}
	
	public static WebElement Email(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]"));
		return locator;
		
	}
	
	public static WebElement Country(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/countrySpinner\"]"));
		return locator;
		
	}
	
	public static WebElement SelectCountry(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"android:id/text1\"])[3]"));
		return locator;
		
	}
	
	public static WebElement State(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]"));
		return locator;
		
	}
	
	public static WebElement SelectState(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Other\"]"));
		return locator;
		
	}

	
	public static WebElement Company(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCompanyName\"]"));
		return locator;
		
	}
	
	public static WebElement City(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCity\"]"));
		return locator;
		
	}
	
	public static WebElement SAdress1(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress\"]"));
		return locator;
		
	}
	
	public static WebElement SAdress2(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2\"]"));
		return locator;
		
	}
	
	public static WebElement Zip(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etZipCode\"]"));
		return locator;
		
	}
	
	public static WebElement Phone(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etPhone\"]"));
		return locator;
		
	}
	
	public static WebElement Fax(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFax\"]"));
		return locator;
		
	}
	
	public static WebElement AddressContinueBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"]"));
		return locator;
		
	}
	
	public static WebElement NextDayAirBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[4]"));
		return locator;
		
	}
	
	public static WebElement ShippingPage(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/shippingMethodRootLayout\"]/android.widget.ScrollView"));
		return locator;
		
	}
	
	public static WebElement ShippingContinueBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]"));
		return locator;
		
	}
	
	public static WebElement PaymentPage1(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/nsHome\"]"));
		return locator;
		
	}
	
	public static WebElement PaymentPage2(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rootScrollViewBillingAddress\"]"));
		return locator;
		
	}
	
	public static WebElement PaymentPageScroll(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rootScrollViewBillingAddress\"]"));
		return locator;
		
	}
	
	public static WebElement CheckMoneyOrderBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[3]"));
		return locator;
		
	}
	
	public static WebElement PaymentContinueBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]"));
		return locator;
		
	}
	
	public static WebElement NextBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]"));
		return locator;
		
	}
	
	public static WebElement ConfirmBtn(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/checkoutButton\"]"));
		return locator;
		
	}
	
	public static WebElement SuccessText(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_text_message\"]"));
		return locator;
		
	}
	
	public static WebElement ContinueBtn2(WebDriver driver)
	{
		locator=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_button_positive\"]"));
		return locator;
		
	}
	


}





