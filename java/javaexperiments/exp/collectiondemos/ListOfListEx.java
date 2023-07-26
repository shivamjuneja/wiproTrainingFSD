package exp.collectiondemos;

import java.util.ArrayList;
import java.util.List;

/**
 *  Delhi Mumbai
 * 
 *  Delhi Kanpur 
 * Kanpur Mumbai
 * 
 *  Delhi Chandiargh  
 *  
 *  Chandigarh Mumbai
 * 
 *  Delhi kanpur
 *  kanpur kolkatta 
 *  
 *  kolkatta mumbai
 *
 *
 *
 * 
 *   result
 *   
 *   Delhi->
 *   Delhi Mumbai
 *   
 *   <- Mumbai
 *   
 *   <-Delhi
 *   
 *   Delhi Kanpur 
 *   
 *   Kanpur Mumbai  
 *   
 *   Mumbai->
 * 
 */


public class ListOfListEx {

	public static void main(String args[]) {

		ListOfListEx demo=new ListOfListEx();
		List<CompleteRoute>result1 =demo.find("delhi", "mumbai");
		System.out.println(result1);
	
		List<CompleteRoute>result2 =demo.find("hyderabad", "banglore");
		System.out.println(result2);
	
		

	}

	List<CompleteRoute> find(String src, String destination){
		List<Route> complete1Routes = new ArrayList<>();
		complete1Routes.add(new Route("delhi", "mumbai"));
		CompleteRoute complete1 = new CompleteRoute("delhi", "mumbai", complete1Routes);

		List<Route> complete2Routes = new ArrayList<>();
		complete2Routes.add(new Route("delhi", "kanpur"));
		complete2Routes.add(new Route("kanpur", "mumbai"));
		CompleteRoute complete2 = new CompleteRoute("delhi", "mumbai", complete2Routes);

		List<Route> complete3Routes = new ArrayList<>();
		complete3Routes.add(new Route("delhi", "chandigargh"));
		complete3Routes.add(new Route("chandigargh", "mumbai"));
		CompleteRoute complete3 = new CompleteRoute("delhi", "mumbai", complete3Routes);

		
		List<Route> complete4Routes = new ArrayList<>();
		complete4Routes.add(new Route("delhi", "kanpur"));
		complete4Routes.add(new Route("kanpur", "kolkatta"));
		complete4Routes.add(new Route( "kolkatta","mumbai"));
		CompleteRoute complete4 = new CompleteRoute("delhi", "mumbai", complete4Routes);

		
		
		List<CompleteRoute> completeRoutes = new ArrayList<>();
		completeRoutes.add(complete1);
		completeRoutes.add(complete2);
		completeRoutes.add(complete3);
        completeRoutes.add(complete4);
        
		return completeRoutes;
	}
	
}

class Route {
	private String from;
	private String to;


	public Route(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return from + "-to-" + to;
	}

}

class CompleteRoute {
	private String start;
	private String destination;

	private List<Route> routes;

	public CompleteRoute(String start, String destination, List<Route> routes) {
		this.start = start;
		this.destination = destination;
		this.routes = routes;
	}

	@Override
	public String toString() {
		String result = "\n**starting from " + start;
		for (Route route : routes) {
			result = result + "\n" + "->" +route.toString();
		}
		result = result+"\n**destination is " + destination+"\n";
		return result;
	}

}
