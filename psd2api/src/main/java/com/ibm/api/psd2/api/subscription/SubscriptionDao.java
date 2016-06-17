package com.ibm.api.psd2.api.subscription;

import java.util.List;

import com.ibm.api.psd2.api.beans.subscription.SubscriptionInfoBean;

public interface SubscriptionDao
{
	public SubscriptionInfoBean getSubscriptionInfo(String username, String clientId, String accountId, String bankId) throws Exception;
	public List<SubscriptionInfoBean> getSubscriptionInfo(String username, String clientId, String bankId) throws Exception;
	public void createSubscriptionInfo(SubscriptionInfoBean s) throws Exception;


}
