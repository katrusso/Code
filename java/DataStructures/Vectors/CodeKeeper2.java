/*
	To run:
		javac CodeKeeper2.java
		java CodeKeeper2 "some arg 1" "another arg 2"

		(or without command line args)
*/

import java.util.*;

public class CodeKeeper2{
	Vector<String> list; //generics (< >) force the data structure to hold a particular data type and cause compile error if another type is added
	String codes[] = { "alpha", "lambda", "gamma", "delta", "zeta" };

	public CodeKeeper2(String[] userCodes){
		list = new Vector<String>();
		
		//load built-in codes
		for (int i = 0; i < codes.length; i++) {
			addCode(codes[i]);
		}

		//load user codes (from command-line args)
		for (int j = 0; j < userCodes.length; j++) {
			addCode(userCodes[j]);
		}

		//display all codes; Note this iterative type of for-loop: for (DataType aSingleUnitVariable : containerWithSequentialListOf[DataType]Objects)
		for (String code : list){
			System.out.println(code);
		}
	}

	private void addCode(String code) {
		if (!list.contains(code)){
			list.add(code);
		}
	}

	public static void main(String[] args) {
		CodeKeeper2 keeper = new CodeKeeper2(args);
	}
}