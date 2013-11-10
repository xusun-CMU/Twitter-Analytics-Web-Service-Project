package edu.cmu.passion.resources;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * The REST Server Resource Class for handling the response of "Number of tweets"
 * @author Sun
 *
 */

@Path("q3/{userid_min, userid_max}")	//TODO: Add validation for user input. We Could do it here through the regular expression
@Produces("text/plain")
public class NumberOfTweets {

	@GET
	@Produces("application/json")
	public int doGetNumberOfTweets(@PathParam("userid_min") String userIdMin, @PathParam("userid_max") String userIdMax) {
		
		//We need to retrieve tweet from data base first.
		
		int numberOfTweets = 0;
		
		//TODO: Get the number of tweets from the db

		return numberOfTweets;
		
	}
	
	
}
