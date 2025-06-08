package main;

import java.util.ArrayList;
import java.util.List;

import SinhVien.SinhVien;
import SinhVien.SinhVienNuocNgoai;

public class main {
	public static void main(String[] args) {
		List<SinhVien> lst1 = new ArrayList<>();

		lst1.add(new SinhVien("sv1", "Nguyễn Văn Trung"));
		lst1.add(new SinhVienNuocNgoai("sv2", "Trần Văn", "Công ty ABC"));
		lst1.add(new SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new SinhVien("sv100", "John Smith"));
 
		System.out.println("DANH SÁCH GỐC");
		for (var i : lst1)
				System.out.println(i.toString());
		
		
		System.out.println("\nTẠO BẢN SAO KIỂU 2");
		
		// Tạo bản sao
		List<SinhVien> lst2 = new ArrayList<>();
		for (var i : lst1) {
				lst2.add(i.taoBanSao());
		}

		// In danh sách bản sao
		for (var i : lst2)
			System.out.println(i.toString());
	}

}
