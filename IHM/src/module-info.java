import com.service.Iservice;

module ihm.mymodule {
	
	
	requires app.module1;
	requires quizmodule.service;
	
	uses Iservice;
	
	
	
}