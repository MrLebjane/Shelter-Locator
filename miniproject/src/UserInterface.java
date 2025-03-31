

import java.util.ArrayList;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class UserInterface extends HBox {
	Area area=new Area();
	Route route=new Route();
	Graph<String> graph;
	String area_name[]=new String[9];
	int x_cords[]= {350,550,150,250,800,570,400,240,570};
	int y_cords[]= {580,595,510,430,520,400,340,300,45};
   public UserInterface() {
	// TODO Auto-generated constructor stub
	  
	   graph=new Graph<>(area.getAreas(),route.getRoutes());
	   
	   
	   GraphExt graphext=new GraphExt(graph,area.getAreas().get(0));
	   for(GraphExt.Path i :graphext.ShortestPath()) {
		   for(Vertex<String> j:i.getVertex()) {
			   System.out.print(j.getValue()+",");
		   }
		   System.out.println(i.getDistance());
	   }
	   
	    GridPane gridpane=new GridPane();
	    Label options=new Label("OPTIONS");
	    options.setFont(new Font("Arial", 30));
		gridpane.addRow(0,options );
		
		GridPane pos=new GridPane();
		pos.addRow(0, new Label("Enter Current Position"));
		//pos.addRow(1, new TextField());
		pos.setPadding(new Insets(25,0,25,0));
		 ComboBox currentLocation = new ComboBox();
		 for(int i=0;i< graph.getVertices().size();i++) {
			 currentLocation.getItems().add(graph.getVertices().get(i).getValue());
		 }
		 pos.addRow(1, currentLocation);
		 pos.setStyle("-fx-background-color: #a5c2ac;");
		 pos.setBorder(new Border(new BorderStroke(Color.WHITESMOKE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
         gridpane.addRow(1, pos);
		
		GridPane pos1=new GridPane();
		Button nearestShelter =new Button("Find nearest Shelter");
		pos1.setPadding(new Insets(25,0,25,0));
		pos1.addRow(0, nearestShelter);
		pos1.setStyle("-fx-background-color: #a5c2ac;");
		 pos1.setBorder(new Border(new BorderStroke(Color.WHITESMOKE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
         gridpane.addRow(2, pos1);
		
		GridPane pos2=new GridPane();
		pos2.addRow(0, new Label("Enter Shelter Location"));
		pos2.setPadding(new Insets(25,0,25,0));
		ComboBox shelter = new ComboBox();
		 for(int i=0;i< graph.getVertices().size();i++) {
			 if(graph.getVertices().get(i).getWeight()!=0)
			     shelter.getItems().add(graph.getVertices().get(i).getValue());
		 }
		pos2.addRow(1, shelter);
		Button shortroute =new Button("Find Short route");
		pos2.addRow(2, shortroute);
		pos2.setStyle("-fx-background-color: #a5c2ac;");
		pos2.setBorder(new Border(new BorderStroke(Color.WHITESMOKE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		gridpane.addRow(3, pos2);
		
		
		VBox vbox=new VBox(gridpane);

		//Returns all Routes
		 Pane pane= AllRoutes();
        
		 
		vbox.setStyle("-fx-background-color: #FFFFFF;");
		vbox.setMaxWidth(400);
		vbox.setMinWidth(200);
		vbox.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		VBox vbox2=new VBox(pane);
		this.getChildren().add(vbox);
		this.getChildren().add(vbox2);
}
   
        
   
   
   public Pane area(int x_cord,int y_cord,String area_name,Color colour) {
		Pane pane = new Pane();  
	    Circle circle = new Circle(0,0,30,Color.GREENYELLOW);
	    circle.setStroke(colour);
	    circle.setStrokeWidth(5);
	    Text text = new Text(area_name);
	    pane.getChildren().addAll(circle,text);
	    pane.setLayoutX(x_cord); 
	    pane.setLayoutY(y_cord);
	    return pane;
   }
   
   public Pane AllRoutes() {
		ArrayList<Pane> areas=new ArrayList<>();
		
        for(int i=0;i<graph.getVertices().size();i++){
        	Color colour=Color.GREENYELLOW;
        	if(graph.getVertices().get(i).getWeight()!=0) {
        		colour=Color.DARKBLUE;
        	}
        	areas.add(area(x_cords[i],y_cords[i],graph.getVertices().get(i).getValue(),colour));
        	
        }
	    Pane pane=new Pane();	    
	    pane.getChildren().addAll(areas);
	    pane.getChildren().addAll(routes());
	    return pane;
   }
   public ArrayList<Pane> routes() {
	   ArrayList<Pane> list = new ArrayList<>(); 
	   
	   Line line;
	   for(Edge<String> edge:graph.getEdges()) {
		   int x_start=0;
		   int x_end=0;
		   int y_start=0;
		   int y_end=0;
		   int i=0;
		   for(Vertex<String> vertex:graph.getVertices()){
			    if(edge.getFromVertex().getValue()==vertex.getValue()) {
			    	x_start=x_cords[i];
			    	y_start=y_cords[i];	
			    }
			    if(edge.getToVertex().getValue()==vertex.getValue()) {
			    	x_end=x_cords[i];
			    	y_end=y_cords[i];	
			    } 	
	          i++;  
		   }
		   line=new Line(x_start,y_start,x_end,y_end);
		   Pane pane=new Pane();
		   Text text=new Text(edge.getCost()+"KM");
		   pane.getChildren().add(text);
		   pane.setLayoutX((x_start+x_end)/2); 
		   pane.setLayoutY((y_start+y_end)/2);
		   Pane pane1=new Pane();
		   pane1.getChildren().add(line);
		   list.add(pane);
		   list.add(pane1);
	   }
       	
	   return list; 
   }

}
