package Composition;

public class File implements Componert {
	private String name;
	private long size;
	@Override
	public String gettenPhanTu() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getDuongDan(String DuongDan) {
		// TODO Auto-generated method stub
		return this.getDuongDan(DuongDan) +"/"+ this.name;
	}

	@Override
	public String getLoai() {
		// TODO Auto-generated method stub
		return "Tai lieu";
	}

	@Override
	public long getDungluong() {
		// TODO Auto-generated method stub
		return this.size;
	}

	public File(String name, long size) {
		super();
		this.name = name;
		this.size = size;
	}

	
}
