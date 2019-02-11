import java.util.HashMap;


public class StringPerm {
    
    public static boolean strPerm(String str, String str2) {
        
	int count = 0;
	int count2 = 0;
        int l1 = str.length();
	int l2 = str2.length();
	
	HashMap<Character,Integer> charCountsStr = new HashMap<Character,Integer>();
	HashMap<Character,Integer> charCountsStr2 = new HashMap<Character,Integer>();
	
	if (l1 != l2) {
	    return false;
	}
        
	for (int i = 0; i < str.length(); i++) {
	    Integer charStr1 = charCountsStr.get((Character) str.charAt(i));
	    Integer charStr2 = charCountsStr2.get((Character) str2.charAt(i));
            
	    if (charStr1 == null) {
	        charStr1 = 0;
	    } 
	    
	    if (charStr2 == null) {
	        charStr2 = 0;
	    }
            
	    Character c1     = str.charAt(i);
            Character c2     = str2.charAt(i);

	    charCountsStr.put(c1, charStr1+1 );
            charCountsStr2.put(c2, charStr2+1 );
	}
	return charCountsStr.equals(charCountsStr2);
          
	


    }
    
    public static void main(String[] args) {
	boolean test1 = strPerm("aga","eac"); //false
        boolean test2 = strPerm("abc","bac"); //true
        System.out.println(test2); //true
	System.out.println(test1); //false
    
    }

}
