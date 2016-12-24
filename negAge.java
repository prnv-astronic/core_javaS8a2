package core_javaS8;
import java.io.BufferedReader;// importing lib
import java.io.IOException;
import java.io.InputStreamReader;
public class negAge {

	static int age=0;
	public static void main(String[] args) throws IOException, NegativeAgeException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Age");
		
		try{
		age=Integer.parseInt(br.readLine());
		if(age<0)
		{
			throw new NegativeAgeException(age);
		}
		else
		{
			System.out.println("Valid Age Input");
		}
		}
		catch(NegativeAgeException h)
		{
			System.out.println(h);
			System.out.println("Please Enter Valid Age Input");
		}
	}

}
