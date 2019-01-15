package com.regex;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LangConstant {

	@Autowired
	private LanguageRegexProperties prop;

	public static List<String> langList;
	
	@PostConstruct
	private void setValues() {
		langList = prop.getList();
	}

}
