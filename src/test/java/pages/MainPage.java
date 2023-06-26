package pages;

import element.base.web.Element;
import element.wrapper.web.TextBox;
import helper.LocatorHelper;
import tests.TestBase;
import utils.constant.Constants;

public class MainPage extends TestBase {
	LocatorHelper locator = new LocatorHelper(Constants.LOCATOR_FOLDER_PATH,
			MainPage.class);
	
	// Static Elements
	protected TextBox txtSearch = new TextBox(locator.getLocator("txtSearch"));
	protected Element eleSearchForPageContaining = new Element(locator.getLocator("eleSearchForPageContaining"));
	
	// Method
	public void searchForPageContaining(String keyword) {
		txtSearch.waitForDisplayed(60);
		txtSearch.enter(keyword);
		eleSearchForPageContaining.waitForDisplayed(60);
		eleSearchForPageContaining.click();
	}
}
