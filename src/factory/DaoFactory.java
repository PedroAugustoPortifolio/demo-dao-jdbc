package factory;

public class DaoFactory {
	
	DaoFactory() {
		
	}
	
	public ClientDao createClientDao() {
		return new ClientDao();
	}
	public ProductDao ProductDaoJDBC() {
		return new ProductDao();
	}
	

}
