package edu.cmu.passion.client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * The client implemented through a servlet class
 * The class interact with browser and handles user input
 * @author Sun
 *
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Implementation get the user input from the browser.
		// A good option is to encapsulate these values into different objects
		
	}
	
	/**
	 * Client send request to the REST Server
	 * The Request *MUST BE* using the get method and applies to the HTTP protocal.
	 * 
	 */
	private void sendRequest() {
		//TODO: Implementation: please refer to https://jersey.java.net/documentation/latest/client.html
	}
	
	/**
	 * get the heartBeat from the server
	 */
	private void getHeartBeat() {
		//TODO: Implementation. write the content back to the browser
	}
	
	/**
	 * Get the text of tweets
	 */
	private void getTextOfTweets() {
		//TODO: Implementation. Write the content back to the browser.
	}
	
	/**
	 * Get the number of tweets
	 */
	private void getNumberOfTweets() {
		//TODO: Implementation. Write the content back to the browser.
	}
	
	/**
	 * Get the who retweeted a tweet
	 */
	private void getWhoRetweetedATweet() {
		//TODO: Implementation. Write the content back to the browser.
	}
}
