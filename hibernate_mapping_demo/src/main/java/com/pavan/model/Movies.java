package com.pavan.model;

public class Movies {
	 int id;
	 String Movie_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovie_name() {
		return Movie_name;
	}
	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int id, String movie_name) {
		super();
		this.id = id;
		Movie_name = movie_name;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", Movie_name=" + Movie_name + "]";
	}
	 
}
