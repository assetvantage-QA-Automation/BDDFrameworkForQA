package Demo_Framework.execution;

import com.assetvantage.commonUtils.readJSON_file;

public class readJson_Test {

	
	public static void main(String[] args) {
		readJSON_file rj=new readJSON_file();
		rj.readJson("C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json", 2, "Mutual Funds", 6.5, 7.8, 9.9);
		//rj.readJson("C:\\Users\\partha.das\\git\\BDDFrameworkForQA\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\balanceSheet.json",2, 5.5, 6.5, 6.6,8.8);
	}
}
