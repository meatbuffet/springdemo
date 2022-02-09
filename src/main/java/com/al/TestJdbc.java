package com.al;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&allowMultiQueries=true&serverTimezone=UTC";
        String user="hbstudent";
        String pass="hbstudent";
        Connection myConn=null;
        try{
            System.out.println("Connecting to database: "+jdbcUrl);

            myConn= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connection successful!");
        }catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            try {
                myConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
