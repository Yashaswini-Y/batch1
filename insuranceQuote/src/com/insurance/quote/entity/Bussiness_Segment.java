package com.insurance.quote.entity;

public class Bussiness_Segment {
	private String bus_Seg_Id;
	private int bus_seg_seq;
	private String bus_Seg_Name;

	public Bussiness_Segment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bussiness_Segment(String bus_Seg_Id, int bus_seg_seq, String bus_Seg_Name) {
		super();
		this.bus_Seg_Id = bus_Seg_Id;
		this.bus_seg_seq = bus_seg_seq;
		this.bus_Seg_Name = bus_Seg_Name;
	}

	public String getBus_Seg_Id() {
		return bus_Seg_Id;
	}

	public void setBus_Seg_Id(String bus_Seg_Id) {
		this.bus_Seg_Id = bus_Seg_Id;
	}

	public int getBus_seg_seq() {
		return bus_seg_seq;
	}

	public void setBus_seg_seq(int bus_seg_seq) {
		this.bus_seg_seq = bus_seg_seq;
	}

	public String getBus_Seg_Name() {
		return bus_Seg_Name;
	}

	public void setBus_Seg_Name(String bus_Seg_Name) {
		this.bus_Seg_Name = bus_Seg_Name;
	}
	
}
