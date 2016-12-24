package core_javaS8;

public class NegativeAgeException extends Exception{
	private int age;
	 
    public NegativeAgeException(int age){
        this.age = age;
    }
 
    public String toString(){
        return "Age cannot be negative" + " " +age ;
    }

}
