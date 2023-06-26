package pages;

import java.util.List;

import element.base.web.Element;
import helper.LocatorHelper;
import tests.TestBase;
import utils.constant.Constants;

public class SearchResultsPage extends TestBase {
	LocatorHelper locator = new LocatorHelper(Constants.LOCATOR_FOLDER_PATH,
			SearchResultsPage.class);
	
	// Static Elements
	protected Element eleSearchResults = new Element(locator.getLocator("eleSearchResults"));
	protected Element eleSearchResultsInfo = new Element(locator.getLocator("eleSearchResultsInfo"));
	protected Element eleSearchResultsItem = new Element(locator.getLocator("eleSearchResultsItem"));
	
	// Methods
	public void waitForPageLoad() {
		eleSearchResults.waitForDisplayed(Constants.LONG_TIME);
	}
	
	public String getSearchResultsInfo() {
		return eleSearchResultsInfo.getText();
	}
	
	public Boolean doesAllSearchResultsContain(String keyword) {
		List<Element> elements = eleSearchResultsItem.getWrapperElements();
		String innerText;
		for (int i = 0; i < elements.size(); i++) {
			innerText = elements.get(i).getAttribute("innerText").toLowerCase();
			if (!innerText.contains(keyword.toLowerCase()))
				return false;
		}
		return true;
	}
	
}
