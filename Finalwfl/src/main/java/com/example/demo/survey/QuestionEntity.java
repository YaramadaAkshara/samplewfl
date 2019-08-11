package com.example.demo.survey;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
public class QuestionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  qid;
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuestionEntity [qid=" + qid + ", question=" + question + ", category=" + category + ", options="
				+ options + ", userRsponsesSet=" + userResponsesSet + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public Set<UserResponseEntity> getUserRsponsesSet() {
		return userResponsesSet;
	}

	public void setUserRsponsesSet(Set<UserResponseEntity> userRsponsesSet) {
		this.userResponsesSet = userResponsesSet;
	}

	String question;
	String category;
	
	List<String> options;
	
	@ManyToMany(cascade =CascadeType.ALL)
	Set<UserResponseEntity> userResponsesSet;
	
	
	
}
