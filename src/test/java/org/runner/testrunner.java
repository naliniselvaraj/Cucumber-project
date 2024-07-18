package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.Jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\LENOVO\\eclipse-workspace\\cucumber project\\src\\test\\resources\\featurefiles\\fblogin.feature", 
glue = "org.stepdefinition", plugin = {"html:HTML report","junit:Junit Report/jreport.xml", "json:Json Report/jsonreport.json"})
public class testrunner {
@AfterClass
public static void afcls() {
	Jvmreport.fbreport("C:\\Users\\LENOVO\\eclipse-workspace\\cucumber project\\Json Report\\jsonreport.json");
}
}
