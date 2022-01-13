package application;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
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
import model.TeacherCatalog;
import test.Test;
import model.StudentCatalog;
import model.Teacher;

public class MainViewController implements Initializable {
	
	TeacherCatalog teacherCat = new TeacherCatalog();
	StudentCatalog studentCat = new StudentCatalog();
	
	/*-------------------FXML variables------------------*/
	@FXML private TabPane tabPane;
	@FXML private Tab teacherTab;
	@FXML private Tab studentTab;
	
	@FXML private TextField txtTeacherName;
	@FXML private TextField txtTeacherSSN;
	
	@FXML private Label lblErrMsgTeacherName;
	@FXML private Label lblErrMsgTeacherSSN;
	
	@FXML private Label lblTeacherConfirm;
	
	@FXML private Button btnTeacherAdd;
	
	@FXML private TableView<Teacher> tableViewTeachers;
	@FXML private TableColumn<Teacher, String> tableColEmpNbr;
	@FXML private TableColumn<Teacher, String> tableColTeacherSSN;
	@FXML private TableColumn<Teacher, String> tableColTeacherName;
	@FXML private TableColumn<Teacher, String> tableColTeacherCourses;
	
	private ObservableList<Teacher> observableTeachers = FXCollections.observableArrayList();
		
	@Override
	public void initialize(URL url, ResourceBundle resources) {
		Test.generateTestData();
		setTeacherCat(Test.getTc());
		setStudentCat(Test.getSc());

		tableColEmpNbr.setCellValueFactory(new PropertyValueFactory<>("employeeNbr"));
		tableColTeacherSSN.setCellValueFactory(new PropertyValueFactory<>("ssNbr"));
		tableColTeacherName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColTeacherCourses.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getTaughtCourses().size())));
		
		refreshGUI();
	}
	
	
	public void refreshGUI() {
		observableTeachers.clear();
		for(HashMap.Entry<String, Teacher> entry : teacherCat.getTeacherRegistry().entrySet()) {
			Teacher tmpTeacher = entry.getValue();
			observableTeachers.add(tmpTeacher);
		}
		tableViewTeachers.setItems(observableTeachers);
		tableViewTeachers.getSortOrder().add(tableColEmpNbr);
	}
	
	public void btnAddTClicked() {
		Teacher newTeacher = new Teacher(txtTeacherSSN.getText(), txtTeacherName.getText());
		teacherCat.addTeacher(newTeacher.getSsNbr(), newTeacher);
		this.refreshGUI();
	}

	/*-----------------Setters & getters-----------------*/
	public TeacherCatalog getTeacherCat() {
		return teacherCat;
	}


	public void setTeacherCat(TeacherCatalog teacherCat) {
		this.teacherCat = teacherCat;
	}


	public StudentCatalog getStudentCat() {
		return studentCat;
	}


	public void setStudentCat(StudentCatalog studentCat) {
		this.studentCat = studentCat;
	}	
}
