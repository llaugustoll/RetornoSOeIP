package controller;

public class ProcessosController {
	public ProcessosController() {
		super();
	}
	
	public String os() {
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String v = System.getProperty("os.version");
		
		return os +" "+ v + " " + arch; 
	}
}
