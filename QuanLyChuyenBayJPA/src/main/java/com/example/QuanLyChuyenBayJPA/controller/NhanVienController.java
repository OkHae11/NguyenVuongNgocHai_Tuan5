package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBayJPA.entity.NhanVien;
import com.example.QuanLyChuyenBayJPA.repository.NhanVienRepository;

@RestController
public class NhanVienController {
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@GetMapping("/findnhanvienluongnhohon10000")
	public List<NhanVien> findnhanvienluongnhohon10000(){
		return nhanVienRepository.findNVLuongNH10000();
	}
	
	@GetMapping("/TongLuongNVPhaiTra")
	public int TongLuongNVPhaiTra(){
		return nhanVienRepository.TongLuongNVPhaiTra();
	}
	
	@GetMapping("/findNVLaiBoeing")
	public List<String> findNVLaiBoeing(){
		return nhanVienRepository.findNVLaiBoeing();
	}
	@GetMapping("/findNVByMaMB")
	public List<NhanVien> findNVByMaMB(){
		return nhanVienRepository.findNVByMaMB();
	}
	
}
