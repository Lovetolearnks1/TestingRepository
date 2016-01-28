import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class STest {

    	public static void main(String[] args) {
    	
    	List<HashMap<String, String>> msgContentList;
    	msgContentList = new ArrayList<HashMap<String, String>>();
		String message    = "message: {\"emails\":[{\"email\":\"I know you \"can\" do the work. Just get started!\"},{\"email\":\"How is the assignment coming along. I look forward to the update.\"},{\"email\":\"I like the progress you have made. Now I need you to see it through to the end.\"}], \"success\":1}";

		Pattern pattern = Pattern.compile("\\[(.*?)\\]");
		Matcher matcher = pattern.matcher(message);
		int i =0;
		if (matcher.find())
		{
		    //System.out.println(matcher.group(1));
			pattern = Pattern.compile("\\{\"email\":\"(.*?)\"\\}");
			matcher = pattern.matcher(matcher.group(1));
			while (matcher.find()) {
				//System.out.println(matcher.group(1));
				if (matcher.group(1)!=null && matcher.group(1) != "" &&
                            !matcher.group(1).equals("null") && matcher.group(1).trim().length() > 0) {
				
					System.out.println(matcher.group(1));
				}
			}
		}
		
		for (int j=0; j<i; j++) {  //v
        	
            	System.out.println("msgContentList " + msgContentList.get(j));
        }
        
	}
}
	
