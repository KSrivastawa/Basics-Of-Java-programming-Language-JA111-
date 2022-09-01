package com.enums;

public enum EnumOf_Month {

	JAN,FEB,MAR,APR,MAY;
	
}



/*

---enum concept is introduced in java 1.5v

--every enum contant is implemented by using class concept.

--every enum constant is always "public static final".

--every enum constant represented an object of type enum.


--the above enum Month will converted internally as follows:


public final class Month extends Enum{

public static final JAN= new Month();
public static final FEB= new Month();
public static final MAR= new Month();
public static final APR= new Month();
public static final MAY= new Month();

}
*/
