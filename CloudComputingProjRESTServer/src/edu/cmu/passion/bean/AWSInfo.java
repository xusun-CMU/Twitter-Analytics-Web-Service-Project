package edu.cmu.passion.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Java Bean storing the AWS Team Gereral information
 * @author Sun
 *
 */
public class AWSInfo {
	
	private final String teamID = "passion";									//The team ID
	private final String AWSAccountID = "3551-9665-5708";						//The AWS Account ID
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	
	
	
	
	public String getTeamID() {
		return teamID;
	}
	public String getAWSAccountID() {
		return AWSAccountID;
	}
	public String getDate() {
		return dateFormat.format(cal.getTime());
	}
	
	
	//TODO: Generate getters and setters
	
	
	
}
