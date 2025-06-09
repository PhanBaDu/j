 package vn.edu.husc.t1020161.baikiemtra;

public class SinhVienBuilder {
	private String maSinhVien;
	private String hoDem;
	private String ten;
	private Boolean gioiTinh;
	private Double diem;
	
	public SinhVienBuilder() {
		
	}
	
	public SinhVienBuilder setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
		return this;
	}
	
	public SinhVienBuilder sethoDem(String hoDem) {
		this.hoDem = hoDem;
		return this;
	}
	
	public SinhVienBuilder setten(String ten) {
		this.ten = ten;
		return this;
	}
	
	public SinhVienBuilder setgioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
		return this;
	}
	
	public SinhVienBuilder setdiem(Double diem) {
		this.diem = diem;
		return this;
	}
	
	public SinhVien build() {
		if(maSinhVien==null|| maSinhVien.trim().isEmpty()) {
			throw new IllegalArgumentException("maSinhVien Khong Duoc De Trong");
		}
		if (hoDem==null|| hoDem.trim().isEmpty()) {
			throw new IllegalArgumentException("hoDem Khong Duoc De Trong");
		}
		if (ten==null|| ten.trim().isEmpty()) {
			throw new IllegalArgumentException("hoDem Khong Duoc De Trong");
		}
		if (diem < 0 || diem > 10) {
			throw new IllegalArgumentException("diem Khong Hop Le");
		}
		
		return new SinhVien(maSinhVien, hoDem, ten, gioiTinh, diem);
	}
}
