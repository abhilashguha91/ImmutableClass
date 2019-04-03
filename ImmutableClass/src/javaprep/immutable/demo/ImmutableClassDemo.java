package javaprep.immutable.demo;

public class ImmutableClassDemo {

	public static void main(String[] args) {

		ImmutableClass immutableClass = new ImmutableClass("John Wick", 7010);
		System.out.println(immutableClass.getId());
		System.out.println(immutableClass.getName());
		
		// this gives a compilation error.
		//immutableClass.id = 1010;
		
	}

}
