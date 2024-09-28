package Pratica22;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunction {

  public Connection dbConnect(String dbname, String user, String pass) {
    Connection conn = null;

    try {
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5471/" + dbname, user, pass);

      if (conn != null) {
        System.out.println("Conexão com PostgreSQL realizada com sucesso!");
      } else {
        System.out.println("Connection Failed");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return conn;
  }
}

