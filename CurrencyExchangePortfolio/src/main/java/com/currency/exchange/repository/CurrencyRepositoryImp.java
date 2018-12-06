package com.currency.exchange.repository;

import java.util.List;
import java.util.Optional;

import com.currency.exchange.entity.Currency_TAB;
import com.currency.exchange.model.CurrencyModel;

public class CurrencyRepositoryImp implements CurrencyRepository {

	@Override
	
	public <S extends Currency_TAB> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Currency_TAB> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Currency_TAB> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Currency_TAB> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Currency_TAB> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Currency_TAB entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Currency_TAB> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	public Iterable<Currency_TAB> findByDate(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Currency_TAB> findByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Currency_TAB> findByMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Currency_TAB> findByMin() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

		
}
