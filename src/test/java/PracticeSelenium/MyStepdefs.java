package PracticeSelenium;


import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 4/25/2017.
 */
public class MyStepdefs extends BaseTest
{
    @Given("^I am on Homepage$")
    public void iAmOnHomepage()
    {
        openBrowser();

    }

    @When("^I click on Menu Button$")
    public void iClickOnMenuButton() {
        driver.findElement(By.linkText("Menu")).click();
    }

    @Then("^I Should be able to see Menu Page$")
    public void iShouldBeAbleToSeeMenuPage()
    {
        driver.findElement(By.linkText("Menu")).click();
    }

    @Given("^I am on Menu Page$")
    public void iAmOnMenuPage()
    {

    }

    @When("^I Click on checkout Button$")
    public void iClickOnCheckoutButton()
    {
        driver.findElement(By.cssSelector("span.button-content.wsb-button-content")).click();
    }

    @And("^I enter my email adress$")
    public void iEnterMyEmailAdress()
    {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("kesah_2004\"yahoo.com");
    }

    @And("^I enter my name$")
    public void iEnterMyName()
    {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Kavita");
    }

    @And("^I enter my adress$")
    public void iEnterMyAdress()
    {
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("london");
    }

    @And("^I enter my cardtype$")
    public void iEnterMyCardtype()
    {
        new Select(driver.findElement(By.id("card_type"))).selectByVisibleText("Mastercard");
    }

    @And("^I enter my Cardnumber$")
    public void iEnterMyCardnumber()
    {
        driver.findElement(By.id("card_number")).clear();
        driver.findElement(By.id("card_number")).sendKeys("5154891212345678");
    }

    @And("^I enter my Cardholdername$")
    public void iEnterMyCardholdername()
    {
        driver.findElement(By.id("cardholder_name")).clear();
        driver.findElement(By.id("cardholder_name")).sendKeys("M Shah");
    }

    @And("^I enter my verificationcode$")
    public void iEnterMyVerificationcode()
    {
        driver.findElement(By.id("verification_code")).clear();
        driver.findElement(By.id("verification_code")).sendKeys("999");
    }

    @And("^I clicl on placeorder button$")
    public void iCliclOnPlaceorderButton()
    {

    }

    @Then("^I Should be able to place order successfully$")
    public void iShouldBeAbleToPlaceOrderSuccessfully()  {


    }
}

