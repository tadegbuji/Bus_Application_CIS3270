package GUI;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import database.SQLMethods;
import entities.BusSchedule;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class BookRidesController implements Initializable {

	
	@FXML private TableView<BusSchedule> tableView; //The tableView is expecting customerSchedule objects
	@FXML private TableColumn<BusSchedule, String> fromColumn;
	@FXML private TableColumn<BusSchedule, String> toColumn;
	@FXML private TableColumn<BusSchedule, Date> departureDateColumn;
	@FXML private TableColumn<BusSchedule, Date> arriavalDateColumn;
	@FXML private TableColumn<BusSchedule, Timestamp> departureTimeColumn;
	@FXML private TableColumn<BusSchedule, Timestamp> arrivalTimeColumn;
	@FXML private TableColumn<BusSchedule, String> numberOfPassengersColumn;
	@FXML private TableColumn<BusSchedule, String> busCapacity;
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		fromColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, String>("fromStation")); 
		
		toColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, String>("toStation")); 

		departureDateColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, Date>("departureDate")); 

		arriavalDateColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, Date>("arrivalDate")); 

		departureTimeColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, Timestamp>("departureTime")); 

		arrivalTimeColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, Timestamp>("arrivalTime")); 

		numberOfPassengersColumn.setCellValueFactory(new PropertyValueFactory<BusSchedule, String>("numberOfPassengers")); 

		busCapacity.setCellValueFactory(new PropertyValueFactory<BusSchedule, String>("capacity")); 
		
		
		tableView.setItems(getSchedule());

		
	}
	
	
	public ObservableList<BusSchedule> getSchedule(){
		
		try {
			return SQLMethods.getBusScheduleInfo();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("It returned Null");
		return null; 
		
	}
	
	@FXML
	public void logOut(ActionEvent event) throws IOException, SQLException {

		Parent loginParent = FXMLLoader.load(getClass().getResource("/GUI/Login.fxml"));

		Scene loginScene = new Scene(loginParent);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

		window.setScene(loginScene);
		window.setResizable(false);

	}
	
	
	
	
	
	
}