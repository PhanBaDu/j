package SinhVienmodel;

import java.util.Date;
public class SinhVien {
	private	String Masv;
	private	String Hoten;
	private	boolean Gioitinh;
	private	Date Ngaysinh;
	public String getMasv() {
		return Masv;
	}
	public void setMasv(String masv) {
		Masv = masv;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public boolean isGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		Gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public SinhVien(String masv, String hoten, boolean gioitinh, Date ngaysinh) {
		super();
		Masv = masv;
		Hoten = hoten;
		Gioitinh = gioitinh;
		Ngaysinh = ngaysinh;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
