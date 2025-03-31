import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph.Vertex;

public class Area {
	ArrayList<Vertex<String>> areas=new ArrayList<>();
	
	public Area() {
		areas.add(new Vertex<>("Emfuleni"));
		areas.add(new Vertex<>("Midvaal"));
		areas.add(new Vertex<>("Merafong: Kaofela Shelter",4));
		areas.add(new Vertex<>("Rand West City"));
		areas.add(new Vertex<>("Lesedi"));
		areas.add(new Vertex<>("Ekurheleni: Zonke Shelter ",7));
		areas.add(new Vertex<>("Johannesburg: Grace Shelter",9 ));
		areas.add(new Vertex<>("Mogale city: The Guardians Shelter",2));
		areas.add(new Vertex<>("Tswane"));
	}
	public List<Vertex<String>> getAreas(){
		return areas;
	}
}
