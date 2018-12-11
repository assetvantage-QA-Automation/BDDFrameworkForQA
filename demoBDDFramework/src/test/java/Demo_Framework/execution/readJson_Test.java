package Demo_Framework.execution;

import org.testng.annotations.Test;

import com.assetvantage.commonUtils.readJSON_file;

public class readJson_Test {

	@Test
	public void JSONRead() {
		readJSON_file rj=new readJSON_file();
		rj.readJSON("D:\\EclipseWorkspace\\demoBDDFramework\\src\\main\\java\\com\\assetvantage\\dataFile\\test.json");
	}
}
