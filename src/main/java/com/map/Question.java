package com.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Qid;
	private String Ques;
	
	@OneToOne //Concept of Forgien Key
	@JoinColumn(name = "Ans_ID")//Rename the name of joint column 
	private Answer Ans;
	public int getQid() {
		return Qid;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String ques, Answer ans) {
		super();
		Qid = qid;
		Ques = ques;
		Ans = ans;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQues() {
		return Ques;
	}
	public void setQues(String ques) {
		Ques = ques;
	}
	public Answer getAns() {
		return Ans;
	}
	public void setAns(Answer ans) {
		Ans = ans;
	}
	

}
