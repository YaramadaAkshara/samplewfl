package com.example.demo.survey;

import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;




@Entity
public class UserResponseEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userResponseid;
	
	@ManyToMany(mappedBy="userResponsesSet")
	Set<QuestionEntity> questionEntitySet;
	
	Map<String,Integer> selectedOptions;
	
	@OneToOne(mappedBy ="ur")
	UserEntity user;
	

	public Long getUserResponseid() {
		return userResponseid;
	}

	public void setUserResponseid(Long userResponseid) {
		this.userResponseid = userResponseid;
	}

	public Set<QuestionEntity> getQuestionEntitySet() {
		return questionEntitySet;
	}

	public void setQuestionEntitySet(Set<QuestionEntity> questionEntitySet) {
		this.questionEntitySet = questionEntitySet;
	}

	public Map<String, Integer> getSelectedOptions() {
		return selectedOptions;
	}

	public void setSelectedOptions(Map<String, Integer> selectedOptions) {
		this.selectedOptions = selectedOptions;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	

	@Override
	public String toString() {
		return "UserResponseEntity [userResponseid=" + userResponseid + ", questionEntitySet=" + questionEntitySet
				+ ", selectedOptions=" + selectedOptions + ", user=" + user + "]";
	}
	
	
	
	
	
	
	
}
