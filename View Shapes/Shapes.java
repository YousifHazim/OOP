import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class Shapes extends Pane {
    

    public Shapes(){
        
        /* Main Rectangle */
        Rectangle mRectangle = new Rectangle();
        mRectangle.setX(10); // X-axis 
        mRectangle.setY(10); // Y-axis
        mRectangle.setWidth(480); // Width
        mRectangle.setHeight(480); // Height
        mRectangle.setArcHeight(30); // Arc Height
        mRectangle.setArcWidth(30); // Arc Width
        mRectangle.setStrokeWidth(3); //  stroke width
        mRectangle.setFill(Color.WHITE); // color fill
        mRectangle.setStroke(Color.BLACK); // color stroke
        this.getChildren().add(mRectangle);

        /* Circle Shape */
        Circle circle = new Circle();
        circle.setCenterX(50); // X-axis 
        circle.setCenterY(50); // Y-axis
        circle.setRadius(25); // Radius of the circle
        circle.setFill(Color.RED); // color fill
        circle.setStroke(Color.BLACK); // color stroke
        this.getChildren().add(circle);

        /* Rectangle Shape */
        Rectangle rectangle = new Rectangle();
        rectangle.setX(400); // X-axis 
        rectangle.setY(400); // Y-axis
        rectangle.setWidth(50); // Width
        rectangle.setHeight(50); // Height
        rectangle.setFill(Color.GREEN); // color fill
        rectangle.setStroke(Color.RED); // color stroke
        rectangle.setRotate(45); // Rotate
        this.getChildren().add(rectangle);

        /* Line Shape */
        Line line = new Line();
        line.setStartX(50); // Start X-axis 
        line.setEndX(425); // End X-axis 
        line.setStartY(50); // Start Y-axis
        line.setEndY(425); // End Y-axis
        line.setStroke(Color.BLUE); // color stroke
        this.getChildren().add(line);

        /* Text for Circle */
        Text textCircle = new Text("Circle"); // Text
        textCircle.setX(80); // X-axis
        textCircle.setY(50); // Y-axis
        textCircle.setFill(Color.RED); // color fill
        textCircle.setFont(Font.font("Cambria", FontWeight.BOLD, FontPosture.REGULAR, 16)); // Font
        this.getChildren().add(textCircle);

        /* Text for Rectangle */
        Text textRectangle = new Text("Rotated \n Rectangle"); // Text
        textRectangle.setX(300); // X-axis
        textRectangle.setY(425); // Y-axis
        textRectangle.setFill(Color.GREEN); // color fill
        textRectangle.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.ITALIC, 16)); // Font
        this.getChildren().add(textRectangle);

    }
}
