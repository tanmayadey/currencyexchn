package com.currency.exchange.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.entity.Currency_TAB;
import com.currency.exchange.model.CurrencyModel;
import com.currency.exchange.repository.CurrencyRepository;
import com.currency.exchange.service.CurrencyService;
import com.currency.exchange.utility.SortByCurrency;
import com.fasterxml.jackson.databind.util.JSONPObject;


@RestController
public class CurrencyController {
	
	@Autowired
    CurrencyRepository currencyRepository; // which will do all data retrieval/manipulation work
	
	/**
	 * read the data and find out the best profit 
	 * @return list of data
	 */
	
	@RequestMapping(value = "/councurrencyexchange", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Currency_TAB> getCurrencyDifference () {
		/*Currency_TAB curModel = new Currency_TAB();
		curModel.setCurrency("LTC");
		curModel.setDate("20180521");
		curModel.setPrice("34");
		curModel.setTime("11:05");
		curModel.setId(5);
		
		currencyRepository.save(curModel);*/
		
		
		List <Currency_TAB> listMian = new ArrayList<>();
		List<Currency_TAB> listCurMax = currencyRepository.findByMax();
		List<Currency_TAB> listCurmin = currencyRepository.findByMin();
		
		//Iterable<List<Currency_TAB>> itrcur = Arrays.asList(listCurMax);
		listMian.addAll(listCurMax);
		listMian.addAll(listCurmin);
		Collections.sort(listMian, new SortByCurrency());
		return listMian;
		
		
	}

	
	
	
 
	
}
