package stringHandling;

public class Example {
	//
	public static void display(String str) {
		
		char[] ch;	        
        int valPos=0;
        int numOfMatch=0;
        ch=str.toLowerCase().toCharArray();
        
         for(int j=0;j<ch.length;j++) {
	        if(ch[valPos]==ch[j])
	        	{
	        	numOfMatch++;
	        	System.out.println("numbers"+numOfMatch);
	        	}
        	}
        	System.out.println("repetitive"+ch[valPos]+numOfMatch);
        	     
	}

	public static void main (String args[]) {
		//aaabbbbaa-> a3b4a2
		Example.display("aaabbbbaa");
		
	}
		
		
	}


