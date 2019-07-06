package com.xworkz.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import com.xworkz.hibernate.dto.PrincipalDTO;

@Entity
@Table(name = "college")

public class CollegeDTO implements Serializable {

	public CollegeDTO() {
		super();
	}

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Column(name = "collegId")
	private int collegId;
	@Column(name = "collegName")
	private String collegName;
	@Column(name = "collegeLocn")
	private String collegeLocn;
	@Column(name = "noOfDept")
	private int noOfDept;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PrincipalDTO principaldto;

	public int getCollegId() {
		return collegId;
	}

	public void setCollegId(int collegId) {
		this.collegId = collegId;
	}

	public String getCollegName() {
		return collegName;
	}

	public void setCollegName(String collegName) {
		this.collegName = collegName;
	}

	public String getCollegeLocn() {
		return collegeLocn;
	}

	public void setCollegeLocn(String collegeLocn) {
		this.collegeLocn = collegeLocn;
	}

	public int getNoOfDept() {
		return noOfDept;
	}

	public void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	public PrincipalDTO getPrincipaldto() {
		return principaldto;
	}

	public void setPrincipaldto(PrincipalDTO principaldto) {
		this.principaldto = principaldto;
	}

	@Override
	public String toString() {
		return "CollegeDTO [collegId=" + collegId + ", collegName=" + collegName + ", collegeLocn=" + collegeLocn
				+ ", noOfDept=" + noOfDept + ", principaldto=" + principaldto + "]";
	}

}
