package project_name.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Hooks {
	ExtentSparkReporter spark;
	ExtentReports reports ;

	@BeforeSuite
	public void reportsInitialisation() {
		reports = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
	}

	@AfterSuite
	public void reportsFlushReports() {
		reports.attachReporter(spark);
		reports.flush();
	}
}
