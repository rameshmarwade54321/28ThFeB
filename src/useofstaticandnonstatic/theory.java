package useofstaticandnonstatic;

public class theory 
{
//	static members are connected to the class, whereas Non-static members are linked to specific class instances. I
//	1: Associated with
//	Static: Static members (variables and methods) are associated with the class itself rather than with individual instances/objects.
//	Non-Static: Non-static members are specific to each instance/object of a class, as they are tied to objects created from the class.
//	2: Memory Allocation (*)
//	Static: Static members are allocated memory only once, at the time of class loading. They are shared among all instances of the class.
//	Non-Static: Non-static members have memory allocated separately for each instance of the class. Each object has its own copy of non-static members.
//	3: Initialization
//	Static: Static members are initialized when the class is loaded into memory, typically during program startup. Initialization happens only once.
//	Non-Static: Non-static members are initialized when each instance of the class is created, usually using the new keyword. Initialization occurs separately for each object.
//	4: Usage
//	Static: Static members are commonly used for utility methods, constants, or variables that are not specific to individual instances. For example, a Math class containing mathematical functions.
//	Non-Static: Non-static members are used for instance-specific behaviour, as they hold data specific to each object. For example, instance variables that store unique values for each object.
//	5: Accessing
//	Static: Static members can be accessed directly using the class name followed by the member name (e.g., ClassName.memberName).
//	Non-Static: Non-static members are accessed using an object reference followed by the member name (e.g., objectReference.memberName).
}
