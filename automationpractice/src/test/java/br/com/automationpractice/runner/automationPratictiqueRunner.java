package br.com.automationpractice.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber"},
		features = "classpath:features/", monochrome = true, 
		glue = {"br.com.automationpractice.steps"} 
		//tags = {"@navegarsiteautomationpratique"}
		)

public class automationPratictiqueRunner {

}
