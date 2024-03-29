package com.ydk.account.persistence.entity;

// Generated Jan 25, 2010 9:49:58 AM by Hibernate Tools 3.2.4.GA

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

import javax.persistence.Table;


import org.springframework.core.style.ToStringCreator;




/**
 * Owners generated by hbm2java
 */
@Entity
@Table(name = "accounts", catalog = "ydk", uniqueConstraints = @UniqueConstraint(columnNames = "account_name"))
public class Account implements java.io.Serializable {

//	public enum Role{GUEST, VIP, ADMIN};
//	public enum AccountStatus{INACTIVED, ACTIVED, TOBE_DELETED};
	
	private Long id;
	//Account Infomation
	private String accountName;
	private String password;
	private String email;
	private String role;
	private Long	score;
	private Date	latestLoginDate;
	private Date	registerDate;
	private String status;
	private FileDescriptor image;
	//Account Address Infomation
	
	//Personal Infomation
	private String firstName;
	private String lastName;
	private String sex;
	private String address;
	private String city;
	private String telephone;
	private ArrayList<String> interests = new ArrayList<String>();
	
	
//	private Set petses = new HashSet(0);

	public Account() {
	}

	public Account(String accountName, String firstName, String lastName, String address,
			String city, String telephone, String role) {
		this.accountName = accountName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(generator="UniqueIdGenerator")
//	@GenericGenerator(name="UniqueIdGenerator", strategy="increment")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.TABLE, generator="generatorName")  
	//@TableGenerator(name="generatorName", allocationSize=5)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "account_name", unique = true, nullable = false)
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "role")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Column(name = "score")
	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	
	@Column(name = "lastLoginDate")
	public Date getLatestLoginDate() {
		return this.latestLoginDate;
	}
	public void setLatestLoginDate(Date latestLoginDate) {
		this.latestLoginDate = latestLoginDate;
	}
	
	@Column(name = "registerDate")
	public Date getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "account_image",
        joinColumns = 
        	@JoinColumn(name="account_image_fk"),
        inverseJoinColumns = 
        	@JoinColumn(name="file_descriptor_fk")
    )
	public FileDescriptor getImage() {
		return image;
	}
	public void setImage(FileDescriptor image) {
		this.image = image;
	}
	
	@Column(name = "first_name")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "sex")
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	@Column(name = "interests")
	public ArrayList<String> getInterests() {
		return this.interests;
	}
	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}
	
	

	



//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
//	public Set getPetses() {
//		return this.petses;
//	}
//
//	public void setPetses(Set petses) {
//		this.petses = petses;
//	}
	

	
	@Override
	public String toString() {
		return new ToStringCreator(this)

		.append("id", this.getId())
		
		.append("accountName", this.getAccountName())
		
		.append("new", this.isNew())
		
		.append("lastName", this.getLastName())

		.append("firstName", this.getFirstName())

		.append("address", this.address)

		.append("city", this.city)

		.append("telephone", this.telephone)
		
		.append("email", this.email)
		
		.append("score", this.score)
		
		.append("latestLoginDate", this.latestLoginDate)
		
		.append("role", this.role)
		
		.append("status", this.status)

		.toString();
	}
	
	/*
	 * Add more helper methods here...
	 */
	@Transient
	public boolean isNew() {
		return (this.id == null);
	}
	
	/**
	 * For more strict JPA
	 */
	@Transient
	public void setNew(boolean isNew) {
		;
	}
	@Transient
	public boolean getNew() {
		return (this.id == null);
	}

}
