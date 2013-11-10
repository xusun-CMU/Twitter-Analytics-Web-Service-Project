package edu.cmu.passion.resources;


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * The REST Server Resource Class for handling the response of "Who retweeted a tweet"
 * @author Sun
 *
 */

@Path("q4/{userid}")	//TODO: Add validation for user input. We Could do it here through the regular expression
@Produces("text/plain")
public class WhoRetweetedATweet {
	
	
	@GET
	@Produces("application/json")
	public List<String> doGetWhoRetweetedATweet(@PathParam("userid") String userId) {
		
		//We need to retrieve tweet from data base first.
		String singleUserId;
		
		List<String> userCluster = new ArrayList<>();
		
		//TODO: Get the list of "reTweetedUsers"

		return userCluster;
		
	}
	
	
	
	
	
	
}
