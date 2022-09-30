package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;

@RestController
public class MayBayController {

	@Autowired
	MayBayRepository mayBayRepository;
	
	@GetMapping("/tambaylonhon10000")
	public List<MayBay> finmaybaytamlon10000(){
		return mayBayRepository.findMayBayTamBayHon10000();
	}
}
