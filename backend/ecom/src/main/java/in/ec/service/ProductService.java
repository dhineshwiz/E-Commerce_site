package in.ec.service;

import in.ec.core.Utility;
import in.ec.param.ProductParam;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{

	public void saveProduct(ProductParam param)
	{
		MongoOperations mongoOperations = Utility.getMongo();
		mongoOperations.save(param.getProduct());
	}

}
