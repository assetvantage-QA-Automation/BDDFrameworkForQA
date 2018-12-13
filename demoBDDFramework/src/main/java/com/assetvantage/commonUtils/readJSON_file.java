package com.assetvantage.commonUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJSON_file {

	public void readJson(String file, int counter, String actualProductName, double actualValuation,
			double actualCostBasis, double actualDifference) {
		JSONParser parser = new JSONParser();

		try {
			JSONArray a = (JSONArray) parser.parse(new FileReader(file));
			int count = 0;
			/* for (Object o : a) */
			for (Object o : a) {
				if (count == counter) {
					JSONObject trigger = (JSONObject) o;

					String ProductName = (String) trigger.get("ProductName");
					System.out.println("ProductName Name : " + ProductName);
					if (ProductName.equalsIgnoreCase(actualProductName)) {
						System.out.println("ProductName is same");
					}

					String Valuation = (String) trigger.get("Valuation");
					double valuationF = Double.parseDouble(Valuation.replace(",", ""));
					System.out.println("Valuation is : " + valuationF);
					if (valuationF == actualValuation) {
						System.out.println("Valuation is same");
					} else {
						System.out.println("Valuation is deviated from expected " + (valuationF - actualValuation));
					}

					String Cost_Basis = (String) trigger.get("Cost Basis");
					double Cost_BasisF = Double.parseDouble(Cost_Basis.replace(",", ""));
					System.out.println("Cost_Basis is : " + Cost_BasisF);
					if (Cost_BasisF == actualCostBasis) {
						System.out.println("Valuation is same");
					} else {
						System.out.println("Valuation is deviated from expected " + (actualCostBasis - Cost_BasisF));
					}

					String Difference = (String) trigger.get("Difference");
					double DifferenceF = Double.parseDouble(Difference.replace(",", ""));
					System.out.println("Difference Role : " + DifferenceF);
					if (DifferenceF == actualDifference) {
						System.out.println("Valuation is same");
					} else {
						System.out.println("Valuation is deviated from expected " + (actualDifference - DifferenceF));
					}

					System.out.println("\n");
				}
				count++;

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
