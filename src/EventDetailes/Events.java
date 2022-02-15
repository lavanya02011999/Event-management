package EventDetailes;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Events {
	
	public static LinkedHashMap<String, Integer> venue = new LinkedHashMap<String, Integer>() {{ 
        put("RR Hotel", 1000000); 
        put("Nataraj Bhavan", 2000000); 
        put("Yashaswini Hotel", 5000000); 
    }};
    
    public static LinkedHashMap<String, Integer> getvenue() {
    	return venue;
    }
    
    public static void printvenue() {
    	for( Entry<String, Integer> entry : getvenue().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> photographer = new LinkedHashMap<String, Integer>() {{ 
        put("Mahesh", 15000); 
        put("Bhuvan", 30000); 
        put("Prathap", 10000); 
    }};
    
    public static LinkedHashMap<String, Integer> getphotographer() {
    	return photographer;
    }
	
    public static void printphotographer() {
    	for( Entry<String, Integer> entry : getphotographer().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> cateringMarriage = new LinkedHashMap<String, Integer>() {{ 
        put("North Indian", 300000); 
        put("South Indian", 5000000); 
        put("Chinese", 20000000); 
    }};
    
    public static LinkedHashMap<String, Integer> getcateringMarriage() {
    	return cateringMarriage;
    }
    
    public static void printCateringMarriage() {
    	for( Entry<String, Integer> entry : getcateringMarriage().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> cateringBirthday = new LinkedHashMap<String, Integer>() {{ 
        put("North Indian",30000 ); 
        put("South Indian", 500000); 
        put("Chinese", 300000); 
    }};
    
    public static LinkedHashMap<String, Integer> getcateringBirthday() {
    	return cateringBirthday;
    }
    
    public static void printcateringBirthday() {
    	for( Entry<String, Integer> entry : getcateringBirthday().entrySet() ){
		    System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
    }
	
}
