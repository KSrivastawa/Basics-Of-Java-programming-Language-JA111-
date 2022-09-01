b) What is the difference between equals method and == operator in java? And what will be the output of the
  following code snippets and giving proper explanation.
  
Ans:

	=> Equals method:
	  .equal() is a method that compares the actual content of the object.
	
	=> == Operator:
	  == is an operator that compares the memory or reference location of an object in the heap.
  
  Difference between == and .equals method in java:-
  
  1. == Operator:
  	-> == is considered an operator in java.
  	-> It is majorly used to compare the reference values and objects.
  	-> We can use the == operator with objects and primitives.
  	-> == operator cannot be overridden.
  	
  2. Equals Method:
  	-> Equals() is considered as a method in java.
  	-> It is used to compare the actual content of the object.
  	-> We cannot use the equals method with primitives.
  	-> Equals() method can be overridden.
  	
  	
  *Code Snippets:
  
  Code snippet 1 >  true
  
  Code snippet 2 >  true
  
  Code snippet 3 >  true
  
  explanation:
  Here, we create two objects, namely s1 and s2.
  -Both s1 and s2 refer to same objects.
  - Using equals, the result is true because it's only comparing the values in s1 and s2.
  
    
  
