package javaprep.immutable.demo;

// Rules to create an immutable class
// 1. the class should be final, so that it cannot be extended
// 2. All the variables in the class should be made final so that their values cannot be changed once created
// 3. A parameterized constructor should be allowed to initialize these values
// 4. there should only be getters and no setters so that we don't get any issues while setting their values

public class ImmutableClass {
	
	final String name;
	final int id;
	
	public ImmutableClass(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	

}
