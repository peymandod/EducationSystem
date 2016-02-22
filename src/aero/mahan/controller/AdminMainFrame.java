package aero.mahan.controller;

import aero.mahan.biz.BLO.SemesterBLO;
import aero.mahan.data.DAO.SemesterDAO;
import aero.mahan.model.Semester;
import aero.mahan.view.panels.SemesterPanel;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by 92474747 on 1/26/2016.
 */
public class AdminMainFrame extends JFrame {



    JTabbedPane semesterTab;
    SemesterPanel semesterPanel;
    SemesterBLO semesterBLO;
    ArrayList<Semester> semesters;

    public AdminMainFrame() {
        super("Administration Environment");
        setBounds(700, 200, 900, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        semesterTab = new JTabbedPane();
        this.add(semesterTab, BorderLayout.CENTER);

        semesterPanel = new SemesterPanel();
        semesterTab.insertTab("Semester", null, semesterPanel, null, 0);
        semesterTab.setTabPlacement(JTabbedPane.TOP);
        semesterBLO = new SemesterBLO();
        semesters = new ArrayList<>();
        loadSemesterFromDB();

    }

    public void loadSemesterFromDB(){
        try {
            semesters = semesterBLO.loadSemesters();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        setDataToSemesterTablePanel(semesters);
    }
    public void setDataToSemesterTablePanel(ArrayList<Semester> semesters){
        semesterPanel.setSemesterArrayList(semesters);
    }


}
