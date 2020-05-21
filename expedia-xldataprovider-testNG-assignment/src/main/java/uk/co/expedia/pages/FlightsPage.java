package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import uk.co.expedia.utility.Utility;

public class FlightsPage extends Utility {

    By flyingFromField = By.id("flight-origin-hp-flight");
    By goingToField = By.id("flight-destination-hp-flight");
    By departingDate = By.id("flight-departing-hp-flight");
    By returningDate = By.id("flight-returning-hp-flight");
    By travellersField = By.xpath("//div[@id='traveler-selector-hp-flight']//li/button");
    //    By adultTravellersAdd = By.linkText("Add Adult");
    By adultTravellersAdd = By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div/div[4]/button[1]/span[1]//*[local-name()='svg']");
    By childrenTravellersAdd = By.xpath("//section[@id='section-flight-tab-hp']//div[2]//div[1]//div[4]//button[1]//span[1]//*[local-name()='svg']");
    //    By childAgeDropDown = By.cssSelector("select[class$='gcw-child-age-1-1-sa']");
    By childAgeDropDown = By.xpath("//body//fieldset//div[2]//div[2]//label[1]//select[1]");
    By searchBtn = By.xpath("//*[@id='gcw-flights-form-hp-flight']//div[9]/label/button");

    //    By departingDate = By.cssSelector("input#flight-departing-flp");
    //    By returningDate = By.cssSelector("input#flight-returning-flp");


    public void sendTextToFlyingFromField(String flyFrom) {
        waitUntilElementToBeClickable(flyingFromField, 20);
        sendTextToElement(flyingFromField, flyFrom);
    }

    public void sendTextToGoingToField(String flyTo) {
        waitUntilElementToBeClickable(goingToField, 20);
        sendTextToElement(goingToField, flyTo);
    }

    public void sendTextToDepartingDate(String departDate) {
        waitUntilElementToBeClickable(departingDate, 20);
        sendTextToElement(departingDate, departDate);
    }

    public void sendTextToReturningDate(String returnDate) {
        waitUntilElementToBeClickable(returningDate, 20);

        getElement(returningDate).sendKeys(Keys.CONTROL, "a");
        getElement(returningDate).sendKeys(Keys.DELETE);

        sendTextToElement(returningDate, returnDate);
    }

    public void clickOnTravelersField() {
        waitUntilElementToBeClickable(travellersField, 20);
        clickOnElement(travellersField);
    }

    public void addAdultTravellers(String adult) {
        waitUntilElementToBeClickable(adultTravellersAdd, 20);
        sendTextToElement(adultTravellersAdd, adult);
    }

    public void addAdultTravellers() {
        waitUntilElementToBeClickable(adultTravellersAdd, 20);
                clickOnElement(adultTravellersAdd);
    }

    public void addChildrenTravellers(String child) {
        waitUntilElementToBeClickable(childrenTravellersAdd, 20);
        sendTextToElement(childrenTravellersAdd, child);
    }

    public void addChildrenTravellers() {
        waitUntilElementToBeClickable(childrenTravellersAdd, 20);
                clickOnElement(childrenTravellersAdd);
    }

    public void addChildAge(String childAge) {
        waitUntilElementToBeClickable(childAgeDropDown, 20);
        selectByValueFromDropDown(childAgeDropDown, childAge);
    }

    public void clickOnSearchBtn() {
        waitUntilElementToBeClickable(searchBtn, 20);
        clickOnElement(searchBtn);
    }

}

