import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

public class GraphExt {
	
	Graph<String> graph;
	Vertex<String> from;
	List<Path> paths=new ArrayList<>();
	public GraphExt(Graph<String> graph,Vertex<String> source){
		this.graph=graph;
		List<Vertex<String>> initroute=new ArrayList<Vertex<String>>();
		initroute.add(from);
    	paths.add(new Path(initroute,0));
	}
    public List<Path> ShortestPath() {
    	List<Vertex<String>> routes=new ArrayList<>();
    	//routes.add(from);
    	int lastindex=paths.size()-1;
    	int complete=0;
    	//routes=paths.get(paths.size()-1).getVertex();
    	//List<Vertex<String>> temproutes=new ArrayList<>(routes);
        //while(complete<=100) {
				List<Vertex<String>> temproutes=new ArrayList<>(paths.get(0).getVertex());
				int currentdistance=paths.get(complete).getDistance();
				for(Edge<String> edge:graph.getEdges()) {
					//temproutes.get(temproutes.size()-1).getValue()==edge.getFromVertex().getValue()
					if(temproutes.get(temproutes.size()-1).getValue()==edge.getFromVertex().getValue()) {
//						List<Vertex<String>> temp=new ArrayList<>(temproutes);
//						temp.add(edge.getToVertex());
//						paths.add(new Path(new ArrayList<>(temp),currentdistance+edge.getCost()));
						
					}           
				}
//				lastindex=paths.size()-1;
//				if(complete<lastindex) {
//					//complete++;
//				}
//				complete++;
			
        //} 
//        String destination=null;
//        List<Path> pathsclone=new ArrayList<>(paths);
//        for(Path current:pathsclone) {
//        	 destination=current.getVertex().get(current.getVertex().size()-1).getValue();
//        	for(Path path:pathsclone) {
//        		if(destination==path.getVertex().get(path.getVertex().size()-1).getValue() && current.getDistance()<path.getDistance() ) {
//        			paths.remove(path);
//        			
//        		}
//        	}
//        }
		return paths;    	
    }
    public class Path{
    	List<Vertex<String>> vertex;
    	int distance=Integer.MAX_VALUE;
    	public Path(List<Vertex<String>> vertex,int distance)
    	{
    		this.vertex=vertex;
    		this.distance=distance;
    	}
		public List<Vertex<String>> getVertex() {
			return vertex;
		}
		public void setVertex(List<Vertex<String>> vertex) {
			this.vertex = vertex;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
    	
    }
}
