package stringHandling;

public class StringTest {

	public static void main(String[] args) {
		String strValue="stringstr";
		char[] charArray=null;
		int position=0;
		int charMatch=0;
		int counter=0;
		charArray= strValue.toCharArray();
		for(int j=0;j<charArray.length;j++) {
		
//temp comment	
		for(int i=0; i<charArray.length;i++ )
		{
			if(charArray[position]==charArray[i])
			{
				charMatch++;
			}
		}
		if(charMatch<2) {
			counter++;
				System.out.println(charArray[position]);
		}
		position++;
		charMatch=0;
		}
	}

}
