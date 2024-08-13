package registrationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	WebDriver driver = new ChromeDriver();

    @Test
    public void registerUser() {
        // Open registration page
        driver.get("(https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon."
        		+ "com%2Fgp%2Fcss%2Fhomepage.html%2F%3Fie%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs."
        		+ "openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid."
        		+ "claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
        		+ "0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_39)");

        // Enter first name
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.sendKeys("John");

        // Enter last name
        WebElement lastNameField = driver.findElement(By.name("lastName"));
        lastNameField.sendKeys("Doe");

        // Enter email address
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("john.doe@example.com");

        // Enter password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("password123");


     // Confirm password
        WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
        confirmPasswordField.sendKeys("password123");

        // Click Register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit']"));
        registerButton.click();

        // Verify registration success message
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='success-message']"));
        Assert.assertTrue(successMessage.getText().contains("Registration successful"));
    }


}
