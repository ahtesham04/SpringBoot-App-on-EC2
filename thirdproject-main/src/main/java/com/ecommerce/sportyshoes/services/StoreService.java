package com.ecommerce.sportyshoes.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ecommerce.sportyshoes.dao.StoreRepo;
import com.ecommerce.sportyshoes.model.Shoes;

@Service
@Transactional
public class StoreService {
	

	@Autowired
	StoreRepo sr;
	
	public List<Shoes> listAll(){
		return sr.findAll(Sort.by("brand").ascending());
	}
}
