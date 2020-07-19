package com.syntax.class25;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}
}
class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening firefox browser");
	}
}
class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Openning chrome browser");
	}
}
class IE extends WebDriver{
	
	public void open() {
		System.out.println("Opening IE");
	}
}