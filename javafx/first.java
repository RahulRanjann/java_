import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class first extends Application {
    public static void main(String[] arg)
	{
		launch(args);
	}
	public void start(Stage stage) throws Exception
	{
		Label l1 = new Label("Enter number1.");
		Label l2 = new Label("Enter number2.");
		Label l3 = new Label("Resul");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		Button b1 = new Button("ADD");

		GridPand g = new GridPane();
		g.addRow(0,l1,tf1);
		g.addRow(1,l2,tf2);
		g.addRow(2,b1);
		g.addRow(3,l3,tf3);

		Scene scene = new Scene(g,500,500);
		stage.setTitle("Simple Calcualator");
		stage.setScene(scene);
		stage.show();
		
	}
}
