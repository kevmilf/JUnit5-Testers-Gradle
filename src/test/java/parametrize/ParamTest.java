package parametrize;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParamTest {
    @ParameterizedTest
    @EnumSource(Browser.class)
    void testsAllBrowsers(Browser browser) {
        String browserName = browser.name();
        System.out.println(browserName);
    }

}
