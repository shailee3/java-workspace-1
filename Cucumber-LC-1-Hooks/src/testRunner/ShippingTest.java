package testRunner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = {"features"}, glue = {"stepDefinition"})
public class ShippingTest {

}
