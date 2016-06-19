package com.ibm.psd2.commons.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ibm.psd2.commons.beans.subscription.SubscriptionInfoBean;

public abstract class APIController
{
	private static final Logger logger = LogManager.getLogger(APIController.class);

	protected boolean validateSubscription(SubscriptionInfoBean s)
	{
		if (s!= null && SubscriptionInfoBean.STATUS_ACTIVE.equals(s.getStatus()))
		{
			return true;
		}

		return false;
	}

	protected boolean validateSubscription(SubscriptionInfoBean s, String viewId)
	{
		logger.info("Method Arguments = " + s);
		logger.info("Method Arguments = " + viewId);
		if (s != null && SubscriptionInfoBean.STATUS_ACTIVE.equals(s.getStatus()) && s.getViewIds() != null
				&& !s.getViewIds().isEmpty() && s.getViewIds().contains(viewId))
		{
			return true;
		}

		return false;
	}

}
