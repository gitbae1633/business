package com.douzone.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douzone.business.repository.BusinessRepository;
import com.douzone.business.vo.BusinessVo;


@Service
public class BusinessService {
	@Autowired
	BusinessRepository businessRepository;
	
	public boolean addBusiness(BusinessVo vo) {
		return businessRepository.insert(vo);
	}
}
