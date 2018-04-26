package core;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {

	public static void main(String[] args) {
	Map<Employee1,String> map=new HashMap();
	Employee1 e1=new Employee1("chandu",10);
	
	map.put(e1,"one");
	
	System.out.println(map.get(e1));
	
	//e1.setName("two");	
	System.out.println(map.get(e1));	
	}
}


class Employee1{
	
	public Employee1(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	private final int id;
	private final String name;	

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}