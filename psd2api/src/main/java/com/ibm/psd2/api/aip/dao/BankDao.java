package com.ibm.psd2.api.aip.dao;

import java.util.ArrayList;

import com.ibm.psd2.commons.beans.BankBean;

public interface BankDao
{
	public BankBean getBankDetails(String bankId) throws Exception;
	public ArrayList<BankBean> getBanks() throws Exception;
}
