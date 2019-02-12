// First attempt 
// In place algorithm

import java.util.Stack;
public class StringCodeReplace {
    
    public static void stringReplace(char[] str, int length) {
       int spaceCount = 0;
       
       for (int i = 0; i < length; i++) {
           
	         if (str[i] == ' ') {
               spaceCount++;

           }
       }
       for (int f = length-1; f >= 0; f--) {
		             if (spaceCount == 0) {
                     break;  
                 }
                 if (str[f] == ' ') {
                     
                     str[f+2*spaceCount-2] = '%';
                     str[f+2*spaceCount-1] = '2';
                     str[f+2*spaceCount] = '0';
                     spaceCount--;
                     continue;
                 }  
                 str[f+2*spaceCount] = str[f];
		   }
	 }

       


    public static void main(String[] args) {
        char[] test = {'M',
                       'r',
                       ' ',
                       'J',
                       'o',
                       'h',
                       'n',
                       ' ',
                       'S',
                       'm',
                       'i',
                       't',
                       'h',
                       ' ',
                       't',
                       ' ',
                       ' ',
                       ' ',
                       ' ',
                       ' ',
                       ' ',
                       };
        stringReplace(test,15);
	System.out.println(test);
    }

}
