package edu.cmu.passion.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * The REST Server Resource Class for handling the response of "Heartbeat request"
 * 
 * @author Sun
 *
 */
@Path("q1")
@Produces("text/plain")
public class HeartbeatResource {
	
	
	@GET
	@Produces("application/json")
	public String doGetHeartBeat() {
		StringBuffer buffer = new StringBuffer();
		
		//TODO: Generate the heart Beat through appending to the buffer, the format should be in String
		
		
		return buffer.toString();
	}
	
	
	
}
