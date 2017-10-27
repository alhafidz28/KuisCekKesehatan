/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Sweet.Cakee
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton alaki;
    @FXML
    private RadioButton aprmpn;
    @FXML
    private JFXTextField aideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton aproses;
    @FXML
    private JFXButton areset;
    @FXML
    private JFXTextField anama;
    @FXML
    private JFXTextField abb;
    @FXML
    private JFXTextField atb;
    @FXML
    private ToggleGroup jk;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void laki(ActionEvent event) {
    }

    @FXML
    private void prmpn(ActionEvent event) {
    }

    @FXML
    private void ideal(ActionEvent event) {
    }
//hasil.setText("Nama : "+nama+"\n"+"BeratBadan : "+bb+"kg"+"\n"+"TinggiBadan : "+tb+"cm"+"\n");
    @FXML
    private void proses(ActionEvent event) {
        double ti,bt,jenkel = 0;
        ti = Double.valueOf(atb.getText());
        bt = Double.valueOf(abb.getText());
        
        if (alaki.isSelected()){
        jenkel = (ti - 110);
        }else if (aprmpn.isSelected()){
        jenkel = (ti - 100);
        }
        
        if (jenkel < bt){
        aideal.setText(""+jenkel);
        hasil.setText("Maaf "+ anama.getText()+" overwght");
        saran.setText("Kurangi makanmu");
        }else if (jenkel > bt){
        aideal.setText(""+jenkel);
        hasil.setText("Maaf "+ anama.getText()+" underwght");
        saran.setText("Tambahlah makanmu");
        }else if(jenkel == bt){
        aideal.setText(""+jenkel);
        hasil.setText("Selamat "+ anama.getText()+" Ideal");
        saran.setText("Jaga Pola Makanmu");
    }}

    @FXML
    private void reset(ActionEvent event) {
        anama.setText("");
        abb.setText("");
        atb.setText("");
        alaki.setSelected(false);
        aprmpn.setSelected(false);
        aideal.setText("");
        hasil.setText("");
        saran.setText("");
    }

    @FXML
    private void nama(ActionEvent event) {
    }

    @FXML
    private void bb(ActionEvent event) {
    }

    @FXML
    private void tb(ActionEvent event) {
    }
    
}
