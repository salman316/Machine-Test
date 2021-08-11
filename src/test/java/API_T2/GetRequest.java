package API_T2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

  @Test
  public void getRequestResponse () {
   
    Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=61394d1cce40a02debf3f761b0b13267");
    
    int code = resp.getStatusCode();
    
    System.out.println("Status code is :"+ code);
    
    Assert.assertEquals(code, 200);
    
    long resptime = resp.getTime();
    System.out.println("Response time is :" +resptime);
  }

}
