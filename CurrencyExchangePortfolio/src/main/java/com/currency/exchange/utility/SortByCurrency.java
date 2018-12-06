package com.currency.exchange.utility;

import java.util.Comparator;

import com.currency.exchange.entity.Currency_TAB;

public class SortByCurrency implements Comparator<Currency_TAB>{

	@Override
	public int compare(Currency_TAB o1, Currency_TAB o2) {
		// TODO Auto-generated method stub
		//return o1.getCurrency() - o2.getCurrency(); 
		/*if(o1.getCurrency().equals(o2.getCurrency())) {
			return -1;
		}else {
			return 1;
		}*/
		
		return o1.getId() - o2.getId();
		
	}

}
