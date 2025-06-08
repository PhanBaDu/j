package SinhVienDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import SinhVienmodel.SinhVien;

public class SinhVienDao {
	private String ConnectionString;

	public SinhVienDao(String connectionString) {
		super();
		ConnectionString = connectionString;
	}
	private Connection _cnn;
	private Connection getConnection() throws SQLException {
		if(_cnn == null) {
			_cnn =DriverManager.getConnection(ConnectionString);
		}
		return _cnn;
	}
public List<SinhVien> SelectAll () throws SQLException{
	List<SinhVien> lst = new ArrayList<>();
	
	Connection cnn = this.getConnection();
	Statement stmt = cnn.createStatement();
	
	String query = "Select * from SinhVien";
	ResultSet rs = stmt.executeQuery(query);
	
	while(rs.next()) {
		String Masv = rs.getNString(1);
		String Hoten = rs.getNString(2);
		boolean Gioitinh = rs.getBoolean(3);
		Date Ngaysinh = rs.getDate(4);
		
		SinhVien sv = new SinhVien(Masv,Hoten,Gioitinh,Ngaysinh);
		lst.add(sv);
		}
	rs.close();
	stmt.close();
	return lst;
}
	
public boolean Insert(SinhVien x) throws SQLException{
	Connection cnn = this.getConnection();
	Statement stmt = cnn.createStatement();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	String stNgaySinh = sdf.format(x.getNgaysinh());
	String query = String.format(
			"INSERT INTO SinhVien (MaSinhVien, HoTen, GioiTinhNam, NgaySinh) "
					+ "VALUES ('%s', N'%s', %d, '%s')",
			x.getMasv(),
			x.getHoten(),
			x.isGioitinh() ? 1 : 0,
			stNgaySinh// x.getNgaySinh()
	);
	int n = stmt.executeUpdate(query);

	// 4. giải phóng rsc
	stmt.close();
//	cnn.close();

	return n > 0;
			
	
}

public boolean Deletesv(String msv) throws SQLException {
	Connection cnn = this.getConnection();
	Statement stmt = cnn.createStatement();
	
	String query = String.format("DELETE FROM SINHVien where Masinhvien = '%s'", msv);
	int n = stmt.executeUpdate(query);
	stmt.close();
	
	return n>0;
	
}
public boolean Updatesv(SinhVien x) throws SQLException{
	Connection cnn = this.getConnection();
	Statement stmt = cnn.createStatement();
	
	String query = String.format("update SinhVien set HoTen = '%s' where MaSinhVien = '%s'",
			x.getHoten() , 
			x.getMasv() );
	int n = stmt.executeUpdate(query);
	stmt.close();
	
	return n>0;
	
}
}
	
	
