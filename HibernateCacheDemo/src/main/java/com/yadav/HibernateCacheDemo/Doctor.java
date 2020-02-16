package com.yadav.HibernateCacheDemo;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity  
@Table(name="table_Dr")  
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class Doctor {

	@Id
	private int drId;
	private String drName;
	public int getDrId() {
		return drId;
	}
	public void setDrId(int drId) {
		this.drId = drId;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	@Override
	public String toString() {
		return "Doctor [drId=" + drId + ", drName=" + drName + "]";
	}
	
}
