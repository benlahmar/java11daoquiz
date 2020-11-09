/**
 * 
 */
package com.moi.service;

import com.moi.Quiz;
import com.service.Iservice;
import com.service.impls.Quizservice1;
import com.service.impls.Quizservice2;



/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Ihm {

	/**
	 * @param args
	 */
	 Iservice em ;
	
	
	
	public void abc()
	{
		Quiz q=new Quiz();
		q.setId(1);q.setTitle("java 11 quiz");
		em.addquiz(q);
		
	}

	

	public void setEm(Iservice em) {
		this.em = em;
	}



	public Ihm() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
