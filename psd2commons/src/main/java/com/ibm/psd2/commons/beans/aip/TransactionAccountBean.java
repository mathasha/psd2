package com.ibm.psd2.commons.beans.aip;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(value = Include.NON_EMPTY)
public class TransactionAccountBean implements Serializable
{
	String id;
	private ArrayList<BankAccountOwnerBean> holders;
	String number;
	String kind;
	String iban;
	String swift_bic;
	TransactionBankBean bank;
	
	public void addHolders(BankAccountOwnerBean b)
	{
		if (holders == null)
		{
			holders = new ArrayList<>();
		}
		holders.add(b);
	}
	
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public ArrayList<BankAccountOwnerBean> getHolders()
	{
		return holders;
	}

	public void setHolders(ArrayList<BankAccountOwnerBean> holders)
	{
		this.holders = holders;
	}

	public String getNumber()
	{
		return number;
	}



	public void setNumber(String number)
	{
		this.number = number;
	}



	public String getKind()
	{
		return kind;
	}



	public void setKind(String kind)
	{
		this.kind = kind;
	}



	public String getIban()
	{
		return iban;
	}



	public void setIban(String iban)
	{
		this.iban = iban;
	}



	public String getSwift_bic()
	{
		return swift_bic;
	}



	public void setSwift_bic(String swift_bic)
	{
		this.swift_bic = swift_bic;
	}



	public TransactionBankBean getBank()
	{
		return bank;
	}



	public void setBank(TransactionBankBean bank)
	{
		this.bank = bank;
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
