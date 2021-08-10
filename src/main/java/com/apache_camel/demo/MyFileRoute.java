package com.apache_camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("{{my.app.source}}")
			.to("{{my.app.destination}}");
		
	}

}
