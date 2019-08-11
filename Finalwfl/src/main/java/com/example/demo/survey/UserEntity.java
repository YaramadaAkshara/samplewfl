package com.example.demo.survey;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class UserEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="uid")
	private int id;
	@JsonIgnore
	private String iss;
	@JsonIgnore
	private String azp;
	@JsonIgnore
	private String aud;
	@JsonIgnore
	private String sub;
	@Column(name="uemail")
	public String email;
	@Column(name="is_verified")
	private boolean email_verified;
	@JsonIgnore
	private String at_hash;
	@Column(name="uname")
	private String name;
	@Column(name="image_url")
	private String picture;
	@JsonIgnore
	private String given_name;
	@JsonIgnore
	private String family_name;
	@JsonIgnore
	private String locale;
	@JsonIgnore
	private long iat;
	@JsonIgnore
	private long exp;
	@JsonIgnore
	private String jti;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "u_id", referencedColumnName = "userResponseid")
	UserResponseEntity ur;
	

	@ElementCollection
	@MapKeyColumn(name="uname")
	@Column(name="value")
	Map<String,Boolean> categoryAcess;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIss() {
		return iss;
	}
	public void setIss(String iss) {
		this.iss = iss;
	}
	public String getAzp() {
		return azp;
	}
	public void setAzp(String azp) {
		this.azp = azp;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEmail_verified() {
		return email_verified;
	}
	public void setEmail_verified(boolean email_verified) {
		this.email_verified = email_verified;
	}
	public String getAt_hash() {
		return at_hash;
	}
	public void setAt_hash(String at_hash) {
		this.at_hash = at_hash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public long getIat() {
		return iat;
	}
	public void setIat(long iat) {
		this.iat = iat;
	}
	public long getExp() {
		return exp;
	}
	public void setExp(long exp) {
		this.exp = exp;
	}
	public String getJti() {
		return jti;
	}
	public void setJti(String jti) {
		this.jti = jti;
	}
	public UserResponseEntity getUr() {
		return ur;
	}
	public void setUr(UserResponseEntity ur) {
		this.ur = ur;
	}
	
	public Map<String, Boolean> getCategoryAcess() {
		return categoryAcess;
	}
	public void setCategoryAcess(Map<String, Boolean> categoryAcess) {
		this.categoryAcess = categoryAcess;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", iss=" + iss + ", azp=" + azp + ", aud=" + aud + ", sub=" + sub + ", email="
				+ email + ", email_verified=" + email_verified + ", at_hash=" + at_hash + ", name=" + name
				+ ", picture=" + picture + ", given_name=" + given_name + ", family_name=" + family_name + ", locale="
				+ locale + ", iat=" + iat + ", exp=" + exp + ", jti=" + jti + ", ur=" + ur 
				+ ", categoryAcess=" + categoryAcess + "]";
	}
	
	
	
	
	
	
	
	
	
}
