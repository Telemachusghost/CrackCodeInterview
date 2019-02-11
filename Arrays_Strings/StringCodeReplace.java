// First attempt 
// In place algorithm
// No external data structures used at all
// 

public class StringCodeReplace {
    
    public static void stringReplace(char[] str, int length) {
 
       for (int i = 0; i < length; i++) {
           
	   if (str[i] == ' ') {
	         for (int f = length-1; f > i; f--) {
		     str[f+2] = str[f];
		 }
                 str[i] = '%';
		 str[i+1] = '2';
		 str[i+2] = '0';
	   }

       
       }
    }

    public static void main(String[] args) {
        char[] test = {'a', ' ', 'b', ' ', ' '};
        stringReplace(test,3);
	System.out.println(test);
    }

}
