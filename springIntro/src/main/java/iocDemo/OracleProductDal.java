package iocDemo;

public class OracleProductDal implements IProductDal {
	
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("Product added to oracle database.");
	}
	
	public String getConnectionString() {
		return this.connectionString;
	}
	
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
