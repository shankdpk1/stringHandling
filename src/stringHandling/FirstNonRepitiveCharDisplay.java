package stringHandling;

public class FirstNonRepitiveCharDisplay {

	public static void main(String[] args) {
	        String s1="SapientGlobalMarkets";
	        char[] ch;	        
	        
	        int valPos=0;
	        int numOfMatch=0;
	        ch=s1.toLowerCase().toCharArray();
	        
	        for(int i=0;i<ch.length;i++)
	        {
	        	
	        	for(int j=0;j<ch.length;j++) {		        
		        if(ch[valPos]==ch[j])
		        	{
		        	numOfMatch++;
		        	//System.out.println(numOfMatch);
		        	}
	        	}
	        	
	        	if(numOfMatch<2)
	        	{
	        		System.out.println("1st non-repetive val is : " + ch[valPos]);
	        		break;
	        	} 
	        	valPos++;
	        	numOfMatch=0;
		     } 
	   	} 
}
