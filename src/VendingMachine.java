import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class VendingMachine {
	
	private int dispensers;
	private Dispenser[] dispensersArray;
	static boolean debug = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			Map<String,Object> stock = mapper.readValue(new File("stock.json"), Map.class);
			 for (String key : stock.keySet())  {
				System.out.println(stock.get(key));
				
			}
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
