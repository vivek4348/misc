public class Person  implements Cloneable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person() {
		
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	
	public String toString() {
		
		return "Person [name=" + name + "]";
	}
	
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
}
