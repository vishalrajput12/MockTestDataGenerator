package application;
import java.util.*;
import com.github.javafaker.Faker;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class MainController {
Faker faker = new Faker();
Scanner sc=new Scanner(System.in);
int n,nameflag,mobileflag,maritalflag,streetflag,cityflag,countryflag;

@FXML
private CheckBox cb1;
@FXML
private CheckBox cb2;
@FXML
private CheckBox cb3;
@FXML
private CheckBox cb4;
@FXML
private CheckBox cb5;
@FXML
private CheckBox cb6;
@FXML
private TextField tb;
@FXML
private Label myData;
@FXML
private ListView listview;

public void checkEvent(ActionEvent event) {
if(cb1.isSelected()){
nameflag=1;
}
if(cb2.isSelected()){
mobileflag=1;
}
if(cb3.isSelected()){
cityflag=1;
}
if(cb4.isSelected()){
maritalflag=1;
}
if(cb5.isSelected()){
streetflag=1;
}
if(cb6.isSelected()){
countryflag=1;
}
}

public void submitCheck(ActionEvent event) {
String s=tb.getText();
n=Integer.parseInt(s);
for(int i=1;i<=n;i++) {

if(nameflag==1) {
String name=faker.name().firstName();
listview.getItems().add(name);
//System.out.println(name);
}
if(mobileflag==1) {
String mobile=faker.number().digits(10);
listview.getItems().add(mobile);
//System.out.println(mobile);
}
if(maritalflag==1) {
String marital=faker.demographic().maritalStatus();
listview.getItems().add(marital);
//System.out.println(marital);
}
if(streetflag==1) {
String streetName = faker.address().streetName();
listview.getItems().add(streetName);
//System.out.println(streetName);
}
if(cityflag==1) {
String city = faker.address().city();
listview.getItems().add(city);
//System.out.println(city);
}
if(countryflag==1) {
String country = faker.address().country();
listview.getItems().add(country);
//System.out.println(country);
}
listview.getItems().add("\n");
//System.out.println();
}
}



}