package com.ibm.psd2.commons.utils;

import java.util.UUID;

public class UUIDGenerator
{
	public static String generateUUID()
	{
		return UUID.randomUUID().toString();
	}

}
