package application;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Catalog;
import model.Student;
import model.Teacher;

public class ViewController implements Initializable {
	
	Catalog cat = new Catalog();
	
	@FXML private TabPane tabPane;
	@FXML private Tab teacherTab;
	@FXML private Tab studentTab;
	
	@FXML private TextField txtTName;
	@FXML private TextField txtTSSN;
	
	@FXML private TextField txtTEmpNbr;
	@FXML private TextField txtTNameNew;
	@FXML private TextField txtTSSNNew;
	
	@FXML private Label lblErrMsgTName;
	@FXML private Label lblErrMsgTSSN;
	
	@FXML private Label lblErrMsgTEmpNbr;
	@FXML private Label lblErrMsgTNameNew;
	@FXML private Label lblErrMsgTSSNNew;
	
	@FXML private Label lblTConf;
	@FXML private Label lblTEditConf;
	
	@FXML private Button btnAddT;
	@FXML private Button btnDelT;
	@FXML private Button btnUpdateT;
	
	@FXML private TableView<Teacher> tvTeachers;
	@FXML private TableColumn<Teacher, String> tcTEmpNbr;
	@FXML private TableColumn<Teacher, String> tcTSSN;
	@FXML private TableColumn<Teacher, String> tcTName;
	@FXML private TableColumn<Teacher, Integer> tcTCourses;
	
	private ObservableList<Teacher> observableTeachers = FXCollections.observableArrayList();
		
	@Override
	public void initialize(URL url, ResourceBundle resources) {
		tcTEmpNbr.setCellValueFactory(new PropertyValueFactory<>("employeeNbr"));
		tcTSSN.setCellValueFactory(new PropertyValueFactory<>("ssNbr"));
		tcTName.setCellValueFactory(new PropertyValueFactory<>("name"));
		//tcTCourses.setCellValueFactory(new PropertyValueFactory<>("numberOfCourses")); //this won't work
		
		this.refreshTeacherTable();
	}
	
	
	public void refreshTeacherTable() {
		observableTeachers.clear();
		for(HashMap.Entry<String, Teacher> entry : cat.getTeacherRegistry().entrySet()) {
			Teacher tmpT = entry.getValue();
			observableTeachers.add(tmpT);
		}
		tvTeachers.setItems(observableTeachers);
		tvTeachers.getSortOrder().add(tcTEmpNbr);
	}
	
	public void btnAddTClicked() {
		Teacher newTeacher = new Teacher(txtTSSN.getText(), txtTName.getText());
		cat.addTeacher(newTeacher.getSsNbr(), newTeacher);
		this.refreshTeacherTable();
	}
}
