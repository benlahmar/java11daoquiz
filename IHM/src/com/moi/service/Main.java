/**
 * 
 */
package com.moi.service;

import java.util.Optional;
import java.util.ServiceLoader;

import com.service.Iservice;
import com.service.impls.Quizservice1;
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
		
		ServiceLoader<Iservice> service= ServiceLoader.load(Iservice.class);
		
		service.forEach(x-> System.out.println(x.getClass().getName()));
		
		Optional<Iservice> ss = service.findFirst();
		Iservice imp = null;
		
		
		if(ss.isPresent())
			imp=ss.get();
		
		Ihm mm=new Ihm();
		mm.setEm(imp);
		mm.abc();

	}

}
