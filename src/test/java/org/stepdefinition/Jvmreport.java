package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
public static void fbreport(String jsonpath) {
//file creation-step 1
	File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\cucumber project\\JVM Report");
//step 2 - configuration
	Configuration c = new Configuration(f, "facebook");
	c.addClassifications("OS", "windows10");
	c.addClassifications("Browser", "Chrome");
	
	//step 3- list creation
	List<String> li = new ArrayList<String>();
	li.add(jsonpath);
	
	//Step 4 -report generation
	ReportBuilder r = new ReportBuilder(li, c);
	r.generateReports();

}
}
