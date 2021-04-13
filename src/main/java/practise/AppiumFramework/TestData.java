package practise.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
	{
		//2 sets of data, "hello" , "!@#$$"
		Object[][] obj=new Object[][]
				{
			
			{"Welcome to class"}, {"Happy testing"}, {"Lets begin salah"}
				};
				
				return obj;
				
	}
	


}
