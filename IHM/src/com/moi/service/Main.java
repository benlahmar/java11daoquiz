/**
 * 
 */
package com.moi.service;

import com.service.impls.Quizservice2;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ihm mm=new Ihm();
		mm.setEm(new Quizservice2());
		mm.abc();

	}

}
