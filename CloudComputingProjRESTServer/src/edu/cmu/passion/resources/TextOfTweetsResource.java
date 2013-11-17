package edu.cmu.passion.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * The REST Server Resource Class for handling the response of "Text of tweets request"
 * @author Sun
 *
 */

@Path("q2") //TODO: Add validation for user input. We Could do it here through the regular expression
@Produces(MediaType.TEXT_PLAIN)
public class TextOfTweetsResource {

	@GET
	public String doGetTextOfTweetsResource(@QueryParam("time") String time) {
		
		//We need to retrieve tweet from data base first.
		
		String singleTweet;		//TODO: Build singleTweet
		
		List<String> tweetCluster = new ArrayList<String>();
		
		//TODO: Add tweets into tweetCluster
		return "This is the second query!";
	}
	
	
	
	
}
