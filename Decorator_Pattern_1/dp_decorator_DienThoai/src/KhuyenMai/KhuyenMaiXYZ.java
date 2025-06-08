package KhuyenMai;

public class KhuyenMaiXYZ extends KhuyenMai{

	@Override 
	public int getPhiThueBao() {
			return x.getPhiThueBao();		}
	
	@Override
	public int getSoPhutGoiFree() {
			return x.getSoPhutGoiFree() + 1000; //Khuyen mai 1000 phút gọi nội mạng
	}
	
	@Override
	public int getSoTinNhanFree() {
			return x.getSoTinNhanFree() ;
	}
	
	@Override
	public int getGiaGoi() {
			// goi 1 phut ton bao nhieu
			return x.getGiaGoi();
	}
	
	@Override
	public int getGiaTinNhan() {
			// 1 tin nhan ton bao nhieu	
			return x.getGiaTinNhan();
	}

}
