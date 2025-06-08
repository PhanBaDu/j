package SinhVienMain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import SinhVienDao.SinhVienDao;
import SinhVienmodel.SinhVien;

public class ChuongTrinhChinh {
	static void InDanhSach(List<SinhVien> lst) {
		for (int i = 0; i < lst.size(); i++) {
			var x = lst.get(i);
			System.out.printf("%3d %6s %30s %5s %s\n",
					i + 1,
					x.getMasv(),
					x.getHoten(),
					x.isGioitinh() ? "Nam" : "Nữ",
					x.getNgaysinh());
		}
	}

	static String DocChuoiKetNoi() throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("config.txt"));
		String st = br.readLine();
		br.close();
		return st;
	}
	public static void main(String[] args) throws IOException, SQLException {
		String chuoiketnoi = DocChuoiKetNoi();
		 System.out.println("Đã kết nối ");
		 SinhVienDao dao = new SinhVienDao(chuoiketnoi);
		 
		
		 List<SinhVien> lst = dao.SelectAll();
		 System.out.println("Danh sách");
		 InDanhSach(lst);
		 
		 SinhVien x = new SinhVien();
		 x.setMasv("t1020");
		 x.setHoten("Ngọc Ngọc");
		 x.setGioitinh(false);
		 x.setNgaysinh(new Date(2004/06/11));
		 try {
			 dao.Insert(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("K insert được");
		}
		System.out.println("Sau khi insert..");
		lst=dao.SelectAll();
		InDanhSach(lst);
		
		String sv = "sv9";
		try {
			dao.Deletesv(sv);
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("Không thêm thành công");
		}
	
	
			lst=dao.SelectAll();
		InDanhSach(lst);
		
		SinhVien x1 = new SinhVien();
		x1.setHoten("BII");
		x1.setMasv("sv001");
		try {
			dao.Updatesv(x1);
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("Update k thành công");
		}
		lst=dao.SelectAll();
		InDanhSach(lst);
	}
	
}
