package in.ec.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.ec.model.User;
import in.ec.param.TestParam;

@RestController
public class SampleDhineshController {
	private static final Logger	OUT	= LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = URLs.URL_DHI, method = RequestMethod.POST)
	public @ResponseBody EcomResponce test(@RequestBody(required = true) TestParam testParam)
	{
		EcomResponce ecomResponce = new EcomResponce();
		try
		{
			System.out.println("********************** " + testParam.getTest());
			ecomResponce.setStatus("SUCCESS");
			User user = new User("name", "password");
			System.out.println("HI THIS IS DHINESH");
			ecomResponce.setResponse(user);
		}
		catch (Exception e)
		{
			OUT.error("error", e);
		}
		return ecomResponce;
	}


}




