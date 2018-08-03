package lti.reflect;

import java.security.BasicPermission;

public class customer {
	
	private String name;
	
	public customer()
	{
		
	}
	
	
	public customer(String name) {
		super();
		this.name = name;
	}


	private void print()
{
		SecurityManager mgr= new SecurityManager();
		mgr.checkPermission(new BasicPermission("stay away") {});
		System.out.println("Name :: "+name);
		}


	@Override
	public String toString() {
		return "Name :: "+name;
	}
	
	
}
