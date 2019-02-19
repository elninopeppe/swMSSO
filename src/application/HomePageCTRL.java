package application;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.*;

public class HomePageCTRL implements Initializable{
	   @FXML
	    private BorderPane borderpane;
	    @FXML
	    private Button buttonApri;
	    @FXML
	    private Button buttonStampa;

	    File file;

	@FXML
	public void clickApri (ActionEvent event) throws IOException, BiffException{
		FileChooser scegli= new FileChooser();
		scegli.setTitle("Scegli il file da aprire");
		Stage stage=(Stage)borderpane.getScene().getWindow();
		this.file=scegli.showOpenDialog(stage);
		/*if(file!= null){
			Desktop desk=Desktop.getDesktop();
			desk.open(file);
		}*/
		System.out.println(file.getName());
		Workbook wb=Workbook.getWorkbook(file);
	}

	  @FXML
	    void clickStampa(ActionEvent event) throws BiffException, IOException {
		  Workbook wb=Workbook.getWorkbook(file);
		  Sheet sheet=wb.getSheet(0);
		  Cell a=sheet.getCell(0, 0);
		  String nome=a.getContents();
		  System.out.println(nome);
	    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
