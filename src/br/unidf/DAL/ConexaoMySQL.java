package br.unidf.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class ConexaoMySQL {
    protected Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/provaA2";
            String user = "root";
            String password = "geracao"; 
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            final String msg = "Error ao se conectar na base de dados";
            JOptionPane.showMessageDialog(null, msg);
            throw new RuntimeException(msg, ex);
        }
    }
}
