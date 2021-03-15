/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.beuvron.testjavafxlb;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author francois
 */
public class BoiteACoucou extends BorderPane {
    
    private TextField jtfNom;
    private Button jbCoucou;
    private Button jbSalut;
    private TextArea jtaMessage;
    
    public BoiteACoucou() {
        this.jtfNom = new TextField();
        this.jtfNom.setMinWidth(50);
        this.jbCoucou = new Button("Coucou");
        this.jbSalut = new Button("Salut");
        this.jtaMessage = new TextArea();
        this.jtaMessage.setMinSize(100,100);
        
        HBox boutons = new HBox(this.jbCoucou,this.jbSalut);
        BorderPane entete = new BorderPane();
        entete.setRight(boutons);
        Label jlNom = new Label("nom :");
        entete.setLeft(jlNom);
        entete.setCenter(this.jtfNom);
        
        this.setTop(entete);
        this.setCenter(this.jtaMessage);
        
        this.jbCoucou.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.println("coucou clicked");
                jtaMessage.appendText("coucou" + jtfNom.getText() + "\n");
            }
        });
        
        this.jbSalut.setOnAction((t) -> {
                System.out.println("salut clicked");
                jtaMessage.appendText("salut" + jtfNom.getText() + "\n");
        }
        );
        
    }
    
}
