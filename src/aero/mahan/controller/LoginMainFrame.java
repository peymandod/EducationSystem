package aero.mahan.controller;

//import aero.mahan.biz.BLO.LoginBLO;
import aero.mahan.view.forms.LoginForm;
import aero.mahan.view.interfaces.IloginNotifier;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * Created by 92474747 on 1/26/2016.
 */
/**
 * @Auther Mohsen Javadi
 */

public class LoginMainFrame extends JFrame {
    
    LoginForm loginForm;
//    LoginBLO loginBLO;

    LoginMainFrame(){

        loginForm = new LoginForm();
//        loginBLO = new LoginBLO();

        setTitle("Login Page");
        setSize(500, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(loginForm);
//        loginForm.setiLoginNotifer(new IloginNotifier() {
//            @Override
//            public void loginEventOccurred(String username, String password) {
//                try {
//                    loginBLO.checkUser(username, password);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        });



            }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            LoginMainFrame loginMainFrame;
            public void run() {
                loginMainFrame= new LoginMainFrame();
            }
        });

    }
    
}
