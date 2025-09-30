package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.log.JvmReports;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\src\\test\\resources\\Feature\\Login.feature",
glue="org.log",
dryRun=false, monochrome=true,strict=true,snippets= SnippetType.CAMELCASE,
plugin= {"pretty","html:C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\htmlreports",
		"junit:C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\junitreports.fb.xml",
		"json:C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\jsonreports.fb1.json"})
public class Runnerclass {
	@AfterClass
	public static void after() {
		JvmReports.generateJvmReport("C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\jsonreports.fb1.json");
}

}

