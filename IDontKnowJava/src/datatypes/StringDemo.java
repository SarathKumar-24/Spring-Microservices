package datatypes;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("Deloitte"); //outside pool
		
		String str1="Deloitte"; //in string pool //first time
		
		String str2="Deloitte";
		// == matches the reference in the string objects
		System.out.println(str==str1);
		// equals() matches the values of string objects
		System.out.println(str.equals(str1));
		System.out.println(str1==str2); //true
		System.out.println(str1.equals(str2));
		
		//String is immutable
		str1="Simant"; //inside pool
		
		System.out.println(str1==str2); //false
		System.out.println(str==str2); //false
		
		String str3=new String("Deloitte").intern(); // outside pool
		//String str3="Deloitte1";
		System.out.println(str2==str3); 
		
		// immutablitiy
		String str4="Simant ";
		System.out.println(str4.hashCode());
		//str4+=" Setu";
		//str4=str4+" Setu";
		//str4.concat(" Setu");
		str4=str4.concat(" Setu");
		System.out.println(str4.hashCode());
		System.out.println(str4);
		
		
	}

}
