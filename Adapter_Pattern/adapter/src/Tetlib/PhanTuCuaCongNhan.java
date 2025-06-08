package Tetlib;

import java.time.LocalDate;

import CongNhanLib.CongNhan;

public class PhanTuCuaCongNhan implements PhanTu{
	private CongNhan cn;
	

	public PhanTuCuaCongNhan(CongNhan cn) {
		 this.cn = cn;
	}
	@Override
	public String GetDanhGia() {
		var NgayVaoLam = cn.getNgayBatDau();
		var HienTai = LocalDate.now();
		var thamnien = HienTai.getYear() -  NgayVaoLam.getYear() +  1;
		if (thamnien > 20)
			return "A";
		else if(thamnien > 10 )
			return "B";
		else if(thamnien > 5 )
			return "C";
		else if(thamnien >= 3 )
			return "D";
		else 
			return "X";
	}

	@Override
	public String GetLoai() {
		// TODO Auto-generated method stub
		return "CN";
	}

	@Override
	public String GetHoten() {
		// TODO Auto-generated method stub
		return cn.getHotenCD();
	}

}
