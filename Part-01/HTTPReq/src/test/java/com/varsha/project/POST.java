package com.varsha.project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

import io.restassured.authentication.*;
import io.restassured.response.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.*;
import io.restassured.filter.Filter;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.Method;
import org.json.simple.JSONObject;
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
public class POST {
	
	
	@Test
	public void test2() {
		
		
		RequestSpecification httpRequest = RestAssured.given();
		 httpRequest.header("Content-Type","application/json");
		 
		 
		 
		 JSONObject json=new JSONObject();
		 
		 json.put("userId","500");
		 json.put("id", "500");
		 json.put("title", "hey testing post");
		 json.put("body","hhhhhhhhvvvvvvvvvvgg");
		
		 
		 
		 httpRequest.body(json.toString());
		 
		 io.restassured.response.Response response = httpRequest.post("http://ec2-54-174-213-136.compute-1.amazonaws.com:3000/posts");
		 
		 
		 int code= ((ResponseOptions<io.restassured.response.Response>) response).getStatusCode();
		 
		 AssertJUnit.assertEquals(code,201);
	
	

}
};