package Demo_Framework.TestRunner;

import com.assetvantage.commonUtils.readJSON_rnd;

public class readJson_Test {

	
	public static void main(String[] args) {
		readJSON_rnd rj=new readJSON_rnd();
		rj.readJson("C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json", "Bonds", 6.5, 7.8, 9.9);
		//rj.readJson("C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json",2, 5.5, 6.5, 6.6,8.8);
	}
}
