package com.ibm.psd2.commons.utils;

public interface Visitor
{
	public <T, U> T visit(U u);
}
