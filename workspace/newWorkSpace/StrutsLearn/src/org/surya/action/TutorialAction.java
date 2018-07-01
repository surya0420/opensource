package org.surya.action;

public class TutorialAction {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute(){
		
		System.out.println("hello surya through struts");
		return "success";
		
	}
	
	

}
