package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
	@FXML private Label idResult;
	@FXML Button idButton1, idButton2, idButton3, idButton4;
	@FXML TextField textA, textB;
	@FXML public void getResult1(){
		double a, b, r1;
		a=Double.parseDouble(textA.getText());
		b=Double.parseDouble(textB.getText());
		
		r1=a+b;
		idResult.setText("Результат: "+r1);
	}
		
		@FXML public void getResult2(){
			double a, b, r2;
			a=Double.parseDouble(textA.getText());
			b=Double.parseDouble(textB.getText());
			
			r2=a-b;
			idResult.setText("Результат: "+r2);
		}
		
		@FXML public void getResult3(){
			double a, b, r3;
			a=Double.parseDouble(textA.getText());
			b=Double.parseDouble(textB.getText());
			
			r3=a*b;
			idResult.setText("Результат: "+r3);
		}
		
		@FXML public void getResult4(){
			double a, b, r4;
			a=Double.parseDouble(textA.getText());
			b=Double.parseDouble(textB.getText());
			
			r4=a/b;
			idResult.setText("Результат: "+r4);
		}
		
		
		
	}

