package iocDemo;

public class PostgreProductDal implements IProductDal {
	
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Product added to postgre sql database.");
	}
	
	public String getConnectionString() {
		return this.connectionString;
	}
	
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
}
