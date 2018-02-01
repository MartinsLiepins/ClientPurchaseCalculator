package com.mlproject.ClientPurchaseCalc.controller;

import com.mlproject.ClientPurchaseCalc.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by martins.
 */
@Controller
public class PurchaseCalculator {
	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping("/calcDemo")
	public String discountCalculator(){
		return "empty";
	}

	@RequestMapping("/calcDemo/calcDiscount")
	public String calculateDiscount(@RequestParam(value="customerName") String customerName,
							 @RequestParam(value="purchaseType") String purchaseType,
							 @RequestParam(value="units") int units){
		return "empty";
	}
}
