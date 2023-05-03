package org.stepdefinition;

import org.Base.Base_Class;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/resources", 
glue = "org.stepdefinition", 
monochrome = true, dryRun = false,
snippets = SnippetType.UNDERSCORE ,
tags = "@tag1",
plugin = {"html:Report",
		"junit:Report\\junitreport.xml",
		"json:Report\\jsonReport.json"})
public class TestRunnerClass extends Base_Class {

}
