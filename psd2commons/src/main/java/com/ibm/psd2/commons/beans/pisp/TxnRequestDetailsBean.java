package com.ibm.psd2.commons.beans.pisp;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.psd2.commons.beans.ChallengeBean;

@JsonInclude(value = Include.NON_EMPTY)
public class TxnRequestDetailsBean implements Serializable
{
	public static final String TXN_STATUS_INITIATED="INITIATED";
	public static final String TXN_STATUS_COMPLETED="COMPLETED";
	public static final String TXN_STATUS_PENDING="PENDING";
	public static final String TXN_STATUS_FAILED="FAILED";
	
	private String id;
	private String type;
	private TxnPartyBean from;
	private TxnRequestBean body;
	String transaction_ids;
	String status;
	Date start_date;
	Date end_date;
	private ChallengeBean challenge;
	private TxnChargeBean charge;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public TxnPartyBean getFrom()
	{
		return from;
	}
	public void setFrom(TxnPartyBean from)
	{
		this.from = from;
	}
	public TxnRequestBean getBody()
	{
		return body;
	}
	public void setBody(TxnRequestBean body)
	{
		this.body = body;
	}
	public String getTransaction_ids()
	{
		return transaction_ids;
	}
	public void setTransaction_ids(String transaction_ids)
	{
		this.transaction_ids = transaction_ids;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public Date getStart_date()
	{
		return start_date;
	}
	public void setStart_date(Date start_date)
	{
		this.start_date = start_date;
	}
	public Date getEnd_date()
	{
		return end_date;
	}
	public void setEnd_date(Date end_date)
	{
		this.end_date = end_date;
	}
	public ChallengeBean getChallenge()
	{
		return challenge;
	}
	public void setChallenge(ChallengeBean challenge)
	{
		this.challenge = challenge;
	}
	public TxnChargeBean getCharge()
	{
		return charge;
	}
	public void setCharge(TxnChargeBean charge)
	{
		this.charge = charge;
	}

	public String toString()
	{
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			return mapper.writeValueAsString(this);
		}
		catch (JsonProcessingException e)
		{
			e.printStackTrace();
		}
		return "";
	}
}
