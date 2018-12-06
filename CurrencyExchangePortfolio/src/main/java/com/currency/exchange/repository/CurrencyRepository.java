package com.currency.exchange.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.currency.exchange.entity.Currency_TAB;

@Repository
public interface CurrencyRepository extends CrudRepository<Currency_TAB, Integer> {
	
	
	@Query("SELECT c FROM currency_tab c WHERE c.date = (:date)")
	
    public List<Currency_TAB> findByDate(@Param("date") String date);
    
    @Query("SELECT \r\n" + 
    		"		c \r\n" + 
    		"	FROM\r\n" + 
    		"		currency_tab c  where c.price in (SELECT \r\n" + 
    		"		MAX(price) as p\r\n" + 
    		"	FROM\r\n" + 
    		"		currency_tab group by currency) \r\n" + 
    		"        \r\n" + 
    		"        group by c.currency")
	
    public List<Currency_TAB> findByMax	();
    
    @Query("SELECT \r\n" + 
    		"		c \r\n" + 
    		"	FROM\r\n" + 
    		"		currency_tab c  where c.price in (SELECT \r\n" + 
    		"		MIN(price) as p\r\n" + 
    		"	FROM\r\n" + 
    		"		currency_tab group by currency) \r\n" + 
    		"        \r\n" + 
    		"        group by c.currency")
	
    public List<Currency_TAB> findByMin	();

}
