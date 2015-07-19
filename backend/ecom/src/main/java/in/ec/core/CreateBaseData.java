package in.ec.core;

import org.springframework.data.mongodb.core.MongoOperations;

import in.ec.model.Product;

public class CreateBaseData {
	
	public static void main(String[] args) {
		
		MongoOperations mongoOperation = Utility.getMongo();
		
		Product product = new Product();
		product.setName("p1");
		product.setDescription("p1 desc");
		
		mongoOperation.save(product);
	}

}
