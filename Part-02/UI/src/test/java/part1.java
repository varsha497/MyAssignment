
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

import io.restassured.authentication.*;
import io.restassured.response.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.*;
import io.restassured.filter.Filter;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.Method;
import io.restassured.internal.*;
import io.restassured.internal.assertion.AssertParameter;
import io.restassured.internal.log.LogRepository;
import io.restassured.mapper.ObjectMapper;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.specification.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;



import org.json.simple.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static io.restassured.specification.ProxySpecification.host;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class part1 {

	//public static WebDriver wd;
	
	
	//@BeforeSuite
	//public void openBrowser() {		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaryVarshaVenantius\\Desktop\\selenium\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--start-maximized");		
		
		
		//wd = new ChromeDriver(opt);
		//wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wd.get(" http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/");
		//Reporter.log("Browser Opened");
		
		
		//wd.findElement(By.cssSelector("a[href*='users']")).click();
		
		
	//}
	
	//public void test_NumberOfUsers_ShouldBe79() {
	        
		//RestAssured.baseURI = "http://ec2-54-174-213-136.compute-1.amazonaws.com:3000";
		//RequestSpecification httpRequest = RestAssured.given();
		//io.restassured.response.Response response = httpRequest.get("/users");
		//System.out.println("Response Body is =>  " + response.toString());
	
	@Test
	public void test1() {
		
		
		RequestSpecification httpRequest = RestAssured.given();
		 httpRequest.header("Content-Type","application/json");
		 
		 
		 
		 JSONObject json=new JSONObject();
		 
		 json.put("userId","1");
		 json.put("id", "1");
		 json.put("title", "hey testing put");
		 json.put("body","hhhhhhhhvvvvvvvvvvgg");
		
		 
		 
		 httpRequest.body(json.toString());
		 
		 io.restassured.response.Response response = httpRequest.put("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts/1");
		 
		 
		 //int code= ((ResponseOptions<io.restassured.response.Response>) response).getStatusCode();
		 
		 //Assert.assertEquals(code,201);
	}

}