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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "principal")

public class PrincipalDTO implements Serializable {

	public PrincipalDTO() {
		super();
	}

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Column(name = "princiId")
	private int princiId;
	@Column(name = "princiName")
	private String princiName;
	@Column(name = "princiEmail")
	private String princiEmail;
	@Column(name = "princiAddress")
	private String princiAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "collegId")
	private CollegeDTO collegedto;

	public int getPrinciId() {
		return princiId;
	}

	public void setPrinciId(int princiId) {
		this.princiId = princiId;
	}

	public String getPrinciName() {
		return princiName;
	}

	public void setPrinciName(String princiName) {
		this.princiName = princiName;
	}

	public String getPrinciEmail() {
		return princiEmail;
	}

	public void setPrinciEmail(String princiEmail) {
		this.princiEmail = princiEmail;
	}

	public String getPrinciAddress() {
		return princiAddress;
	}

	public void setPrinciAddress(String princiAddress) {
		this.princiAddress = princiAddress;
	}

	public CollegeDTO getCollegedto() {
		return collegedto;
	}

	public void setCollegedto(CollegeDTO collegedto) {
		this.collegedto = collegedto;
	}

	@Override
	public String toString() {
		return "PrincipalDTO [princiId=" + princiId + ", princiName=" + princiName + ", princiEmail=" + princiEmail
				+ ", princiAddress=" + princiAddress + ", collegedto=" + collegedto + "]";
	}

}
