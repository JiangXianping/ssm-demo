package com.jiang.generator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generator {
	
	@Test
	 public void GeneratorFile() throws Exception{
		 List<String> warnings = new ArrayList<String>();
	     boolean overwrite = false;
	     ConfigurationParser cp = new ConfigurationParser(warnings);
	     Configuration config = cp.parseConfiguration(Generator.class.getClassLoader().getResourceAsStream("generatorConfig.xml"));
	     DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	     MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
	     myBatisGenerator.generate(null);
	 }
}
