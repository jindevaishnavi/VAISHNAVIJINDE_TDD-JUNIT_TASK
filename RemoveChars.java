package ToolsQA.TDD_TASK;

public class RemoveChars {

	public String remove(String string) {
		String result = string;
		int stringLength = string.length();
		char firstChar;

		if(stringLength == 1)
		{
			firstChar = string.charAt(0);
			if(firstChar == 'A')
				result = "";
		}
		if(stringLength >=2)
		{	firstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			if(firstChar== 'A'&& secondChar =='A')
				result = string.substring(2);
			else if(firstChar == 'A')
				result = string.substring(1);
			else if(secondChar == 'A')
				result = string.substring(0,1) + string.substring(2);
			
				
		}
		
	return result;
	}
}
