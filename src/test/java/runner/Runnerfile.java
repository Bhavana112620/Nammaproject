package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {
				//"C:\\Users\\jeeva\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\TutorialNinjaAutomationProject\\Ninja\\register.feature"
				"C:\\Users\\jeeva\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\TutorialNinjaAutomationProject\\Ninja\\login.feature",
				//"C:\\Users\\jeeva\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\TutorialNinjaAutomationProject\\Ninja\\search.feature"
		},
		glue={"stepdefination"},
		monochrome = true,
			    plugin = {
			        "pretty",
			        "html:reports/cucumber-html-report.html",
			        "json:reports/cucumber.json",
			        "junit:reports/cucumber.xml"
		}
		
		
		
		
		
		)
public class Runnerfile extends AbstractTestNGCucumberTests{

}
