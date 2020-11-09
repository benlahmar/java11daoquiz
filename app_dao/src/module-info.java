module app.dao {
	exports com.dao;
	requires app.module1;
	exports com.dao.implMemory;
}