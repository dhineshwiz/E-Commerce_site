package in.ec.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.ec.core.Utility;
import in.ec.model.User;
import in.ec.param.ListProductsParam;
import in.ec.param.ProductParam;
@RestController 
public class ListProductsController {

	private static final Logger	OUT	= LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = URLs.URL_TEST, method = RequestMethod.POST)
	public @ResponseBody EcomResponce test(@RequestBody(required = true) ListProductsParam testParam)
	{
		EcomResponce ecomResponce = new EcomResponce();
		
		ListProductsParam list =new ListProductsParam(); 
		try
		{
			System.out.println("********************** " + list.getElectronics());
			ecomResponce.setStatus("SUCCESS");
			//User user = new User("name", "password");
			ecomResponce.setResponse(list);
			
			//ecomResponce.setResponse(user);
		}
		catch (Exception e)
		{
			OUT.error("error", e);
		}
		return ecomResponce;
	}

	@RequestMapping(value = URLs.URL_PRODUCT_SAVE, method = RequestMethod.POST)
	public @ResponseBody EcomResponce saveProduct(@RequestBody(required = true) ProductParam param)
	{
		EcomResponce ecomResponce = new EcomResponce();
		
		try
		{
			MongoOperations mongoOperations = Utility.getMongo();
			mongoOperations.save(param.getProduct());
			
			ecomResponce.setStatus("SUCCESS");
			
		}
		catch (Exception e)
		{
			OUT.error("error", e);
		}
		return ecomResponce;
	}


}
