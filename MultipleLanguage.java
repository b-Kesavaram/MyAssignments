package week3;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MultipleLanguage implements Language, TestingTool {

	public void java(String java) {
		// TODO Auto-generated method stub
		
		System.out.println("Programming Language" + java);
		
	}

	public void javaScript(String javaScript) {
		// TODO Auto-generated method stub
		
		System.out.println("Script Language"+ javaScript);
		
	}

	public void ruby(String ruby) {
		// TODO Auto-generated method stub
		System.out.println("Ruby Language" + ruby);
		
	}
	
	public void Selenium(String Selenium) {
		// TODO Auto-generated method stub
		
		System.out.println("Interface Method" + Selenium);
	}
	
	
	public void python()
	{
		System.out.println("Advanced Language");
	}

}
