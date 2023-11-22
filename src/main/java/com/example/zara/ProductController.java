package com.example.zara;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

@RestController
public class ProductController {

	@Autowired
	PricesRepository pricesRepo;

	@GetMapping("/pricecheck")
	public JsonObject pricecheck(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH.mm.ss") Date date, @RequestParam int prodId, @RequestParam int brandId) {
		JsonObject json = new JsonObject();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		
		Prices queryPrice = pricesRepo.findByDate(date);
	
		String dateResponse = df.format(date);
		json.addProperty("Product ID", prodId);
		json.addProperty("Brand ID", brandId);
		json.addProperty("Tariff", queryPrice.getPriceList());
		json.addProperty("Date", dateResponse);
		json.addProperty("Final Price", queryPrice.getPrice());
		
		return json;
	}
}
