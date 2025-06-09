package vn.edu.husc.t1020161.baikiemtra;

public class SinhVienFactory {
	public SinhVienFactory() {
		
	}
	
	public static SinhVien readLine (String line) {
		String[] parts = line.split(",");
		
		if (parts.length != 5) {
			throw new IllegalArgumentException("Du lieu khong dung dinh dang");
		}
		
		try {
			return new SinhVienBuilder()
					.setMaSinhVien(parts[0].trim())
					.sethoDem(parts[1])
					.setten(parts[2])
					.setgioiTinh(parts[3].trim().equals("1"))
					.setdiem(Double.parseDouble(parts[4].trim()))
					.build();
		} catch (Exception e) {
			throw new IllegalArgumentException("Loi: " + line, e);
		}
	}
}
