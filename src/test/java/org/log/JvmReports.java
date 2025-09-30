package org.log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void generateJvmReport(String json) {
		
		File f=new File("C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\JVM reports");
		
		Configuration con=new Configuration(f, "Facebook");
		con.addClassifications("EmployeeName", "Abi");
		con.addClassifications("Employee Id", "1234");
		con.addClassifications("sprint Id", "51");
		con.addClassifications("programming language", "java");
		
		List<String> l=new ArrayList();
		l.add("C:\\Users\\srknr\\eclipse-workspace -2025\\Cucumber\\target\\Reports\\jsonreports.fb1.json");
		
		ReportBuilder r=new ReportBuilder(l,con);
		r.generateReports();
		
		
		

	}

}
