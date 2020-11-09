/**
 * 
 */
package com.service;


import com.moi.Question;
import com.moi.Quiz;
import com.moi.QuizConfig;
import com.moi.Reponse;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public interface Iservice {

	public void addquiz(Quiz q);
	public void AddQuestion2Quiz(int idquiz, Question q);
	public void AddReponse2Question(int idq, Reponse r);
	public void quizconfig(int idq, QuizConfig config);
	
	public Quiz findQuizById(int idquiz);
	public Question findQuestionById(int idquiz);
	
	
	
	public void passerquiz(int id, int idu);
	
}
