package com.ibm.psd2.api.common.integration;

import java.util.Properties;

public interface PropertiesDao
{
	public Properties getKafkaProperties() throws Exception;
}
