package project_name.utilities;

import com.aventstack.extentreports.ExtentReports;

import project_name.readers.FileReaders;

public class ReportProperties {

	public void createFile() {
		FileReaders fileReaders = new FileReaders();
		String path = fileReaders.getTestReportLocation();
		ExtentReports report = new ExtentReports();
		
	}
}
