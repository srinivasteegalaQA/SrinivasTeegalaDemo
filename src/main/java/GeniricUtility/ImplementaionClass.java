package GeniricUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ImplementaionClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		test.log(Status.INFO, "test execution Started");
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,"Test Script Passed"+MethodName);

	}

	public void onTestFailure(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.FAIL, "test Script Failed"+MethodName);
		test.log(Status.FAIL, result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, "test Script is Skipped"+MethodName);
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
	
		System.out.println("======Suite Execution started======");
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\extndsReports\\SISReport-"+".html");
		htmlReport.config().setDocumentTitle("Student Information System Execution Reports");
		htmlReport.config().setReportName("Student Information System Execution Report");
		htmlReport.config().setTheme(Theme.DARK);
		
	

		 report=new ExtentReports();
	       report.attachReporter(htmlReport);
	       report.setSystemInfo("Browser","Chrome");
	       report.setSystemInfo("Base OS", "Windows");
	       report.setSystemInfo("Base URL","https://lms-sis-demo.sapphirus.in/");
	       report.setSystemInfo("ReporterName : ", "Srinivas Teegala");
	       
		
	}

	public void onFinish(ITestContext context) {
	
		System.out.println("----Suite Execution Finished----");
		report.flush();
	}

	
}
