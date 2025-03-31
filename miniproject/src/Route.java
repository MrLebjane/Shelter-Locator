import java.util.ArrayList;

import com.jwetherell.algorithms.data_structures.Graph.Edge;

public class Route {
	ArrayList<Edge<String>> routes=new ArrayList<>();	
	public Route() {
		Area areas=new Area();
		routes.add(new Edge<String>(42,areas.getAreas().get(0),areas.getAreas().get(1)));
		routes.add(new Edge<String>(41,areas.getAreas().get(0),areas.getAreas().get(2)));
		routes.add(new Edge<String>(66,areas.getAreas().get(0),areas.getAreas().get(3)));
		routes.add(new Edge<String>(70,areas.getAreas().get(0),areas.getAreas().get(6)));
		routes.add(new Edge<String>(46,areas.getAreas().get(1),areas.getAreas().get(4)));
		routes.add(new Edge<String>(39,areas.getAreas().get(1),areas.getAreas().get(5)));
		routes.add(new Edge<String>(52,areas.getAreas().get(1),areas.getAreas().get(6)));
		routes.add(new Edge<String>(11,areas.getAreas().get(2),areas.getAreas().get(3)));
		routes.add(new Edge<String>(59,areas.getAreas().get(2),areas.getAreas().get(7)));
		routes.add(new Edge<String>(30,areas.getAreas().get(3),areas.getAreas().get(7)));
		routes.add(new Edge<String>(39,areas.getAreas().get(3),areas.getAreas().get(6)));
		routes.add(new Edge<String>(16,areas.getAreas().get(4),areas.getAreas().get(5)));
		routes.add(new Edge<String>(33,areas.getAreas().get(5),areas.getAreas().get(6)));
		routes.add(new Edge<String>(66,areas.getAreas().get(5),areas.getAreas().get(8)));
		routes.add(new Edge<String>(66,areas.getAreas().get(6),areas.getAreas().get(7)));
		routes.add(new Edge<String>(85,areas.getAreas().get(6),areas.getAreas().get(8)));
		routes.add(new Edge<String>(117,areas.getAreas().get(7),areas.getAreas().get(8)));

	}
	
	public ArrayList<Edge<String>> getRoutes(){
		return routes;
	}
}
