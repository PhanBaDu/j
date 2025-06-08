package ChuongTrinh;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import CongNhanLib.CongNhanReader;
import SinhVienLib.SinhVien;
import SinhVienLib.SinhVienReader;
import Tetlib.PhanTu;
import Tetlib.PhanTuCuaCongNhan;
import Tetlib.PhanTuCuaSinhVien;



public class Main {
	
	

	public static void main(String[] args) throws IOException, ParseException {
		var lstSV = SinhVienReader.SinhVienList("SinhVienLib.txt");
		
		var lstCN = CongNhanReader.CongNhanList("CongNhanLib.txt");
		for(var i : lstSV ) {
			System.out.println(i.getHoTen() + i.getMasv() + i.getTrungBinhDiem());
		}
		for(var i : lstCN ) {
			System.out.println(i.getHotenCD() + i.getNgayBatDau());
		}
		
		var lisAll =new ArrayList<PhanTu>();
		for(SinhVien sv : lstSV) 
			lisAll.add(new PhanTuCuaSinhVien(sv));
		
		for(var cn : lstCN)
			lisAll.add (new PhanTuCuaCongNhan(cn));
		
		int stt = 0;
		System.out.println("Danh sach sau khi gop ");
		
		for(var x : lisAll) {
			System.out.printf("%4d %15s %5s %6s \n",stt++ , x.GetHoten(),x.GetLoai(),x.GetDanhGia());
		}
		
		
		sapxeptheoLoai(lisAll);
		System.out.println("Danh sach sau khi sap xep : ");
		for(var x : lisAll) {
			System.out.printf("%4d %15s %5s %6s \n",stt++ , x.GetHoten(),x.GetLoai(),x.GetDanhGia());
		}
	}

	private static void sapxeptheoLoai(ArrayList<PhanTu> lisAll) {
		for(int i = 0; i < lisAll.size() -1 ; i++ ) {
			for(int j = i +1 ; j < lisAll.size() -1 ; j++ ) {
				if(lisAll.get(i).GetDanhGia().compareTo(lisAll.get(j).GetDanhGia()) > 0){
					var temp = lisAll.get(i);
					lisAll.set(i,lisAll.get(j));
					lisAll.set(j, temp);
				}
						
			}
		}
		
	}

}
