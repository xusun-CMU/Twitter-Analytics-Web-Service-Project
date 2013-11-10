package edu.cmu.passion.util;

/**
 * The utility class for building JSON 
 * 
 * @author Sun
 *
 */


//*********This class actually, is an optional class. 
//The alternative way, which is more decent, is to employ JAXB. ************
public class JSONBuilder {

	
	private Object obj;		//the object passed In
	
	public JSONBuilder(Object obj) {
		this.obj = obj;
	}
	
	
	/**
	 * build the json string
	 * @param obj
	 * @return the JSON string
	 */
	public String toJSON (Object obj) {
		String jsonStr = "";
		//TODO: Implementation. If you like, please refer the my code in the Internet technologies assignment
		return jsonStr;
	}
	
	
	
	
}
