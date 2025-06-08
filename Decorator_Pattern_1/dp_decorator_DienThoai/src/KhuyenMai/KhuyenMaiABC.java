package KhuyenMai;

import dp_decorator_DienThoai_ThueBao.ThueBao;

public class KhuyenMaiABC extends KhuyenMai {
	
		public KhuyenMaiABC(ThueBao x) {
		// TODO Auto-generated constructor stub
	}

		@Override 
		public int getPhiThueBao() {
				return x.getPhiThueBao();		}
		
		@Override
		public int getSoPhutGoiFree() {
				return x.getSoPhutGoiFree(); // khong anh huong gi den so phut goi free cua thue bao
		}
		
		@Override
		public int getSoTinNhanFree() {
				return x.getSoTinNhanFree() + 1000;
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

