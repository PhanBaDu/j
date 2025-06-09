package vn.edu.husc.t1020161.baikiemtra;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
	 public StudentSort () {}
	
	 public static void sort(List<Student> lst) {
		 Collections.sort(lst, Comparator.comparingInt(Student::getGradePoint));
	 }
}
    