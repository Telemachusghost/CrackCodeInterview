/*
This is my first attempt
*/

public class StringCompress {

    public static String compressString(String str) {
    	String compressedString = "";
    	String tempString = str;
    	char   tempChar;
    	int    letterCount = 0;  
    	int    i = 1; // Used for iterating through tempstring
        
        // I used a temporary string so that I could manipulate it without messing with the orginal string
        while (tempString.length() > 1) {
        	tempChar = tempString.charAt(0);
        	letterCount++;
        	tempString = tempString.substring(i);
          
        	while (!tempString.isEmpty() && tempString.charAt(0) == tempChar) {
        		letterCount++;
        		
        		if (tempString.length() > 1) {
        		    tempString = tempString.substring(i);
                } else {
                	tempString = "";
                }      	
            }
        	
        	compressedString = compressedString + tempChar + letterCount;
        	letterCount = 0;
             
        }

        // If compressedString's length is less than orginal string return that if not return orginal string 
        if (compressedString.length() < str.length()) {
            return compressedString;
        } else {
        	return str;
        }
        
    }

	public static void main(String[] args) {
		//System.out.println(compressString("abc")); // This is not shorter will return abc
		System.out.println(compressString("aaabbbccc")); // a3b3c3
		System.out.println(compressString("aaabbbcccdddddd")); // a3b3c3d6
	}

}