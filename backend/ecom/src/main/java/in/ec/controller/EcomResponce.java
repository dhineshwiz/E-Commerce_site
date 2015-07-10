package in.ec.controller;

import java.util.ArrayList;
import java.util.List;

public class EcomResponce
{
	private String			status;
	private String			errorCode;
	private String			errorMessage;
	private List<Object>	response	= new ArrayList<Object>();

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public List<Object> getResponse()
	{
		return response;
	}

	public void setResponse(Object responce)
	{
		this.response.add(responce);
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

}
