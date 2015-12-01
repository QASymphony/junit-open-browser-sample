
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sample.*;

/**
 * Created by duongnapham on 9/24/15.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
      CalculatorTestSuccessful.class,
      OpenBrowserTest.class,
      WelcomeMessageTest.class
})
public class SuiteTest {
}
