
import javax.swing.Action;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class javafx extends Application
{

    	/* data type */ 
        private TextField textfield = new TextField();
        private long num1=0;
        private String operation = "";
        private boolean start = true;

        /* Buttons Action */
        private Button buttonNumber(String ch){

            Button button = new Button(ch);
            button.setFont(Font.font(18));
            button.setPrefSize(50, 50);
            button.setOnAction(this::processNumber);
            return button;
            
        }
        private Button buttonOperation(String ch){
            
            Button button = new Button(ch);
            button.setFont(Font.font(18));
            button.setOnAction(this::processOperation);
            button.setPrefSize(50, 50);
            return button;
            
        }
        private Button buttonClear(String ch){
            
            Button button = new Button(ch);
            button.setFont(Font.font(18));
            button.setPrefSize(50, 50);
            button.setOnAction(e ->{
                textfield.setText("");
                operation = "";
                start = true;
            });
            return button;
            
        }

        /* Button Process */
        private void processNumber(ActionEvent e){
            
            if(start){
                textfield.setText("");
                start=false;
            }

            String value = ((Button)e.getSource()).getText();
            textfield.setText(value);
        }
        
        private void processOperation(ActionEvent e){
            String value = ((Button)e.getSource()).getText();

            if(!value.equals("=")){

                if(!operation.isEmpty())
                    return;

                num1 = Long.parseLong(textfield.getText());
                operation = value;
                textfield.setText("");
            }else{
                if(operation.isEmpty())
                    return;

                long num2 = Long.parseLong(textfield.getText());
                float result = calculate(num1,num2,operation);
                textfield.setText(String.valueOf(result));
                start = true;
                operation = "";
            }

        }

        private float calculate(long num1,long num2,String operation){
            switch(operation){
                case "+" : return num1+num2;
                case "-" :  return num1-num2;
                case "X" :  return num1 * num2;
                case "/" :  
                    if(num2 == 0)
                        return 0;
                return num1 / num2;
                default :   return 0 ;
            }
        }
        
    @Override
    public void start(Stage primaryStage)
    {

        /* Text Field */

        textfield.setFont(Font.font(20)); // Size Font for Text Field
        textfield.setPrefHeight(50);    // Height for Text Field
        textfield.setAlignment(Pos.CENTER_RIGHT); // text start write for Text Field
        textfield.setEditable(false); // can not edit the text by user
        
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(textfield);
        
        /* Buttons */
        
        TilePane tilePane = new TilePane();
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setAlignment(Pos.TOP_CENTER); // text start write for Text Field
        tilePane.getChildren().addAll(

            buttonNumber("7"),
            buttonNumber("8"),
            buttonNumber("9"),
            buttonOperation("/"),
            buttonNumber("4"),
            buttonNumber("5"),
            buttonNumber("6"),
            buttonOperation("X"),
            buttonNumber("1"),
            buttonNumber("2"),
            buttonNumber("3"),
            buttonOperation("-"),
            buttonNumber("0"),
            buttonClear("C"),
            buttonOperation("="),
            buttonOperation("+")
        );





        BorderPane root = new BorderPane();
        root.setTop(stackPane);
        root.setCenter(tilePane);

        Scene scene = new Scene(root , 250 , 310);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        
        
        primaryStage.show();


    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
