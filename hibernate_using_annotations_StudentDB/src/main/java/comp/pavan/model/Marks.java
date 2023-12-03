package comp.pavan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="markes_tb")

public class Marks {
	
	@Id
	@Column(name="st_td")
	int id;
	@Column(name="tel")
	int Tel;
	@Column(name="hin")
	int Hin;
	@Column(name="eng")
	int Eng;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	public int getHin() {
		return Hin;
	}
	public void setHin(int hin) {
		Hin = hin;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	@Override
	public String toString() {
		return "Marks [id=" + id + ", Tel=" + Tel + ", Hin=" + Hin + ", Eng=" + Eng + "]";
	}
	public Marks(int id, int tel, int hin, int eng) {
		super();
		this.id = id;
		Tel = tel;
		Hin = hin;
		Eng = eng;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
}
