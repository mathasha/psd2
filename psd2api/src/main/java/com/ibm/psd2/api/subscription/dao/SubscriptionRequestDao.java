package com.ibm.psd2.api.subscription.dao;

import com.ibm.psd2.commons.beans.subscription.SubscriptionRequestBean;

public interface SubscriptionRequestDao
{
	public SubscriptionRequestBean getSubscriptionRequestById(String id) throws Exception;
	public SubscriptionRequestBean createSubscriptionRequest(SubscriptionRequestBean s) throws Exception;
	public long updateSubscriptionRequestStatus(String id, String status) throws Exception;

}
