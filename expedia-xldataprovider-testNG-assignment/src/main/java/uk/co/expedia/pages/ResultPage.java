package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

public class ResultPage extends Utility {

    By destinationText = By.xpath("//header[@id='titleBar']//span[@class='title-city-text']");


    public void verifyDestinationText (String verifyDestText){
        verifyTextAssertMethod(destinationText, verifyDestText);
    }

}
