package edu.cmu.passion.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * The REST Server Resource Class for handling the response of "Who retweeted a tweet"
 * @author Sun
 *
 */

@Path("q4")
@Produces(MediaType.TEXT_PLAIN)
public class WhoRetweetedATweet {
	
	@GET
	public String doGetWhoRetweetedATweet(@QueryParam("userid") String userId) {
		
		//We need to retrieve tweet from data base first.
		String singleUserId = userId;
		
		List<String> userCluster = new ArrayList<String>();
		
		//TODO: Get the list of "reTweetedUsers"

		return "This is the forth query!";
		
	}
	
	
	
	
	
	
}
