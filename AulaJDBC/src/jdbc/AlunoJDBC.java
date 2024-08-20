package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import entities.Aluno;

public class AlunoJDBC {
	Connection conApp;
	private String sql;
	PreparedStatement pst;
	
	public void salvar (Aluno a) throws SQLException {
		
		try {
			 conApp = db.getConexao();
			 sql = "INSERT INTO aluno (nomeAluno) VALUES (?)";
			 pst = conApp.prepareStatement(sql);
			 pst.setString(1, a.getNome());
			 if (1 == pst.executeUpdate()) {
				 System.out.println("\n Cadastro do aluno " + a.getNome() + " realizado com sucesso");
				 
			 }
			 
			} catch (Exception e) {
				System.out.println(e);
			}
			finally {db.fechaConexao();
			
		}
		
		
		
	}
	
	public void apagar (int id) {
		
				
	}
	
	public List<Aluno> listar(){
		
		
		
		return null;
	}
	
	public void alterar (Aluno a) {
		
	}
	
	
	
}
