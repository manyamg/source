package swip.po.e;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import swip.junit.SeleniumWebDriverRunner;

import javax.inject.Inject;
import java.net.URI;

@RunWith(SeleniumWebDriverRunner.class)
public class SearchPageIT {

    @Inject
    private WebDriver driver;
    @Inject
    private URI baseUrl;

    @Test
    public void search() throws Exception {

        driver.get(baseUrl + "/search.html");

        SearchPage searchForm = new SearchPage(driver);

        searchForm.assertPageTitleIs("Search");
    }
}
