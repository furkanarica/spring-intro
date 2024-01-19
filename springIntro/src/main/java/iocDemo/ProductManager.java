package iocDemo;

public class ProductManager implements IProductService {
	
	IProductDal productDal;
	
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}
	
	@Override
	public void add() {
		productDal.add();
	}
	
}
