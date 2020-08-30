package org.tcs.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class NewServices {

	public static void main(String[] args) {
		//RestAssured.baseURI = "https://titan-watches-new.atlassian.net";
		/*Response response = RestAssured.given().queryParam("filter","-4").header("Content-Type", "application/json").auth().preemptive()
				.basic("vanajasadasivam@gmail.com", "zTNsQ0Gufw44hgNmHhbe43ED").when().get("browse/TW-18");*/
		
		RestAssured.baseURI = "https://reqres.in";

		Response response = RestAssured.given().queryParam("page","2").header("Content-Type", "application/json").when().get("api/users");

		//System.out.println(response);
		
		int statusCode = response.getStatusCode();
		System.out.println("Status of request is " + statusCode);
		ResponseBody body = response.getBody();
		System.out.println(body.asString()); 
	}

}
