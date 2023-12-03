package com.pavan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marks {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int s_id;
@Column
	int tel;
@Column
	int hid;
@Column
	int eng;
@Column
	int mat;
@Column
	int sic;
@Column
	int soc;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSic() {
		return sic;
	}
	public void setSic(int sic) {
		this.sic = sic;
	}
	public int getSoc() {
		return soc;
	}
	public void setSoc(int soc) {
		this.soc = soc;
	}
	@Override
	public String toString() {
		return "Marks [s_id=" + s_id + ", tel=" + tel + ", hid=" + hid + ", eng=" + eng + ", mat=" + mat + ", sic="
				+ sic + ", soc=" + soc + "]";
	}
	public Marks(int s_id, int tel, int hid, int eng, int mat, int sic, int soc) {
		super();
		this.s_id = s_id;
		this.tel = tel;
		this.hid = hid;
		this.eng = eng;
		this.mat = mat;
		this.sic = sic;
		this.soc = soc;
	}
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
