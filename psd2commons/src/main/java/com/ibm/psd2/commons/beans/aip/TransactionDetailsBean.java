package com.ibm.psd2.commons.beans.aip;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.psd2.commons.beans.AmountBean;

@JsonInclude(value = Include.NON_EMPTY)
public class TransactionDetailsBean implements Serializable
{
	private String type;
	private String description;
	private Date posted;
	private Date completed;
	private AmountBean new_balance;
	private AmountBean value;
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public Date getPosted()
	{
		return posted;
	}
	public void setPosted(Date posted)
	{
		this.posted = posted;
	}
	public Date getCompleted()
	{
		return completed;
	}
	public void setCompleted(Date completed)
	{
		this.completed = completed;
	}
	public AmountBean getNew_balance()
	{
		return new_balance;
	}
	public void setNew_balance(AmountBean new_balance)
	{
		this.new_balance = new_balance;
	}
	public AmountBean getValue()
	{
		return value;
	}
	public void setValue(AmountBean value)
	{
		this.value = value;
	}
	
	public String toString()
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e)
		{
			e.printStackTrace();
		}
		return "";
	}

}
