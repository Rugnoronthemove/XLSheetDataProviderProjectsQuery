package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

public class HomePage extends Utility {

    By accountBtn = By.id("header-account-menu");
    By flightTab = By.id("tab-flight-tab-hp");


    public void clickOnAccountBtn() {
        clickOnElement(accountBtn);
    }


    public void clickOnFlightTab() {
        clickOnElement(flightTab);
    }
}
