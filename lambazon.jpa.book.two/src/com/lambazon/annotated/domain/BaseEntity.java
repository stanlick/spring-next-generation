package com.lambazon.annotated.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass 
public abstract class BaseEntity implements Serializable{

	private static final long serialVersionUID = -7472273720944132723L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Version
	private int version;

	
	public Integer getId(){
		return id;
	}

	public void setId(Integer id) {
		this.id=id;
	}
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

//	@Override
//	public String toString() {
//		return "BaseEntity [id=" + id + ", version=" + version + "]";
//	}

}
