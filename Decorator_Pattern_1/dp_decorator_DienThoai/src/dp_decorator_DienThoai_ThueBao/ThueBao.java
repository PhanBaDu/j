package dp_decorator_DienThoai_ThueBao;

public abstract class ThueBao {
	private double soDu;
	abstract public int getPhiThueBao();
	abstract public int getSoPhutGoiFree();
	abstract public int getSoTinNhanFree();
	abstract public int getGiaGoi(); // goi 1 phut ton bao nhieu
	abstract public int getGiaTinNhan(); // 1 tin nhan ton bao nhieu
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	
	
}
