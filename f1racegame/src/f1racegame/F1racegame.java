/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1racegame;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author hp
 */
public class F1racegame extends Application {
    int move=10;
    ImageView imm,imm1,imm2,imm3,imm4,imm5,imm6;
    Image[] im6;
    Timeline tm;
    
    @Override
    public void start(Stage primaryStage) {
       Image car1=new Image("images/car1.jpg");
        Image car2=new Image("images/car2.jpg");
         Image police=new Image("images/police.jpg");
          Image truck=new Image("images/truck_1.png");
           Image truck1=new Image("images/truck1_1.jpg");
           im6=new Image[]{car1,car2,police,truck,truck1};
          Random rd=new Random();
          
           
          Image car=new Image("images/car.jpg");
        ImageView im=new ImageView(car);
        im.setX(280);
        im.setY(480);
        im.setFitHeight(50);
        im.setFitWidth(30);
        
        Image track=new Image("images/line.png");
        
        Rectangle l=new Rectangle(0, 0, 20, 550);
        l.setFill(Color.GREENYELLOW);
        l.setStrokeWidth(2);
        l.setStroke(Color.BLACK);
        Rectangle l1=new Rectangle(620, 0, 20, 550);
        l1.setFill(Color.GREENYELLOW);
        l1.setStrokeWidth(2);
        l1.setStroke(Color.BLACK);
        
        ImageView im1=new ImageView(track);
        im1.setX(120);
        im1.setY(0);
        im1.setFitHeight(550);
        im1.setFitWidth(50);
        ImageView im2=new ImageView(track);
        im2.setX(220);
        im2.setY(0);
        im2.setFitHeight(550);
        im2.setFitWidth(50);
       ImageView im3=new ImageView(track);
        im3.setX(320);
        im3.setY(0);
        im3.setFitHeight(550);
        im3.setFitWidth(50);
        ImageView im4=new ImageView(track);
        im4.setX(420);
        im4.setY(0);
        im4.setFitHeight(550);
        im4.setFitWidth(50);
        ImageView im5=new ImageView(track);
        im5.setX(520);
        im5.setY(0);
        im5.setFitHeight(550);
        im5.setFitWidth(50);
        imm6=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm6.setX(40);
                    imm6.setY(0);
                    imm6.toBack();
                            imm6.setFitHeight(50);
        imm6.setFitWidth(35);
        
                    imm=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm.setX(90);
                    imm.setY(0);
                    imm.toBack();
                            imm.setFitHeight(50);
        imm.setFitWidth(35);
        
                    
                    imm1=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm1.setX(170);
                    imm1.setY(0);
                   imm1.setFitHeight(50);
        imm1.setFitWidth(35);
                    imm1.toBack();
                    
                    
                    imm2=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm2.setX(270);
                    imm2.setY(0);
                            imm2.setFitHeight(50);
        imm2.setFitWidth(35);
           imm2.toBack();
                    
                    imm3=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm3.setX(370);
                    imm3.setY(0);
                            imm3.setFitHeight(50);
        imm3.setFitWidth(35);
           imm3.toBack();
                    
                    imm4=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm4.setX(470);
                    imm4.setY(0);
                    imm4.setFitHeight(50);
        imm4.setFitWidth(35);
                
                  imm4.toBack();     
                    imm5=new ImageView(im6[rd.nextInt(im6.length)]);
                    imm5.setX(570);
                    imm5.setY(0);
                            imm5.setFitHeight(50);
        imm5.setFitWidth(35);
           imm5.toBack();
        Pane root = new Pane();
        tm=new Timeline(new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//               String uri=new File("car.mp3").toURI().toString();
//               String uri1=new File("car.mp3").toURI().toString();
//               
//               new MediaPlayer(new Media(uri)).play();
//                  new MediaPlayer(new Media(uri1)).play();
//                     
                imm6.setY(imm6.getY()+move);
                
                imm.setY(imm.getY()+move);
                  imm1.setY(imm1.getY()+move);
                   imm2.setY(imm2.getY()+move);
                imm3.setY(imm3.getY()+move);
                imm4.setY(imm4.getY()+move);
                imm5.setY(imm5.getY()+move);
              
                im1.setY(im1.getY()+move);
                im2.setY(im2.getY()+move);
                im3.setY(im3.getY()+move);
                im4.setY(im4.getY()+move);
                im5.setY(im5.getY()+move);
                
                if((imm.getY()>=550)||(imm1.getY()>=550)||(imm2.getY()>=550)||(imm3.getY()>=550)||(imm4.getY()>=550)||(imm5.getY()>=550)||(imm6.getY()>=550)){
                Random rd1=new Random();
                
                    imm.setY((rd1.nextInt(201)*-1));
                    imm1.setY((rd1.nextInt(201)*-1));
                
                imm2.setY((rd1.nextInt(201)*-1));
                imm3.setY((rd1.nextInt(201)*-1));
                
                imm4.setY((rd1.nextInt(201)*-1));
                imm5.setY((rd1.nextInt(201)*-1));
                imm6.setY((rd1.nextInt(201)*-1));
                imm.setImage(im6[rd.nextInt(im6.length)]);
                imm1.setImage(im6[rd.nextInt(im6.length)]);
                imm2.setImage(im6[rd.nextInt(im6.length)]);
                imm3.setImage(im6[rd.nextInt(im6.length)]);
                imm4.setImage(im6[rd.nextInt(im6.length)]);
                imm5.setImage(im6[rd.nextInt(im6.length)]);
                imm6.setImage(im6[rd.nextInt(im6.length)]);
                       
                        
                
                  }
                if(im1.getY()>=20){
                im1.setY(0);
                
                im2.setY(0);
                im3.setY(0);
                
                im4.setY(0);
                im5.setY(0);
                
                
                        
                
                  }/*String uri=new File("car.mp3").toURI().toString();
               String uri1=new File("car.mp3").toURI().toString();
//               
               new MediaPlayer(new Media(uri)).play();
               new MediaPlayer(new Media(uri1)).play();
//             */
                if(im.intersects(imm.getX(), imm.getY(),imm.getFitWidth(), imm.getFitHeight())||im.intersects(imm1.getX(), imm1.getY(),imm1.getFitWidth(), imm1.getFitHeight())||im.intersects(imm2.getX(), imm2.getY(),imm2.getFitWidth(), imm2.getFitHeight())||im.intersects(imm3.getX(), imm3.getY(),imm3.getFitWidth(), imm3.getFitHeight())||im.intersects(imm4.getX(), imm4.getY(),imm4.getFitWidth(), imm4.getFitHeight())||im.intersects(imm5.getX(), imm5.getY(),imm5.getFitWidth(), imm5.getFitHeight())||im.intersects(imm6.getX(), imm6.getY(),imm6.getFitWidth(), imm6.getFitHeight()))
                {
             //  new MediaPlayer(new Media(uri)).pause();
               //   new MediaPlayer(new Media(uri1)).pause();
             
                 
                tm.pause();
                
                 }
              
               // root.getChildren().addAll(imm,imm1,imm2,imm3,imm4,imm5,imm6);
               
            
            }
        }));
        im.toFront();
        im1.toBack();
        im2.toBack();
        im3.toBack();
        im4.toBack();
        im5.toBack();
        im.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
         if(event.getCode()==KeyCode.UP&&im.getY()>=0)
         {
         im.setY(im.getY()-5);
           
           }
          if(event.getCode()==KeyCode.DOWN&&im.getY()<=510)
         {
         im.setY(im.getY()+5);
           
           }
           if(event.getCode()==KeyCode.LEFT&&im.getX()>=20)
         {
         im.setX(im.getX()-5);
           
           }
            if(event.getCode()==KeyCode.RIGHT&&im.getX()<=590)
         {
         im.setX(im.getX()+5);
           
           }
                 
                 }
        });
        
        tm.setCycleCount(Timeline.INDEFINITE);
        tm.play();
        root.getChildren().addAll(im1,im2,im3,im4,im5,l,l1,imm,imm1,imm2,imm3,imm4,imm5,imm6,im);
        
        Scene scene = new Scene(root, 640, 550);
        root.setStyle("-fx-background-color: WHITE");
        primaryStage.setTitle("F1 RACE");
        im.requestFocus();
        Image logo=new Image("images/logo.jpg");
        primaryStage.getIcons().add(logo);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
