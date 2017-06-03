package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller{
    @FXML private TextField custom;
    private Path path = Paths.get("realmlist.wtf");

    public void hellfire() {
        System.out.print("hellfire\n");
        Runtime runTime = Runtime.getRuntime();
        try
        {
            ArrayList<String> writable = new ArrayList<>();
            writable.add("set realmlist logon.hellfire-tbc.com");
            Files.write(path,writable, StandardOpenOption.CREATE);
            runTime.exec("Wow");
            System.exit(0);
        } catch (Exception e) {
            showError(e);
        }
    }
    public void wargate(){
        System.out.print("wargate\n");
        Runtime runTime = Runtime.getRuntime();
        try
        {
            ArrayList<String> writable = new ArrayList<>();
            writable.add("set realmlist play.wargate-project.org");
            Files.write(path,writable, StandardOpenOption.CREATE);
            runTime.exec("Wow");
            System.exit(0);
        } catch (Exception e) {
            showError(e);
        }
    }
    public void custom(){
        System.out.print("custom\n");
        Runtime runTime = Runtime.getRuntime();
        try
        {
            ArrayList<String> writable = new ArrayList<>();
            writable.add(custom.getText().trim());
            Files.write(path,writable, StandardOpenOption.CREATE);
            runTime.exec("Wow");
            System.exit(0);
        } catch (Exception e) {
            showError(e);
        }
    }

    private void showError(Exception e){
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Something went wrong");
        error.setContentText(e.getMessage());
        System.out.print(e.getLocalizedMessage());
        error.showAndWait();
    }
}
