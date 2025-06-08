package ChuongTrinh;

import KhuyenMai.KhuyenMaiABC;
import dp_decorator_DienThoai_ThueBao.ThueBao;
import dp_decorator_DienThoai_ThueBao.ThueBao_Basic;

public class Main {
	static void testThueBao() {
		ThueBao x ;
		x = new ThueBao_Basic();
		System.out.printf("Phí thuê bao : %d    Số phút gọi free : %d    Số tin nhắn free : %d    Giá gọi : %d     Giá tin nhắn : %d \n",
						x.getPhiThueBao() , x.getSoPhutGoiFree() ,x.getSoTinNhanFree() , x.getGiaGoi() , x.getGiaTinNhan());
		
		ThueBao x2 = null;
		x2 = new KhuyenMaiABC(x);
		
	}
	public static void main(String[] args) {
		testThueBao();
		
	}
}
