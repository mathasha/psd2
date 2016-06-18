package com.ibm.psd2.commons.beans.subscription;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ibm.psd2.commons.beans.AmountBean;

@JsonInclude(value = Include.NON_EMPTY)
public class TransactionLimitBean implements Serializable
{

	private TransactionRequestTypeBean transaction_request_type;
	private AmountBean amount;
	
	public TransactionRequestTypeBean getTransaction_request_type()
	{
		return transaction_request_type;
	}
	public void setTransaction_request_type(TransactionRequestTypeBean transaction_request_type)
	{
		this.transaction_request_type = transaction_request_type;
	}
	public AmountBean getAmount()
	{
		return amount;
	}
	public void setAmount(AmountBean amount)
	{
		this.amount = amount;
	}
	
	
}
