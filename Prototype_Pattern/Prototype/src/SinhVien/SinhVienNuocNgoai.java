package SinhVien;

public class SinhVienNuocNgoai extends SinhVien{
	private String quocGia;

	public SinhVienNuocNgoai(SinhVienNuocNgoai x) {
		super(x);
		this.quocGia = x.quocGia;
	}

	@Override
	public SinhVien taoBanSao() {
		return new SinhVienNuocNgoai(this);
	}

	@Override
	public String toString() {
		return "Sinh viên NUOC NGOAI " + this.getHoTen() + " có quốc tịch = " + this.getQuocGia();
	}
 
	
	
	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	public SinhVienNuocNgoai(SinhVien x, String quocGia) {
		super(x);
		this.quocGia = quocGia;
	}

	public SinhVienNuocNgoai(SinhVien x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public SinhVienNuocNgoai(String maSinhVien, String hoTen,String qg) {
		super(maSinhVien, hoTen);
		this.quocGia =qg;
		// TODO Auto-generated constructor stub
	}


	
	
	
}
