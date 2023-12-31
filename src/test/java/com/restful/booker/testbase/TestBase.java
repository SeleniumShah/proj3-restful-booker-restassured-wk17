package com.restful.booker.testbase;

import com.restful.booker.utils.TestUtils;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class TestBase extends TestUtils {

    public static String basePath;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/booking";
    }
}
