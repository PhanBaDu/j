package vn.edu.husc.t1020161.baikiemtra;

public class Student {
	private String maHocSinh;
	private String hoVaTen;
	private String grade;
	
	public Student() {
	}
	
	public Student(String maHocSinh, String hoVaTen, String grade) {
		this.maHocSinh = maHocSinh;
		this.hoVaTen = hoVaTen;
		this.grade = grade;
	}
	
	public String getMaHocSinh() {
		return maHocSinh;
	}
	
	public void setMaHocSinh(String maHocSinh) {
		this.maHocSinh = maHocSinh;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [maHocSinh=" + maHocSinh + ", hoVaTen=" + hoVaTen + ", grade=" + grade + "]";
	} 
	
	public int getGradePoint() {
		if (grade == "A") {
			return 4;
		} else if (grade == "B") {
			return 3;
		} else if (grade == "C") {
			return 2;
		} else if (grade == "D") {
			return 1;
		} else {
			return 0;
		}
    }
}
