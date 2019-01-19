package com.regex;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:languageregex.properties")
@ConfigurationProperties(prefix = "regex")
@Component
public class LanguageRegexProperties {
	
	
	private List<String> getName;
	private String getDescription;
	public List<String> getGetName() {
		return getName;
	}
	public void setGetName(List<String> getName) {
		this.getName = getName;
	}
	public String getGetDescription() {
		return getDescription;
	}
	public void setGetDescription(String getDescription) {
		this.getDescription = getDescription;
	}
	
	
}
