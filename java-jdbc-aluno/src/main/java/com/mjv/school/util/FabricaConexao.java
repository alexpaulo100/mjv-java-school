package com.mjv.school.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    private static Connection conexao;
    
    public static void abrirConexao() throws SQLException, ClassNotFoundException{
        if(conexao == null){
            String driverName = "com.mysql.cj.jdbc.Driver";

            Class.forName(driverName);

            String url  = "jdbc:mysql://localhost:3306/mjv_school_db";
            String user = "root";
            String pass = "suasenhaaqui";
            conexao = DriverManager.getConnection(
                    url, user, pass);
            //System.out.print("Conexao Realizada Com Sucesso !");
        }
    }

    public static Connection getConexao() {
        try {
            FabricaConexao.abrirConexao();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return conexao;
    }

    public static void fecharConexao(){
        try {
            conexao.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
