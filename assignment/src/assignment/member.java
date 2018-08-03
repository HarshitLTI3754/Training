package assignment;

public class member {
	private String name;
	private book book;
	
	public member()
	{
		
	}
	public member(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public book getbook()
	{
		return book;
	}
	public void setbook(book book)
	{
		this.book=book;
	}
	public void issuedbook()
	{
		if(book!=null)
		{
			System.out.println(name + " issued " + book.gettitle());
		}
		else
		{
			System.out.println(name + " not issued any book ");
		}
	}
}
