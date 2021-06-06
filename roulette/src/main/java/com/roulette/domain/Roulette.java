package com.roulette.domain;

import java.util.Map;

public interface Roulette {
	Map<String, Roulette> findAll();
	Roulette findById(String id);
	void save(Roulette roulette);
	void delete(String id);

}
