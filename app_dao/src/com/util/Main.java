/**
 * 
 */
package com.util;

import java.util.ArrayList;
import java.util.List;

import com.dao.Idao;
import com.dao.implMemory.QuizDao;
import com.moi.Question;
import com.moi.Quiz;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Quiz> quizz=new ArrayList<>();
		Idao d=new QuizDao(quizz);
		Quiz q=new Quiz();
		q.setId(1);
		q.setTitle("java 11");
		
		d.addquiz(q);
		Question qst=new Question();
		qst.setIdq(1);qst.setQuestion("what module?");
		d.AddQuestion2Quiz(1, qst);
		
		System.out.println(q.toString());
		
		

	}

}
