

class Person{
	private int id;
	private string name;
	private string mobile;
	private date bdate;
	public Person()
	{ 
	id=0;
	name="";
	mobile="";
	bdate=null;
	
	}
	public Person(int id,string nm,string mobile,date bdate){
		
		this.id=id;
		name=nm;
		this.mobile=mobile;
		this.bdate=bdate;
		
	}
	public void display()
	{
		System.out.println("id: "+this.id);
		System.out.println("name:"+this.name);
		System.out.println("mobile:"+this.mobile);
		System.out.println("bdate :"+this.bdate);
		
	}
}