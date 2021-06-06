package com.roulette.repository;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import com.roulette.domain.Roulette;

public class RouletteRepository implements RedisRepository {
    private static final String KEY = "Roulette";
    
	private RedisTemplate<String, Roulette> redisTemplate;
	private HashOperations hashOperations;
	
	public RouletteRepository(RedisTemplate<String, Roulette> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	public Map<String, Roulette> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roulette findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Roulette roulette) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
