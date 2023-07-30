package MainRunner;

import main.Browser;
import main.Internet;

public class BrowserInternet {

	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.search();
		browser.refresh();
		Internet internet=new Internet();
		internet.connect();
		internet.offers();
	}

}
