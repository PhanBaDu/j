package vn.edu.husc.t1020161.baikiemtra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SinhVienReader {
	private static SinhVienReader instance;
	
	public SinhVienReader() {
		
	}
	
	public static SinhVienReader getInstance () {
		if (instance == null) {
			instance = new SinhVienReader();
		}
		
		return instance;
	}
	
	public static List<SinhVien> readSinhVien(String pathFile) {
       List<SinhVien> dssv = new ArrayList<SinhVien>();
       
       try {
           BufferedReader reader = new BufferedReader(new FileReader(pathFile));
           String line;
           while ((line = reader.readLine()) != null) {
               SinhVien sv = SinhVienFactory.readLine(line);
               
               dssv.add(sv);
           }
           reader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
		
		return dssv;
	}
}
  