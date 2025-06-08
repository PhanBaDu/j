package Tetlib;

import SinhVienLib.SinhVien;

public class PhanTuCuaSinhVien implements PhanTu{
	private SinhVien sv;
	public PhanTuCuaSinhVien(SinhVien sv) {
		this.sv= sv;	
	}
	@Override
	public String GetDanhGia() {
		float dtb = sv.getTrungBinhDiem();
		if (dtb >8.5)
			return "A";
		else if(dtb > 7.5 )
			return "B";
		else if(dtb > 6.5 )
			return "C";
		else if(dtb >= 4 )
			return "D";
		else 
			return "X";
	}

	@Override
	public String GetLoai() {
		return "SV";
	}

	@Override
	public String GetHoten() {
		
		return sv.getHoTen();
	}

}
