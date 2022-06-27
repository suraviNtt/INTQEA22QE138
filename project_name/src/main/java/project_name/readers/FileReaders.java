package project_name.readers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class FileReaders {
	
	private String getbasePath() {
		return System.getProperty("user.dir");
	}

	public String getMainResourcesFilepath(String filename , String filetype) {
		return getbasePath() + "/src/main/resources/"+filename+"."+filetype;
	}

	public String getTestResourcesFilepath(String filename, String filetype) {
		return getbasePath() + "/src/test/resources/"+filename+"."+filetype;
	}
	
	public String getTestOutputLocation(String filename) {
		return getbasePath() + "/test_output/"+filename+".png";
	}
	
	public String getTestReportLocation() {
		return getbasePath() + "/reports";
	}
	
	public FileReader readFile(String filepath) {
		Reader file = null;
		try {
			file =new  FileReader(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (FileReader) file;
	}
	
	public InputStream streamFile(String filepath) {
		InputStream file = null;
		try {
			file =new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	
}
