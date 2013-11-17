package edu.cmu.passion.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 * The REST Server Resource Class for handling the response of "Number of tweets"
 * @author Sun
 *
 */

@Path("q3")	
@Produces(MediaType.TEXT_PLAIN)
public class NumberOfTweets {

	@GET
	public String doGetNumberOfTweets(@QueryParam("userid_min") String userIdMin, @QueryParam("userid_max") String userIdMax) {
		
		//We need to retrieve tweet from data base first.
		
		int numberOfTweets = 0;
		
		//TODO: Get the number of tweets from the db

		return "this is the third query!";
		
	}
	
	
}
