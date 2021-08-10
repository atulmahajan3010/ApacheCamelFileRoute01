package com.apache_camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("file:C:\\Training_Workspace\\input")
			.to("file:C:\\Training_Workspace\\output");
		
	}

}
