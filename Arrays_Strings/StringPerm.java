
public class StringPerm {
    
    public static boolean strPerm(String str, String str2) {
        
	int count = 0;
	int count2 = 0;
        int l1 = str.length();
	int l2 = str2.length();
	if (l1 != l2) {
	    return false;
	}
        
	for (int i = 0; i < str.length(); i ++) {
	    count  += (int) str.charAt(i);
            count2 += (int) str2.charAt(i);
	}
        
	if (count == count2) {
            return true;	
	}
	return false;
	


    }
    
    public static void main(String[] args) {
	boolean test1 = strPerm("adb","dba"); 
        boolean test2 = strPerm("caab","aaab");
	System.out.println(test1);
	
    
    }

}
