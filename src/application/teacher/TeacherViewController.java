package application.teacher;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Course;
import model.Teacher;
import model.TeacherCatalog;

public class TeacherViewController implements Initializable {
    TeacherCatalog teacherCat;
	
	/*-------------------FXML variables------------------*/
	@FXML private TabPane tabPane;
	@FXML private Tab courseTab;
	@FXML private Tab assessmentTab;
	
	@FXML private TextField txtTeacherNameUpdate;
	@FXML private TextField txtTeacherSSNUpdate;
	
	@FXML private Button btnTeacherUpdate;
	@FXML private Button btnSelectionRemove;
	
	@FXML private TableView<Course> tableViewCourses;
	@FXML private TableColumn<Course, String> tableColCourseID;
	@FXML private TableColumn<Course, String> tableColCourseName;
	@FXML private TableColumn<Course, String> tableColCourseStudents;

    private ObservableList<Course> observableCourses = FXCollections.observableArrayList();

    @Override
	public void initialize(URL url, ResourceBundle resources) { //TODO finish this implementation after solving the window problem

    }

}
