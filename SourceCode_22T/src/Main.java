

import java.util.ArrayList;
import java.util.List;

import vn.edu.husc.t1020161.baikiemtra.SinhVien;
import vn.edu.husc.t1020161.baikiemtra.SinhVienReader;
import vn.edu.husc.t1020161.baikiemtra.Student;
import vn.edu.husc.t1020161.baikiemtra.StudentSort;

public class Main {
	public static void main(String[] args) {
		SinhVienReader instance = new SinhVienReader().getInstance();
		
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		
		dssv = instance.readSinhVien("C:\\Users\\PC\\Desktop\\NguyenTienDung_22T1020082\\Main\\SinhVien.txt");
	
		for (int i = 0; i < dssv.size(); i++) {
			System.out.println(dssv.get(i).toString());
		}
		
		List<Student> dsstd = new ArrayList<Student>();
		for (int i = 0; i < dssv.size(); i++) {
			String maHocSinh = dssv.get(i).getMaSinhVien();
			String hoVaTen = dssv.get(i).getHoDem() + dssv.get(i).getTen();
			Double diem = dssv.get(i).getDiem();
			
			String grade;
			if (diem >= 8.5) {
				grade = "A";
			} else if (diem >= 7 && diem < 8.5) {
				grade = "B";
			} else if (diem >= 6.5 && diem < 7) {
				grade = "C";
			} else if (diem >= 4 && diem < 6.5) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			Student st = new Student(maHocSinh, hoVaTen, grade);
			
			dsstd.add(st); 
		}
		
		StudentSort s = new StudentSort();
		s.sort(dsstd);
		System.out.println("STT StudentCode    FullName    Grade");
		for (int i = 0; i < dsstd.size(); i++) {
			System.out.println(i + "\t" + dsstd.get(i).toString());
		}
	}
}
