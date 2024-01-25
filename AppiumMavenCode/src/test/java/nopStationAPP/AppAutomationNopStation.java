package nopStationAPP;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class AppAutomationNopStation {

    public static void main(String[] args) throws Exception {
    	
    
        //create ExtentReports 
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("H:\\Appium\\AppiumCode\\AppiumMavenCode\\nopStation.html");
        extentReports.attachReporter(sparkReporter);
        
        ExtentTest test1 = extentReports.createTest("nopStation App -> Product add to the cart Test");
        ExtentTest test2 = extentReports.createTest("nopStation App -> Place order as a guest user Test"); 
        
        // Excel data object
        String filePath = "H:\\Appium\\AppiumCode\\AppiumMavenCode\\dataFiles\\NopStationData.xlsx";
        String sheetName = "Sheet1";
        Object[][] excelData = ExcelDataReader.readExcelData(filePath, sheetName);
        
        
    	UiAutomator2Options op=new UiAutomator2Options();
    					
    	//Mobile details
    	op.setCapability("deviceName","emulator-5554");
    	op.setCapability("automationName","UIAutomator2");
    	op.setCapability("platformName","Android");
    	op.setCapability("platformVersion","8.1");
    					
    	//App Details
    	op.setCapability("appPackage","com.nopstation.nopcommerce.nopstationcart");
    	op.setCapability("appActivity","com.bs.ecommerce.main.SplashScreenActivity");

    	//Server set up
    	URL server= new URL("http://127.0.0.1:4723");
    			
    	//AppiumDriver object creation & send information & server details 
    	test1.info("App Opening..");		
    	AppiumDriver MobileObj=new AppiumDriver(server,op);
    	Thread.sleep(5000); 
    	System.out.println("App opening...");
    	MobileObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	Thread.sleep(10000); 
    			
    	//Click accept button
    	test1.info("Click accept button.");
    	ObjectLocators.AcceptBtn(MobileObj).click();
    	test1.pass("Accept button clicked and home page appear.");
    	System.out.println("Click Accept Button.");
    	MobileObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    				
    	//==================Scenario: 01 Customer add products in his shopping cart====================
    	
    	//click "electronics" from "OUR CATEGORIES" list from home page
    			
    	// Perform horizontal scroll right to left
    	WebElement catgo = ObjectLocators.Category(MobileObj);
    	int centerY = catgo.getRect().y+(catgo.getSize().height/2);
    	double startX = catgo.getRect().x+(catgo.getSize().width*0.99);
    	double endX = catgo.getRect().x+(catgo.getSize().width*0.1);
    			
    	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
    	Sequence swipe = new Sequence(finger, 1);
    	swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int)startX, centerY));
    	swipe.addAction(finger.createPointerDown(0));
    	swipe.addAction(finger.createPointerMove(Duration.ofMillis(1100), PointerInput.Origin.viewport(), (int)endX, centerY));
    	swipe.addAction(finger.createPointerUp(0));
    	MobileObj.perform(Arrays.asList(swipe));
    	Thread.sleep(5000);
    	
    	test1.info("Click \"electronics\" from \"OUR CATEGORIES\" list.");
    	ObjectLocators.ElectronicsBtn(MobileObj).click();
    	test1.pass("Electronics page appear.");
    	System.out.println("Click Electronics.");
    	Thread.sleep(5000);
    			
    	//click to "Mattress Bedroom" product details page
    	// Perform vertical scroll 
    	WebElement elec = ObjectLocators.ElectronicPage(MobileObj);
    	int centerX = elec.getRect().x+(elec.getSize().width/2);
    	//double startY = elec.getRect().y+(elec.getSize().height*0.9);
    	//double endY = elec.getRect().y+(elec.getSize().width*0.1);
    	double startY = 1927; 
    	double endY = 515;
    			
    	Sequence scroll = new Sequence(finger, 1);
    	scroll.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int)startY));
    	scroll.addAction(finger.createPointerDown(0));
    	scroll.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), centerX, (int)endY));
    	scroll.addAction(finger.createPointerUp(0));
    	MobileObj.perform(Arrays.asList(scroll));
    	Thread.sleep(5000);
  
    	test1.info("Go to Mattress Bedroom detail page.");
    	ObjectLocators.MattressBedroomDetails(MobileObj).click();
    	test1.pass("Mattress Bedroom detail page appear.");
    	System.out.println("Click Mattress Bedroom.");
    	Thread.sleep(7000);
    			
    	//click plus button to increase Qty by "2"
    	// Perform vertical scroll 
    	WebElement mat = ObjectLocators.MattressBedroomPage(MobileObj);
    	int center2X = mat.getRect().x+(mat.getSize().width/2);
    	//double start2Y = mat.getRect().y+(mat.getSize().height*0.9);
    	//double end2Y = mat.getRect().y+(mat.getSize().width*0.2);
    	double start2Y = 1831; 
    	double end2Y = 227;
    			
    	Sequence scroll2 = new Sequence(finger, 1);
    	scroll2.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), center2X, (int)start2Y));
    	scroll2.addAction(finger.createPointerDown(0));
    	scroll2.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), center2X, (int)end2Y));
    	scroll2.addAction(finger.createPointerUp(0));
    	MobileObj.perform(Arrays.asList(scroll2));
    	Thread.sleep(5000);
    			
    	test1.info("Click increase Qty by 2.");
    	ObjectLocators.QtyIn(MobileObj).click();
    	System.out.println("Click increase Qty by 2.");
    	test1.pass("Qty 2 added.");
    	MobileObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    			
    	//click add to cart button to add the product in cart
    	test1.info("Click add to cart button.");
    	ObjectLocators.AddCartBtn(MobileObj).click();
    	test1.pass("Product added to the cart.");
    	System.out.println("Click add to cart button.");
    	MobileObj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	//================Scenario: 02 Customer successfully place order as a guest user====================================
    	
    	//go to shopping cart by clicking top cart icon
    	test2.info("Click cart icon and go to the cart page.");
    	ObjectLocators.CartBtn(MobileObj).click();
    	test2.pass("Cart page appear.");
    	System.out.println("Click Cart icon.");
    	Thread.sleep(3000);
    	
    	//click checkout button from shopping cart page
    	test2.info("Click checkout button.");
    	ObjectLocators.CheckoutBtn(MobileObj).click();
    	test2.pass("Checkout button clicked.");
    	System.out.println("Click checkout button.");
    	Thread.sleep(3000);
    	
    	//checkout as guest from shopping cart page
    	test2.info("Click checkout as guest button.");
    	ObjectLocators.AsGuestBtn(MobileObj).click();
    	test2.pass("checkout as guest button clicked.");
    	System.out.println("Click checkout as guest button.");
    	Thread.sleep(3000);
    	
    	for (Object[] data : excelData) {
    		
    		//Take data from excel file.
            String Fname = data[0].toString(); 
            String Lname = data[1].toString(); 
            String email = data[2].toString(); 
            String comp = data[3].toString(); 
            String city = data[4].toString();
            String sa1 = data[5].toString();
            String sa2 = data[6].toString();
            String zip = data[7].toString();
            String phn = data[8].toString();
            String fax = data[9].toString();

         
        test2.info("Write the First Name.");
        ObjectLocators.FName(MobileObj).sendKeys(Fname);
        test2.pass("First Name given.");
        System.out.println("Write the First Name.");
        Thread.sleep(2000);
        
    	test2.info("Write the Last Name.");
    	ObjectLocators.LName(MobileObj).sendKeys(Lname);
    	test2.pass("Last Name given.");
    	System.out.println("Write the Last Name.");
    	Thread.sleep(2000);
    	
    	test2.info("Write the Email.");
    	ObjectLocators.Email(MobileObj).sendKeys(email);
    	test2.pass("Email given.");
    	System.out.println("Write the Email.");
    	Thread.sleep(2000);
    	
    	test2.info("Select the Country.");
    	ObjectLocators.Country(MobileObj).click();
    	Thread.sleep(2000);
    	ObjectLocators.SelectCountry(MobileObj).click();
    	test2.pass("Country is selected.");
    	
    	test2.info("Select the State.");
    	ObjectLocators.State(MobileObj).click();
    	Thread.sleep(2000);
    	ObjectLocators.SelectState(MobileObj).click();
    	test2.pass("State is selected.");
    	System.out.println("Select the Country and State.");
    	Thread.sleep(2000);
    	
    	test2.info("Write the Company name.");
    	ObjectLocators.Company(MobileObj).sendKeys(comp);
    	test2.pass("Company name given.");
    	System.out.println("Write the Company name.");
    	Thread.sleep(2000);
    	
    	test2.info("Give the City.");
    	ObjectLocators.City(MobileObj).sendKeys(city);
    	test2.pass("City given.");
    	System.out.println("Give the City.");
    	Thread.sleep(2000);
    	
    	//scroll
    	WebElement adds = ObjectLocators.AddressPage(MobileObj);
    	int center3X = adds.getRect().x+(adds.getSize().width/2);
    	double start3Y = 1965; 
    	double end3Y = 581;
    			
    	Sequence scroll3 = new Sequence(finger, 1);
    	scroll3.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), center3X, (int)start3Y));
    	scroll3.addAction(finger.createPointerDown(0));
    	scroll3.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), center3X, (int)end3Y));
    	scroll3.addAction(finger.createPointerUp(0));
    	MobileObj.perform(Arrays.asList(scroll3));
    	Thread.sleep(2000);
    	
    	test2.info("Give the Street address 1.");
    	ObjectLocators.SAdress1(MobileObj).sendKeys(sa1);
    	test2.pass("Street address 1 given.");
    	System.out.println("Give the Street address 1.");
    	Thread.sleep(2000);
    	
    	test2.info("Give the Street address 2.");
    	ObjectLocators.SAdress2(MobileObj).sendKeys(sa2);
    	test2.pass("Street address 2 given.");
    	System.out.println("Give the Street address 2.");
    	Thread.sleep(2000);
    	
    	test2.info("Give the Zip/Postal code.");
    	ObjectLocators.Zip(MobileObj).sendKeys(zip);
    	test2.pass("Zip/Postal code given.");
    	System.out.println("Give the Zip/Postal code.");
    	Thread.sleep(2000);
    	
    	test2.info("Give the Phone Number.");
    	ObjectLocators.Phone(MobileObj).sendKeys(phn);
    	test2.pass("Phone Number given.");
    	System.out.println("Give the Phone Number.");
    	Thread.sleep(2000);
    	
    	test2.info("Give the FAX.");
    	ObjectLocators.Fax(MobileObj).sendKeys(fax);
    	test2.pass("FAX number given.");
    	System.out.println("Give the FAX.");
    	Thread.sleep(2000);
    	
    	}
    	
    	test2.info("Click the Continue Button.");
    	ObjectLocators.AddressContinueBtn(MobileObj).click();
    	test2.pass("Continue button click and shipping page appear.");
    	System.out.println("Click the Continue Button.");
    	Thread.sleep(2000);
    	
    	//select "Next Day Air" as shipping method and click continue
    	test2.info("Select \"Next Day Air\" as shipping method.");
    	ObjectLocators.NextDayAirBtn(MobileObj).click();
    	test2.pass("\"Next Day Air\" as shipping method is selected.");
    	System.out.println("Select \"Next Day Air\" as shipping method.");
    	Thread.sleep(2000);
    	
    	//scroll
    	WebElement shipp = ObjectLocators.ShippingPage(MobileObj);
    	int center4X = shipp.getRect().x+(shipp.getSize().width/2);
    	double start4Y = 1952; 
    	double end4Y = 473;
    			
    	Sequence scroll4 = new Sequence(finger, 1);
    	scroll4.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), center4X, (int)start4Y));
    	scroll4.addAction(finger.createPointerDown(0));
    	scroll4.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), center4X, (int)end4Y));
    	scroll4.addAction(finger.createPointerUp(0));
    	MobileObj.perform(Arrays.asList(scroll4));
    	Thread.sleep(2000);
    	
    	test2.info("Click the Continue Button.");
    	ObjectLocators.ShippingContinueBtn(MobileObj).click();
    	test2.pass("Continue button click and payment page appear.");
    	System.out.println("Click the Continue Button.");
    	Thread.sleep(2000);
    	
    	//select "Check/Money Order" as payment method and click continue
    	//scroll
    	PointerInput finger6 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Point start = new Point(521, 1900);
    	Point end = new Point(525, 499);
    	Sequence swipe6 = new Sequence(finger6, 1)
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start.getX(), start.getY()))
    	        .addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end.getX(), end.getY()))
    	        .addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    	MobileObj.perform(Arrays.asList(swipe6));
    	Thread.sleep(5000);
    	Point start2 = new Point(521, 1900);
    	Point end2 = new Point(525, 499);
    	Sequence swipe7 = new Sequence(finger6, 1)
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start2.getX(), start2.getY()))
    	        .addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end2.getX(), end2.getY()))
    	        .addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    	MobileObj.perform(Arrays.asList(swipe7));
    	Thread.sleep(5000);
    	Point start3 = new Point(521, 1900);
    	Point end3 = new Point(525, 499);
    	Sequence swipe8 = new Sequence(finger6, 1)
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start3.getX(), start3.getY()))
    	        .addAction(finger6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    	        .addAction(finger6.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end3.getX(), end3.getY()))
    	        .addAction(finger6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    	MobileObj.perform(Arrays.asList(swipe8));
    	Thread.sleep(5000);
    	
    	//select check/money order
    	test2.info("select \"Check/Money Order\" as payment method.");
    	ObjectLocators.CheckMoneyOrderBtn(MobileObj).click();
    	test2.pass("\"Check/Money Order\" is selected as payment method.");
    	System.out.println("select \\\"Check/Money Order\\\" as payment method.");
    	Thread.sleep(2000);
    	
    	//click continue button
    	test2.info("Click the Continue Button.");
    	ObjectLocators.PaymentContinueBtn(MobileObj).click();
    	test2.pass("Continue button click and payment page appear.");
    	System.out.println("Click the Continue Button.");
    	Thread.sleep(5000);
    	
    	//click next button on payment information page
    	test2.info("Click the Next Button.");
    	ObjectLocators.NextBtn(MobileObj).click();
    	test2.pass("Next button click and Place order page appear.");
    	System.out.println("Click the Next Button.");
    	Thread.sleep(2000);
    	
    	//click confirm button to place the order
    	test2.info("Click the Confirm Button.");
    	ObjectLocators.ConfirmBtn(MobileObj).click();
    	test2.pass("Confirm button click and Place order.");
    	System.out.println("Click the Confirm Button.");
    	Thread.sleep(2000);
    	
    	// Verify order place successfully with popup message "Your order has been successfully processed!"
    	test2.info("Verify order place successfully with popup message \"Your order has been successfully processed!\"");
    	String actualMessage = ObjectLocators.SuccessText(MobileObj).getText();
    	String expectedMessage = "Your order has been successfully processed!";

    	// Check if the actual message contains the expected message
    	Assert.assertTrue(actualMessage.contains(expectedMessage));

    	test2.pass("Message Verified.");
    	System.out.println("Verify order place successfully with popup message \"Your order has been successfully processed!\"");
    	Thread.sleep(2000);

    	
    	//click continue
    	test2.info("Click the Continue Button.");
    	ObjectLocators.ContinueBtn2(MobileObj).click();
    	test2.pass("Continue button click.");
    	System.out.println("Click the Continue Button.");
    	Thread.sleep(2000);

    	
    	extentReports.flush();		
    }
  
}

