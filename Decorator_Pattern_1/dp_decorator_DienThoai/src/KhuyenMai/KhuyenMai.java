package KhuyenMai;

import java.util.Date;

import dp_decorator_DienThoai_ThueBao.ThueBao;

public abstract class KhuyenMai extends ThueBao {
	private Date ngayBatDauApDung;
	protected ThueBao x;
	
	public Date getNgayBatDauApDung() {
		return ngayBatDauApDung;
	}

	public void setNgayBatDauApDung(Date ngayBatDauApDung) {
		this.ngayBatDauApDung = ngayBatDauApDung;
	}

}
