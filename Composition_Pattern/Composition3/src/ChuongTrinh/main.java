package ChuongTrinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Composition.Componert;
import Composition.File;
import Composition.Folder;

public class main {
	public static void main(String[] args) {
		List<Componert> lst= new ArrayList<>(); 
		Componert MsSQLServerfile = new File("MsSQL Server file", 500);	lst.add(MsSQLServerfile);
		Componert PosegraSQL = new File("PosegraSQL", 246);				lst.add(PosegraSQL);
		Componert MySQL = new File("MySQL", 199);						lst.add(MySQL);
		Componert SQLite = new File("SQLite", 10);						lst.add(SQLite);
		Componert MSDN = new File("MSDN", 15);							lst.add(MSDN);
		Componert EA = new File("EA", 200);								lst.add(EA);
		Componert StarUML = new File("StarUML", 22);					lst.add(StarUML);
		Componert dotNET = new File("dotNET", 199);						lst.add(dotNET);
		Componert Eclipse = new File("eclipse", 15);					lst.add(Eclipse);
		Componert LibreOffice = new File("Libre Office", 100);			lst.add(LibreOffice);
		Componert MsOffice = new File("Ms Office ", 129);				lst.add(MsOffice);
		
		Componert DBtools 	= new Folder("DB tools", Arrays.asList(MsSQLServerfile,PosegraSQL,MySQL,SQLite));  				lst.add(DBtools);
		Componert Casetools 	= new Folder("Casetools", Arrays.asList(EA,StarUML));										lst.add(Casetools);
		Componert Developmenttools 	= new Folder("Developmenttools", Arrays.asList(DBtools,MSDN,Casetools,dotNET,Eclipse));	lst.add(Developmenttools);
		Componert Officetools	= new Folder("Office tools", Arrays.asList(LibreOffice,MsOffice));							lst.add(Officetools);
		
		System.out.println("STT   "+"           TenPhanTu        "+"       Duong dan day du         " + "Loai      " + "Dung Luong");
		int t = 0;
		for(var i : lst) {
			System.out.printf("%5d  %30s                         %12s   %8d\n",t++,i.gettenPhanTu(),i.getLoai(),i.getDungluong());
		}
	}
}	
