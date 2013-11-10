package edu.cmu.passion.resources;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * The REST Server Resource Class for handling the response of "Text of tweets request"
 * @author Sun
 *
 */

@Path("q2/{time}") //TODO: Add validation for user input. We Could do it here through the regular expression
@Produces("text/plain")
public class TextOfTweetsResource {

	@GET
	@Produces("application/json")
	public List<String> doGetTextOfTweetsResource(@PathParam("time") String time) {
		
		//We need to retrieve tweet from data base first.
		
		String singleTweet;		//TODO: Build singleTweet
		
		List<String> tweetCluster = new ArrayList<String>();
		
		//TODO: Add tweets into tweetCluster
		
		return tweetCluster;
		
	}
	
	
	
	
}
