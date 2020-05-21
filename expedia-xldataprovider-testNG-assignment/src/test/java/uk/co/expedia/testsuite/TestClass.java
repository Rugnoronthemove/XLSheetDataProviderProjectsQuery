package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uk.co.expedia.excelutility.ExcelUtility;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.ResultPage;
import uk.co.expedia.resources.testdata.TestData;
import uk.co.expedia.testbase.TestBase;


public class TestClass extends TestBase {

    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/uk/co/expedia/resources/testdata/FlightData.xlsx";
//    public static final String FILE_PATHMUM = System.getProperty("user.dir") + "/src/test/java/uk/co/expedia/resources/testdata/FlightDataMumbai.xlsx";
//    public static final String FILE_PATHDEL = System.getProperty("user.dir") + "/src/test/java/uk/co/expedia/resources/testdata/FlightDataDelhi.xlsx";

    HomePage homePage = new HomePage();
    FlightsPage flightsPage = new FlightsPage();
    ResultPage resultPage = new ResultPage();

    @BeforeClass
    public void setExcel() {
        //Tell the code about the location of Excel file
        //surround in try catch to handle exception
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "FlightDataMumbai");
            ExcelUtility.setExcelFile(FILE_PATH, "FlightDataDelhi");
//            ExcelUtility.setExcelFile(FILE_PATHMUM, "FlightDataMumbai");
//            ExcelUtility.setExcelFile(FILE_PATHDEL, "FlightDataDelhi");
        } catch (Exception e) {
            e.printStackTrace();
        }

/*
        try {
//            ExcelUtility.setExcelFile(FILE_PATH, "FlightDataDelhi");
//            ExcelUtility.setExcelFile(FILE_PATHDEL, "FlightDataDelhi");
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

    }


    /*
     * Test - FlightTest - click on Flights tab, enter Flying from, Going to, Departing, Returning Travellers
     * and click on Search Button and verify the same destination flight you see in search results.
     */
    @Test(dataProvider = "FlightDataMumbai", dataProviderClass = TestData.class)
    public void flightTestMumbai(String flyingFrom, String goingTo) {
        //click on Flights tab
        homePage.clickOnFlightTab();
        //enter Flying from
        flightsPage.sendTextToFlyingFromField(flyingFrom);
        //enter Going to
        flightsPage.sendTextToGoingToField(goingTo);
        //enter Departing Date
        flightsPage.sendTextToDepartingDate("18/08/2020");
        //enter Returning Date
        flightsPage.sendTextToReturningDate("08/09/2020");
        //enter Travellers
        flightsPage.clickOnTravelersField();
        //adding Adults
//        flightsPage.addAdultTravellers();
        //adding Children
//        flightsPage.addChildrenTravellers();
//        flightsPage.addChildAge("6");
        //click on Search Button
        flightsPage.clickOnSearchBtn();
        //Verify the same destination flight you see in search results
        resultPage.verifyDestinationText("Select your departure to Mumbai");
    }

    /*
     * Test - FlightTest - click on Flights tab, enter Flying from, Going to, Departing, Returning Travellers
     * and click on Search Button and verify the same destination flight you see in search results.
     */
    @Test(dataProvider = "FlightDataDelhi", dataProviderClass = TestData.class)
    public void flightTestDelhi(String flyingFrom, String goingTo) {
        //click on Flights tab
        homePage.clickOnFlightTab();
        //enter Flying from
        flightsPage.sendTextToFlyingFromField("London (LHR-Heathrow)");
        //enter Going to
        flightsPage.sendTextToGoingToField("Delhi (DEL-Indira Gandhi Intl.)");
        //enter Departing Date
        flightsPage.sendTextToDepartingDate(flyingFrom);
        //enter Returning Date
        flightsPage.sendTextToReturningDate(goingTo);
        //enter Travellers
        flightsPage.clickOnTravelersField();
        //adding Adults
//        flightsPage.addAdultTravellers();
        //adding Children
//        flightsPage.addChildrenTravellers();
//        flightsPage.addChildAge("6");
        //click on Search Button
        flightsPage.clickOnSearchBtn();
        //Verify the same destination flight you see in search results
        resultPage.verifyDestinationText("Select your departure to Delhi");

    }


}