/**
 * 
 */
package com.dao.implMemory;

import java.util.ArrayList;
import java.util.List;

import com.dao.Idao;
import com.moi.Question;
import com.moi.Quiz;
import com.moi.QuizConfig;
import com.moi.Reponse;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class QuizDao implements Idao{

	static List<Quiz> quizs;
	
	
	
	public QuizDao() {
		super();
		quizs=new ArrayList<>();
	}

	public QuizDao(List<Quiz> quizs) {
		super();
		this.quizs = quizs;
	}

	public List<Quiz> getQuizs() {
		return quizs;
	}

	public void setQuizs(List<Quiz> quizs) {
		this.quizs = quizs;
	}

	@Override
	public void addquiz(Quiz q) {
		quizs.add(q);
		
	}

	@Override
	public void AddQuestion2Quiz(int idquiz, Question q) {
		
		for (Quiz quiz : quizs) {
			if(quiz.getId()==idquiz)
				quiz.getQuestions().add(q);
		}
		
	}

	@Override
	public void AddReponse2Question(int idq, Reponse r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quizconfig(int idq, QuizConfig config) {
		// TODO Auto-generated method stub
		
	}

}
