package com.example.QuanLyChuyenBayJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.QuanLyChuyenBayJPA.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, String>{
	@Modifying
    @Transactional
    @Query(value = "select * from maybay where  tambay >10000   ", nativeQuery = true)
    public List<MayBay> findMayBayTamBayHon10000();
	
	@Transactional
    @Query(value = "select count(*) from maybay where loai like 'Boeing%'   ", nativeQuery = true)
    public int findSoMayBayBoeing();
	
	 @Query(value = "select * from maybay where  tambay > (select  dodai from  chuyenbay where  macb='VN280') ", nativeQuery = true)
	    public List<String> maMayBayThucHienDuongBayVn280();
}
