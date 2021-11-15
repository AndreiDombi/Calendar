package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    Connection con;
    String username,password,ip,port,database;
    @SuppressLint("NewApi")
    public Connection connectionClass() {
        ip = "192.168.0";
        port = "143";
        username = "";
        password = "";
        database = "Movies";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=Movies;integratedSecurity=true;";
            connection = DriverManager.getConnection(ConnectionURL);
            System.out.println("CONNECTION COMPLETED");

        }
        catch (Exception ex) {
            Log.e("Error", ex.getMessage());

        }
        return connection;
    }
}
