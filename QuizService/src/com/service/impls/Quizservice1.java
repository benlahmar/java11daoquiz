/**
 * 
 */
package com.service.impls;

import com.moi.Question;
import com.moi.Quiz;
import com.moi.QuizConfig;
import com.moi.Reponse;
import com.service.Iservice;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Quizservice1 implements Iservice{

	@Override
	public void addquiz(Quiz q) {
		System.out.println("hi..............");
		
	}

	@Override
	public void AddQuestion2Quiz(int idquiz, Question q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddReponse2Question(int idq, Reponse r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quizconfig(int idq, QuizConfig config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quiz findQuizById(int idquiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question findQuestionById(int idquiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void passerquiz(int id, int idu) {
		// TODO Auto-generated method stub
		
	}

}
