package com.qa.util;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {
	
	public String generateRandomAlphaNumeric(int length){
		  return RandomStringUtils.randomAlphanumeric(length);
		 }

}
