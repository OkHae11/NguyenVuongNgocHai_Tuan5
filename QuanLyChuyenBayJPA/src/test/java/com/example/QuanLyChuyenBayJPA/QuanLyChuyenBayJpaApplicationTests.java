package com.example.QuanLyChuyenBayJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.entity.NhanVien;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.NhanVienRepository;

@SpringBootTest
class QuanLyChuyenBayJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	@Autowired
	MayBayRepository mayBayRepository;

	@Autowired
	NhanVienRepository nhanVienRepository;

//	1.	Cho biết các chuyến bay đi Đà Lạt (DAD).
	@Test
    void cau1() {
        List<ChuyenBay> chuyenBays ;
        chuyenBays = chuyenBayRepository.findChuyenBaysDaLat();
        for (ChuyenBay chuyenBay : chuyenBays) {
            System.out.println(chuyenBay);
        }
    }

//	2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
//	@Test
//    void cau2() {
//        List<MayBay> mayBays ;
//        mayBays = mayBayRepository.findMayBayTamBayHon10000();
//        for (MayBay mb : mayBays) {
//            System.out.println(mb);
//        }
//    }

//	3.	Tìm các nhân viên có lương nhỏ hơn 10,000.
//	@Test
//    void cau3() {
//        List<NhanVien> nhanViens ;
//        nhanViens = nhanVienRepository.findNVLuongNH10000();
//        for (NhanVien nv : nhanViens) {
//            System.out.println(nv);
//        }
//    }

//	4.	Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
//	@Test
//	void cau4() {
//		List<ChuyenBay> chuyenBays;
//		chuyenBays = chuyenBayRepository.findChuyenBaysDoDaiNH10000LH8000();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}

//	5.	Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
//	@Test
//	void cau5() {
//		List<ChuyenBay> chuyenBays;
//		chuyenBays = chuyenBayRepository.findChuyenBaysfromSGNtoBMV();
//		for (ChuyenBay chuyenBay : chuyenBays) {
//			System.out.println(chuyenBay);
//		}
//	}
	
//	6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
//	@Test
//	void cau6() {
//		int chuyenBays;
//		chuyenBays = chuyenBayRepository.CountChuyenBaysfromSG();
//		System.out.println("Số chuyến bay xuất phát từ Sài Gòn: "+chuyenBays);
//	}
	
//	7.	Có bao nhiêu loại máy báy Boeing.
//	@Test
//	void cau7() {
//		int mayBays;
//		mayBays = mayBayRepository.findSoMayBayBoeing();
//		System.out.println("Số lượng máy bay loại Boeing: "+mayBays);
//	}
	
//	8.	Cho biết tổng số lương phải trả cho các nhân viên.
//	@Test
//	void cau8() {
//		int nhanViens;
//		nhanViens = nhanVienRepository.TongLuongNVPhaiTra();
//		System.out.println("Tổng số lương phải trả cho các nhân viên: "+nhanViens);
//	}
//	9.	Cho biết mã số của các phi công lái máy báy Boeing.
//	@Test
//    void cau9() {
//        List<String> nhanViens ;
//        nhanViens = nhanVienRepository.findNVLaiBoeing();
//        System.out.println("--Mã số của các phi công lái máy báy Boeing--");
//        for (String nv : nhanViens) {
//            System.out.println(nv);
//        }
//    }
//	10.	Cho biết các nhân viên có thể lái máy bay có mã số 747.
//	@Test
//    void cau10() {
//        List<NhanVien> nhanViens ;
//        nhanViens = nhanVienRepository.findNVByMaMB();
//        for (NhanVien nv : nhanViens) {
//            System.out.println(nv);
//        }
//    }
	
//	@Test
//    //Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
//void cau13() {
//
//    List<String> listMayBay = mayBayRepository.maMayBayThucHienDuongBayVn280();
//    System.out.println("Danh sách máy bay thực hiện được chuyến bay VN280 : ");
//    for (String maybay : listMayBay) {
//
//        System.out.println(maybay);
//
//    }
//}
}
