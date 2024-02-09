package com.ebrain;

public class GetterSetterobject {
	private Integer id;
	private String name;
	
	public Integer getid()
	{
		return id;
	}
	
	public void getid(Integer id)
	{
		this.id=id;
	}

	public String getname()
	{
		return name;
	}
	
	public void getname(String name)
	{
		this.name=name;
	}
	
	
		  public static void main(String[] args) {
		    GetterSetterobject myObj = new GetterSetterobject();
		    myObj.id = 222;  
		    System.out.println(myObj.id); 
		    myObj.name="peter";
		    System.out.println(myObj.name);
		  }
		}
