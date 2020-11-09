import com.service.Iservice;
import com.service.impls.Quizservice1;

module quizmodule.service {
	
	exports com.service;
	exports com.service.impls;
	requires transitive app.module1;
	requires app.dao;
	
	
	provides Iservice with Quizservice1;
	
	
	
}