package Tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class testngClass {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.print("Before method \n");
  }
  
  @Test(dataProvider = "dp")
  public void secondMethod(String movieName, String act, String actress) {
	  
	  System.out.println("Movie Details"+movieName+""+act+""+actress);
  }

  @DataProvider
  public Object[][] dp() { 
	  
    Object[][] movieList = new Object[2][3];
    movieList[0][1] = "titanic";
    movieList[0][2] = "De";
    movieList[0][3] = "kate";

    
    movieList[1][1] = "top gun";
    movieList[1][2] = "tom";
    movieList[1][3] = "kate1";
    
    return movieList;
    
  }
 }
