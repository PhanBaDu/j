package SinhVienLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SinhVienReader {
	static public List<SinhVien> SinhVienList(String filename) throws IOException  {
		var lst = new ArrayList<SinhVien>();

		var br = new BufferedReader(new FileReader(filename));
		while (true) {
			var line = br.readLine();
			if (line == null)
				break;

			var info = line.split(";");
			var Masv = info[0];
			var Hoten = info[1];
			var DiemTB = info[2];
		

			var x = new SinhVien();
			x.setMasv(Masv);
			x.setHoTen(Hoten);
			x.setTrungBinhDiem(Float.parseFloat(DiemTB) );

			lst.add(x);
		}
		br.close();
		return lst;
	}
}
