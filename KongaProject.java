import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaProject {
        //Import the Selenium WebDriver driver
    private WebDriver driver;
        //Locate where the Edge Driver is
    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver111.exe");
        //1. Open Edge Browser
        driver = new EdgeDriver();
        //2. Input Konga URL
        driver.get("https://www.konga.com");
        //Test1. Confirm the user visit the correct URL
        if (driver.getCurrentUrl().contains("https://www.konga.com"))
            //Pass
            System.out.println("Correct Konga URL");
        else
            //Fail
            System.out.println("Wrong Konga URL");
        Thread.sleep(2000);
        //3. Maximize the Browser
        driver.manage().window().maximize();
        //4. Click the Login/signIn button to log in
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 0)
    public void InvalidUsername() throws InterruptedException {
        //Test2. Verify the user cannot sign in with invalid login details
        //5. Input invalid email/number in the email/number field
        driver.findElement(By.id("username")).sendKeys("080666");
        //6. Input password in the password field
        driver.findElement(By.id("password")).sendKeys("Password23@");
        Thread.sleep(5000);
        //7. Click on the login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void blankPassword() throws InterruptedException {
        //Test3. Verify the user cannot sign in with invalid login details
        //Clear the username field
        driver.findElement(By.id("username")).clear();
        //Clear the password field
        driver.findElement(By.id("password")).clear();
        //5. Input email/number in the email/number field
        driver.findElement(By.id("username")).sendKeys("08066641970");
        //6. Leave the password field blank
        driver.findElement(By.id("password")).sendKeys("");
        Thread.sleep(5000);
        //7. Click on the login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void blankUsername() throws InterruptedException {
        //Test4. Verify the user cannot sign in with blankUsername
        //Clear the username field
        driver.findElement(By.id("username")).clear();
        //Clear the password field
        driver.findElement(By.id("password")).clear();
        //5. Input email/number in the email/number field
        driver.findElement(By.id("username")).sendKeys("");
        //6. Input password in the password field
        driver.findElement(By.id("password")).sendKeys("Password23@");
        Thread.sleep(5000);
        //7. Click on the login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void successfulSignIn() throws InterruptedException {
        //Test5. Verify the user successfully signed in to the website with valid login details
        //Clear the username field
        driver.findElement(By.id("username")).clear();
        //Clear the password field
        driver.findElement(By.id("password")).clear();
        //5. Input email/number in the email/number field
        driver.findElement(By.id("username")).sendKeys("08066641970");
        //6. Input password in the password field
        driver.findElement(By.id("password")).sendKeys("Password23@");
        Thread.sleep(5000);
        //7. Click on the login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 4)
    public void computersAndAccessories() throws InterruptedException {
        //8. Click on the Computers and Accessories category
        //Test6. Ensure the computers and accessories category is clickable
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void LaptopCategory() throws InterruptedException {
        // 9. Click on the Laptop SubCategory
        //Test7. Ensure the Laptop subcategory category is clickable
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void AppleMAcBook() throws InterruptedException {
        //10. Click on the Apple MacBook
        //Test8. Ensure the apple and macbook category is clickable
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label/span")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 7)
            public void AddItemToCArt() throws InterruptedException {
        //Test9. Ensure an Item is successfully added to the cart
        //11. Add an item to cart
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/section/section/section/ul/li[1]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        //12. Locate the "My Cart" menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[1]")).click();
        Thread.sleep(5000);
        //13. Click on checkout
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(5000);
    }

        /**
        //14. Change Delivery options by clicking the change the button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[1]/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(5000);
        //15. Click the "Add the delivery" button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        Thread.sleep(5000);
        //17. Click the "Use this Address" button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
        Thread.sleep(5000);

        // Click on the Standard delivery option
        driver.findElement(By.id("checkbox")).click();
        Thread.sleep(2000);
        **/

    @Test(priority = 8)
     public void Payment() throws InterruptedException {
        //Test10. Ensure the user can access the payment page
        //18. Check the Pay now box
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        Thread.sleep(2000);
        //19. Click the "Continue to Payment" button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
        Thread.sleep(5000);
        //20. Click on the "MAke payment with your debit or credit"
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div[1]/div[2]/div/div[2]/button/div/span[2]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    public void EnterCArdDetails() {
        //Test11. ENsure the user can enter card details successfully
        //21. Enter card numbers in the card number field
        driver.findElement(By.id("card-number")).sendKeys("5399111100002535");
        //22. Enter card date in the date field
        driver.findElement(By.id("expiry")).sendKeys("0326");
        //23. Enter the card CVV in the pin field
        driver.findElement(By.id("cvv")).sendKeys("999");
        //24. Enter the card pin
        driver.findElement(By.id("card-pin-new")).sendKeys("1111");
        //25. Click on the pay now button
        driver.findElement(By.id("validateCardForm")).click();
    }

    @Test(priority = 10)
    public void ErrorMessage() {
        //Test12. Print out error message
        //26. Print out the error message "Invalid card number"
        driver.findElement(By.id("card-number_unhappy")).sendKeys("InvalidCardNumber");
    }

    @Test(priority = 11)
    public void CloseIframeModal() {
        //Test13. Close the iframe modal
        //27. Close the iFrame Modal
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
    }

    @AfterTest
    public void closeBrowser(){
        //Quit the browser
        driver.quit();

    }
}
