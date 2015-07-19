package in.ec.controller;

import in.ec.core.Utility;
import in.ec.param.ProductParam;
import in.ec.service.ProductService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController
{

	private static final Logger	OUT	= LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ProductService productService;

	@RequestMapping(value = URLs.URL_PRODUCT_SAVE, method = RequestMethod.POST)
	public @ResponseBody EcomResponce saveProduct(@RequestBody(required = true) ProductParam param)
	{
		EcomResponce ecomResponce = new EcomResponce();

		try
		{
			productService.saveProduct(param);

			ecomResponce.setStatus("SUCCESS");

		}
		catch (Exception e)
		{
			OUT.error("error", e);
		}
		return ecomResponce;
	}

}
