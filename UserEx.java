public class UserEx{
   public static void main(String args[]){
   
   	System.out.println("This is user defined Exception");
  	try{
      	 throw new MyException("my exception");
   
 	 }
 	catch(MyException e){
    		System.out.println(e) ;
	 }
}
}
class MyException extends Exception{

   MyException(String b) {
     System.out.println(b);
   }
 
}

