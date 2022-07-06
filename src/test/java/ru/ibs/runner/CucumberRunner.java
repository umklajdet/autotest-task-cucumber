package ru.ibs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/test/resources"},
        glue = {"ru.ibs.steps"},
        tags = "@cucumberTest"
)
public class CucumberRunner {
}