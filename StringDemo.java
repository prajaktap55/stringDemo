package stringDemo;

public class StringDemo {
	
	    public static void main(String[] args) {

	        String s1 = "WELCOME";
	        String s2 = "WELCOME";//this string literal store on Scp(String constant pool)
	       String s3=new String("Hello...");//s3 store on heap area
	       
	        System.out.println(s1+" s1 hashcode =" +s1.hashCode());
	        System.out.println(s2+" s2 hashcode =" +s2.hashCode());
	        System.out.println(s3+" s3 hashcode =" +s3.hashCode());
	       
	        
	        //"==" operator check the ref.equalty(address)
	        System.out.println(s1 == s2);//true
	        System.out.println(s1==s3);//false
          
	        //equals() method check the content equality of object
	        System.out.println(s1.equals(s2));//true
	        System.out.println(s1.equals(s3));//false

	        System.out.println(">>>>>after concatination<<<<<");

	        //here s2 will create string "WELCOMEHello" at new address & s2 point to new address
	        s2 = s2 + "Hello";
	        System.out.println(s1);
	        System.out.println(s2);
	        System.out.println("hashcode of s2 after concate "+s2.hashCode());
	        System.out.println(s1 == s2);//false

	        s2 = s2 + "How r u";

	        System.out.println(s2);
	    }
}
//WELCOME s1 hashcode =1951082306
//WELCOME s2 hashcode =1951082306
//Hello... s3 hashcode =-728075140
//true
//false
//true
//false
//>>>>>after concatination<<<<<
//WELCOME
//WELCOMEHello
//hashcode of s2 after concate -2074395984
//false
//WELCOMEHelloHow r u



