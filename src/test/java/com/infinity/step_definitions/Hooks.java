package com.infinity.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.infinity.pages.Driver;

public class Hooks {

    @After
    public void teardownForSs(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] ss = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(ss, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }

}
