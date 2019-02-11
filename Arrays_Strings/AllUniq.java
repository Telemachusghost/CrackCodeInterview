public class AllUniq {
    
   public static boolean uniqStr(String str) {
       final int SIZE = ('z' - 'a');
       boolean arr[];
       arr = new boolean[SIZE];
       int val;
       for (int i = 0; i < str.length(); i++) {
         val = (int) (str.charAt(i) - 'a');
	 if (arr[val] == true) {
	     return false;
	 } else {
	     arr[val] = true;
	 }
       }
       return true;
   }
    
    public static void main(String[] args) {
        boolean t1 = uniqStr("derick"); // True
        boolean t2 = uniqStr("shanin"); // False
        if (t1 && !t2) {
	    System.out.println("Success");
	}
    }
}
