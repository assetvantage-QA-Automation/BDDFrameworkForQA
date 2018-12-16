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

	public void readJson_wr(String file, int counter, String actualProductName, double actualIRR, Double actualQuantity,
			double actualAverageCost, double actualMarketPrice, double actualPurchaseValue, double actualValueOnToday,
			double actualunrealizedGainOrLossInINR, double actualunrealizedGainOrLossPercentage) {

		JSONParser parser = new JSONParser();

		try {
			JSONArray a = (JSONArray) parser.parse(new FileReader(file));
			int count = 0;
			/* for (Object o : a) */
			for (Object o : a) {
				if (count == counter) {
					JSONObject trigger = (JSONObject) o;

					String ProductName = (String) trigger.get("Position");
					System.out.println("ProductName Name : " + ProductName);
					if (ProductName.equalsIgnoreCase(actualProductName)) {
						System.out.println("ProductName is same");
					}

					String IRR = (String) trigger.get("IRR");
					double IRRF = Double.parseDouble(IRR.replace(",", ""));
					System.out.println("Valuation is : " + IRRF);
					if (IRRF == actualIRR) {
						System.out.println("IRR is same");
					} else {
						System.out.println("IRR is deviated from expected " + (IRRF - actualIRR));
					}

					String Quantity = (String) trigger.get("Quantity");
					double QuantityF = Double.parseDouble(Quantity.replace(",", ""));
					System.out.println("Cost_Basis is : " + QuantityF);
					if (QuantityF == actualQuantity) {
						System.out.println("Quantity is same");
					} else {
						System.out.println("Quantity is deviated from expected " + (actualQuantity - QuantityF));
					}

					String Average_Cost = (String) trigger.get("Average Cost");
					double Average_CostF = Double.parseDouble(Average_Cost.replace(",", ""));
					System.out.println("Difference Role : " + Average_CostF);
					if (Average_CostF == actualAverageCost) {
						System.out.println("Average Cost is same");
					} else {
						System.out.println(
								"Average Cost is deviated from expected " + (actualAverageCost - Average_CostF));
					}
					String Market_Price = (String) trigger.get("Market Price");
					double Market_PriceF = Double.parseDouble(Market_Price.replace(",", ""));
					System.out.println("ProductName Name : " + Market_PriceF);
					if (Market_PriceF == actualMarketPrice) {
						System.out.println("Market Price is same");
					} else {
						System.out.println(
								"Market Price is deviated from expected " + (actualMarketPrice - Market_PriceF));
					}

					String Purchase_Value = (String) trigger.get("Purchase Value");
					double Purchase_ValueF = Double.parseDouble(Purchase_Value.replace(",", ""));
					System.out.println("Valuation is : " + Purchase_ValueF);
					if (Purchase_ValueF == actualPurchaseValue) {
						System.out.println("Purchase Value is same");
					} else {
						System.out.println(
								"Purchase Value is deviated from expected " + (actualPurchaseValue - Purchase_ValueF));
					}

					String ValueOnToday = (String) trigger.get("Value");
					double ValueOnTodayF = Double.parseDouble(ValueOnToday.replace(",", ""));
					System.out.println("Cost_Basis is : " + ValueOnTodayF);
					if (ValueOnTodayF == actualValueOnToday) {
						System.out.println("Value is same");
					} else {
						System.out.println("Value is deviated from expected " + (actualValueOnToday - ValueOnTodayF));
					}

					String Unrealized_Gain_or_Loss = (String) trigger.get("Unrealized Gain or Loss");
					double Unrealized_Gain_or_LossF = Double.parseDouble(Unrealized_Gain_or_Loss.replace(",", ""));
					System.out.println("Difference Role : " + Unrealized_Gain_or_LossF);
					if (Unrealized_Gain_or_LossF == actualunrealizedGainOrLossInINR) {
						System.out.println("Unrealized Gain or Loss is same");
					} else {
						System.out.println("Unrealized Gain or Loss is deviated from expected "
								+ (actualunrealizedGainOrLossInINR - Unrealized_Gain_or_LossF));
					}
					String Un_realized_Gain_or_Loss_percentage = (String) trigger
							.get("Un-realized Gain or Loss percentage");
					double Un_realized_Gain_or_Loss_percentageF = Double
							.parseDouble(Un_realized_Gain_or_Loss_percentage.replace(",", ""));
					System.out.println("Cost_Basis is : " + Un_realized_Gain_or_Loss_percentageF);
					if (Un_realized_Gain_or_Loss_percentageF == actualunrealizedGainOrLossPercentage) {
						System.out.println("Un-realized Gain or Loss percentage is same");
					} else {
						System.out.println("Un-realized Gain or Loss percentage is deviated from expected "
								+ (actualunrealizedGainOrLossPercentage - Un_realized_Gain_or_Loss_percentageF));
					}

					System.out.println("\n");
				}
				count++;

			}

		} catch (

		FileNotFoundException e) {
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

}// End Of class
