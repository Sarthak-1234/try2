package org.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import static org.stepdefs.BaseTest.test;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

@CucumberOptions(features = "src/test/resources/featurefiles/", 
glue ="org.stepdefs",
tags="@Tablet",
plugin = {"html:target/site/cucumber-html",
		"json:target/cucumber1.json"},
monochrome=true
		)

public class RunnableClass extends AbstractTestNGCucumberTests{
//format = {"json:target/cucumber/report.json" })
	
}

		
		
		
	