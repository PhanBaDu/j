package SinhVien;

public  class SinhVien {
	private String maSinhVien;
	private String hoTen;

	public SinhVien(SinhVien x) {
		this.maSinhVien = x.maSinhVien;
		this.hoTen = x.hoTen;
	}



	public SinhVien taoBanSao() {
		return new SinhVien(this);
	}
	
	@Override
	public String toString() {
		return "Sinh viên " + this.getHoTen();				
	}

	
	
	
	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public SinhVien(String maSinhVien, String hoTen) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
	}
	
	
}
