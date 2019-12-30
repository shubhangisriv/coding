package exceptionhandling;

public class code4 {
	    
		private String fname;
		private String lname;
		public code4(String fname, String lname) {
			super();
			this.fname = fname;
			this.lname = lname;
			
		}
		
		
			@Override
		public String toString() {
			return "code4 [fname=" + fname + ", lname=" + lname + "]";
		}


			public void Verify() throws code4ex
			{
				if(fname==null || lname==null ||fname=="" ||lname=="")
				{
					throw new code4ex("code can't be null");
			}
				else System.out.println("successful");
			
		}
			public static void main(String args[])
			{
				code4 c=new code4("abc","xyz");
				code4 c1=new code4("","");
				
				try
				{
					c.Verify();
					c1.Verify();
				}
				catch(code4ex e)
				{
					System.out.println(e);
				}
				
			}
}
