package co.uk.next.hook;

import co.uk.next.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers {
    String defaultBrowser  = "Chrome";
    @Before
    public void setUp(){
        launchBrowser(defaultBrowser);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
