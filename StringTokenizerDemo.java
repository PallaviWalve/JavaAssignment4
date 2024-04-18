package javaassignment4;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{

	

	public class StringTokenizer1 {

		public static void main(String[] args) {
			
			StringTokenizer st=new StringTokenizer("Hello World");//it consider the string as a token and split it and show

			while(st.hasMoreElements())
			{
				System.out.println(st.nextElement());
			}
			try {
			String token1=st.nextToken();
			System.out.println(token1);
			
			String token2=st.nextToken();
			System.out.println(token2);
			
			String token3=st.nextToken();//here shows the exception because there is no more tokens(Only two tokens are there)
			System.out.println(token3);
			}
			catch (Exception e) 
			{
				System.out.println("There are no additional tokens to show");
				System.out.println(e.getMessage());//shows null because there is nothing to show
				
			}
		}

	}

}
