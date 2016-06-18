package com.ibm.psd2.commons.beans.pisp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ibm.psd2.commons.beans.AmountBean;

@JsonInclude(value = Include.NON_EMPTY)
public class TxnChargeBean implements Serializable
{

	/*
		  "charge":{
		    "summary":"Total charges for completed transaction",
		    "value":{
		      "currency":"EUR",
		      "amount":"0.010053"
		    }
		  }
	*/
	
	private String summary;
	private AmountBean value;
	
	public String getSummary()
	{
		return summary;
	}
	public void setSummary(String summary)
	{
		this.summary = summary;
	}
	public AmountBean getValue()
	{
		return value;
	}
	public void setValue(AmountBean value)
	{
		this.value = value;
	}
	
	
}
