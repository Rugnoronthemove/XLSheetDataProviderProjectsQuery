package uk.co.expedia.resources.testdata;

import org.testng.annotations.DataProvider;
import uk.co.expedia.excelutility.ExcelUtility;

public class TestData {

/*
    @DataProvider(name="FlightSearchData")
    public Object[][] getDataFlightSearchData() {

        Object[][] data = ExcelUtility.getTestData("Flight_Search_Data");
        return data;
    }

    @DataProvider(name="FlightSearchData")
    public Object[][] getDataFlight(){
        Object[][] data = ExcelUtility.getTestData("FlightSearchData");
        return data;
    }
*/

    @DataProvider(name="FlightDataDelhi")
    public Object[][] getDataFlightData() {

        Object[][] data = ExcelUtility.getTestData("FlightDataDelhi");
        return data;
    }

    @DataProvider(name="FlightDataMumbai")
    public Object[][] getDataFlight(){
        Object[][] data = ExcelUtility.getTestData("FlightDataMumbai");
        return data;
    }

}
