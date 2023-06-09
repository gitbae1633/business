package com.douzone.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.douzone.business.dto.JsonResult;
import com.douzone.business.service.BusinessService;
import com.douzone.business.vo.BusinessVo;



@RestController
@RequestMapping("/api/business")
public class BusinessController {
	@Autowired
	private BusinessService businessService;

	@PostMapping("")
	public ResponseEntity<JsonResult> add(@RequestBody BusinessVo vo) {
		System.out.println(vo);
		return ResponseEntity.status(HttpStatus.OK).body(JsonResult.success(businessService.addBusiness(vo)));
	}

	
}