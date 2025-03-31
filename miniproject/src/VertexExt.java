import com.jwetherell.algorithms.data_structures.Graph.Vertex;

public class VertexExt<T> extends Vertex {
     int x_cord=0;
     int y_cord=0;
	@SuppressWarnings("unchecked")
	public VertexExt(Comparable<T> value, int weight) {
		super(value, weight);
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unchecked")
	public VertexExt(Comparable<T> value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	public int getX_cord() {
		return x_cord;
	}
	public void setX_cord(int x_cord) {
		this.x_cord = x_cord;
	}
	public int getY_cord() {
		return y_cord;
	}
	public void setY_cord(int y_cord) {
		this.y_cord = y_cord;
	}

	
	



	

}
