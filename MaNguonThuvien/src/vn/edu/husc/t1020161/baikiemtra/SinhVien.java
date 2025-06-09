package vn.edu.husc.t1020161.baikiemtra;

public class SinhVien {
	private String maSinhVien;
	private String hoDem;
	private String ten;
	private Boolean gioiTinh;
	private Double diem;
	public SinhVien() {
		
	}
	public SinhVien(String maSinhVien, String hoDem, String ten, Boolean gioiTinh, Double diem) {
		this.maSinhVien = maSinhVien;
		this.hoDem = hoDem;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoDem=" + hoDem + ", ten=" + ten + ", gioiTinh=" + gioiTinh
				+ ", diem=" + diem + "]";
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}
}
