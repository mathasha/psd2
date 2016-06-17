package com.ibm.api.psd2.api.beans.subscription;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionInfoBean implements Serializable
{

	private String username;
	private String accountId;
	private String bank_id;
	private String clientId;
	private ArrayList<ViewIdBean> viewIds;
	
	private List<TransactionRequestTypeBean> transaction_request_types;
	private List<TransactionLimitBean> limits;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public List<TransactionRequestTypeBean> getTransaction_request_types()
	{
		return transaction_request_types;
	}
	public void setTransaction_request_types(
			List<TransactionRequestTypeBean> transaction_request_types)
	{
		this.transaction_request_types = transaction_request_types;
	}
	public List<TransactionLimitBean> getLimits()
	{
		return limits;
	}
	public void setLimits(List<TransactionLimitBean> limits)
	{
		this.limits = limits;
	}
	
	public String getAccountId()
	{
		return accountId;
	}
	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}
	public String getBank_id()
	{
		return bank_id;
	}
	public void setBank_id(String bank_id)
	{
		this.bank_id = bank_id;
	}
	public ArrayList<ViewIdBean> getViewIds()
	{
		return viewIds;
	}

	public void setViewIds(ArrayList<ViewIdBean> viewIds)
	{
		this.viewIds = viewIds;
	}
	
	public void addViewIds(ViewIdBean viewId)
	{
		if (this.viewIds == null)
		{
			this.viewIds = new ArrayList<>();
		}
		
		this.viewIds.add(viewId);
	}
	
	public void addTransaction_request_types(TransactionRequestTypeBean b)
	{
		if (transaction_request_types == null)
		{
			transaction_request_types = new ArrayList<>();
		}
		transaction_request_types.add(b);
	}
	
	public void addLimits(TransactionLimitBean ab)
	{
		if (limits == null)
		{
			limits = new ArrayList<>();
		}
		
		limits.add(ab);
	}
	public String getClientId()
	{
		return clientId;
	}
	public void setClientId(String clientId)
	{
		this.clientId = clientId;
	}
	
	

}
