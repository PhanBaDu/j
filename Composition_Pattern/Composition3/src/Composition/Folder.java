package Composition;


import java.util.ArrayList;
import java.util.List;

public class Folder implements Componert{
	private String name;
	private List<Componert> lisItem = new ArrayList<>();
	
	// danh sách các đối tượng chứa trong thư mục này


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Folder(String name , List<Componert>lisItem ) {
		super();
		this.name = name;
		this.lisItem=lisItem;
	}

	public List<Componert> getLisItem() {
		return lisItem;
	}

	public void setLisItem(List<Componert> lisItem) {
		this.lisItem = lisItem;
	}

	@Override
	public String gettenPhanTu() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getDuongDan(String DuongDan) {
		// TODO Auto-generated method stub
		return this.gettenPhanTu() + "/" + this.name;
	}

	@Override
	public String getLoai() {
		// TODO Auto-generated method stub
		return "Nhom tai lieu";
	}

	@Override
	public long getDungluong() {
		long kq = 0 ;
		for(Componert i : lisItem) {
			kq +=i.getDungluong();
		}
		return kq;
	}

}
