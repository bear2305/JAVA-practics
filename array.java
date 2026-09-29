//arrays in java




public class arrayxe{
    public static void main(String[] args){
        // Method 1: Declare and allocate memory with a fixed size (defaults to 0)
       int[] integer = new int[5];
         integer[0] = 21;
         integer[1] = 3;
         integer[2] = 22;
         integer[3] = 43;
         integer[4] = 11;


       // Method 2: Declare and initialize with values immediately
     String[] strind = {"h","e","l","l","o"," ", "world"," ","JAVA"};
     System.out.println(strind[6]);
     System.out.println("length is :  " + strind.length);

     for (int i=0; i!=5;i++){
        System.out.println(integer[i]);
    }
     //end of inner
    }
}
