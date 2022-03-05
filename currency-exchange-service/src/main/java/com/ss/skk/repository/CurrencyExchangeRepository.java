package com.ss.skk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.skk.bean.CurrencyExchange;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}