package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;


@RestController
public class ChuyenBayController {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@GetMapping("/didalat")
	public  List<ChuyenBay> findChuyenBaysDaLat(){
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	
	@GetMapping("/findChuyenBaysDoDaiNH10000LH800")
	public List<ChuyenBay> findChuyenBaysDoDaiNH10000LH8000(){
		return chuyenBayRepository.findChuyenBaysDoDaiNH10000LH8000();
	}
	
	@GetMapping("/findChuyenBaysfromSGNtoBMV")
	public List<ChuyenBay> findChuyenBaysfromSGNtoBMV(){
		return chuyenBayRepository.findChuyenBaysfromSGNtoBMV();
	}
//	@GetMapping("/CountChuyenBaysfromSG")
//	public List<ChuyenBay> CountChuyenBaysfromSG(){
//		int chuyenBays=chuyenBayRepository.CountChuyenBaysfromSG()
//		return ;
//	}
	
}
