package edu.cmu.passion.resources;


import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cmu.passion.bean.AWSInfo;

/**
 * The REST Server Resource Class for handling the response of "Heartbeat request"
 * 
 * @author Sun
 *
 */
@Path("/q1")
public class HeartbeatResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String doGetHeartBeat() {
		StringBuffer buffer = new StringBuffer();
		//TODO: DO WE NEED TO PASS THE RESPONSE IN THE FORMAT OF JSON/XML?, currently, it's plain string
		AWSInfo info = new AWSInfo();
		buffer.append(info.getTeamID().concat(", ").concat(info.getAWSAccountID()).concat("\n"));
		buffer.append(info.getDate());
		return buffer.toString();
	}
	
}
