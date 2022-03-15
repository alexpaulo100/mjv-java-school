package com.mjv.school.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mjv.school.model.Aluno;
import com.mjv.school.util.FabricaConexao;

public class AlunoRepository {
    //crud com jdbc
    //ResultSet

    public void gravar(Aluno aluno){
            Connection conexao = FabricaConexao.getConexao();
            boolean alterando = false;
            //Statement comandoSql = conexao.createStatement();
            
            StringBuilder sql = new StringBuilder();

            if(aluno.getId() == null)
            {
                sql.append("insert into tab_aluno (nome, altura, sexo, ativo)");
                sql.append(" values (?, ?, ?, ?)");
            }
                else
            {
                alterando = true;
                sql.append("update tab_aluno set nome = ?, altura = ?, sexo = ?, ativo = ?");
                sql.append(" where id = ?");
            }

            PreparedStatement comandoSql;
            try {
                comandoSql = conexao.prepareStatement(sql.toString());
                comandoSql.setString(1, aluno.getNome());
                if(aluno.getAltura() != null)
                    comandoSql.setDouble(2, aluno.getAltura());
                else
                    comandoSql.setNull(2, java.sql.Types.NULL);
                comandoSql.setString(3, aluno.getSexo());
                comandoSql.setBoolean(4, aluno.isAtivo());
                if(alterando)
                    comandoSql.setInt(5, aluno.getId());

                comandoSql.execute();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public boolean excluir(Aluno aluno){
        boolean retorno = false;
        try 
        {             
            Connection conexao = FabricaConexao.getConexao();
            
            //PreparedStatement stmt =  conexao.prepareStatement("Update tb_aluno set ativo = 0 where id = ?");
            PreparedStatement stmt =  conexao.prepareStatement("Delete tab_aluno where id = ?");
            stmt.setInt(1, aluno.getId());
            stmt.execute();
            return retorno = (stmt.getUpdateCount() > 0);
        } 
            catch (SQLException ex) 
        {
            return retorno;
        }
    }

    public Aluno getAluno(Integer id){
        Aluno aluno = null;

        Connection conexao = FabricaConexao.getConexao();
        
        String sql = "Select * from tab_aluno where id = ? limit 1";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setAltura(rs.getDouble("altura"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setAtivo(rs.getBoolean("ativo"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return aluno;
    }

    public List<Aluno> listarAlunos(){
        List<Aluno> alunos = null;
        Connection conexao = FabricaConexao.getConexao();

        String sql = "Select * from tab_aluno";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs;
            rs = stmt.executeQuery();
            if(rs != null && !rs.isClosed()){
                alunos = new ArrayList<Aluno>();
                if(rs.next())
                {
                    do {
                        Aluno aluno = new Aluno();
                        aluno = new Aluno();
                        aluno.setId(rs.getInt("id"));
                        aluno.setNome(rs.getString("nome"));
                        aluno.setAltura(rs.getDouble("altura"));
                        aluno.setSexo(rs.getString("sexo"));
                        aluno.setAtivo(rs.getBoolean("ativo"));
                        alunos.add(aluno);
                    } while (rs.next());
                }
                return alunos;
            } else {
                return null;
            }
        } catch (SQLException e) {
           return null;
        }
    }

    
}
