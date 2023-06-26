package tests.web;

import java.time.Duration;

import org.testng.annotations.Test;
import driver.manager.DriverUtils;
import pages.MainPage;
import pages.SearchResultsPage;
import tests.TestBase;
import utils.assertion.SoftAssertion;
import utils.constant.Constants;
import utils.helper.DataHelper;
import utils.helper.Logger;

public class TS_Search extends TestBase {
	@Test(description = "Search for a valid text with single word and verify the search results.")
	public void TC_F_01() {

		SoftAssertion softAssert = new SoftAssertion();
			
		Logger.info("Precondition: Initial Data");
		
		// Pages
		MainPage mainPage = new MainPage();
		SearchResultsPage searchResultsPage = new SearchResultsPage();
		
		// Test Data
		DataHelper dataHelper = new DataHelper(Constants.DATA_FOLDER, "TC_F_01");
		String keyword = dataHelper.getDataObject(String.class, "Keyword");
		String expected = dataHelper.getDataObject(String.class, "ExpectedSearchResultsInfo");
		
		Logger.info("1. Navigate to https://en.wikipedia.org/wiki/Main_Page.");
		// This step is included in @BeforeMethod

		Logger.info("2. Enter a valid single-word text in the Search textbox.");
		Logger.info("3. Select the 'Search for pages containing <text>'");
		mainPage.searchForPageContaining(keyword);
		
		Logger.verify("Text is displayed \"There is a page named \"keyword\" on Wikipedia.");
		//String expected = "There is a page named \"" + keyword + "\" on Wikipedia";
		expected = expected.replace("%s", keyword);
		softAssert.assertEquals(searchResultsPage.getSearchResultsInfo(),
				expected);
		
		Logger.verify("The search results include entries that match the entered text.");
		softAssert.assertTrue(searchResultsPage.doesAllSearchResultsContain(keyword),
				"Search Result does not contain keyword.");
		
		softAssert.assertAll();
	}
	
	@Test(description = "Search for a non-existent word and verify no search results.")
	public void TC_F_10() {

		SoftAssertion softAssert = new SoftAssertion();
			
		Logger.info("Precondition: Initial Data");
		
		// Pages
		MainPage mainPage = new MainPage();
		SearchResultsPage searchResultsPage = new SearchResultsPage();
		
		// Test Data
		DataHelper dataHelper = new DataHelper(Constants.DATA_FOLDER, "TC_F_10");
		String keyword = dataHelper.getDataObject(String.class, "Keyword");
		String expected = dataHelper.getDataObject(String.class, "ExpectedSearchResultsInfo");
		
		Logger.info("1. Navigate to https://en.wikipedia.org/wiki/Main_Page.");
		// This step is included in @BeforeMethod

		Logger.info("2. Enter a valid single-word text in the Search textbox.");
		Logger.info("3. Select the 'Search for pages containing <text>'");
		mainPage.searchForPageContaining(keyword);
		
		Logger.verify("Text \"There were no results matching the query.\" is displayed.");
		softAssert.assertTrue(searchResultsPage.getSearchResultsInfo().contains(expected),
				"Expected message does not exist.");
		
		softAssert.assertAll();
	}
}
