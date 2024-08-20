import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import entities.Aluno;
import jdbc.AlunoJDBC;
import jdbc.db;

public class Programa {

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		
		Connection ConApp = db.getConexao();
		int opcao = 0;
		
		Scanner console = new Scanner(System.in);
		
		
		try {
			
				do {
					Aluno a = new Aluno();
					AlunoJDBC acaoAluno = new AlunoJDBC();
					
					System.out.println("######### Menu #########"
							+ "\n1- Cadastrar"			
							+ "\n2- Listar"
							+ "\n3- Alterar"
							+ "\n4- Excluir"
							+ "\n5- Sair");
					System.out.print("\n\tOpção:");
					opcao = Integer.parseInt(console.nextLine());
					
					if (opcao == 1) {
						
					System.out.println("\n ### Cadastrar Aluno ### \n\r");
					System.out.print("Nome: ");
					a.setNome (console.nextLine());
					
					
					acaoAluno.salvar(a);
					console.nextLine();
					
					}
				
					if (opcao == 2) {
						
												
						
						}
						
						
						
						console.nextLine();
					}
					
					if (opcao == 3) {
						
						
					}
					
			} while (opcao != 5);
				 
					 
				} catch (Exception e) {
					System.out.println(e);
				}
				finally {db.fechaConexao();
				
					
		} while (opcao != 5);
			
			
		}

}		
		
		
		
		
		
		
		
		
		/*System.out.println("***Conexão Criada");
		
		
		Statement st =  ConApp.createStatement();
		String sql = "SELECT * FROM aluno";
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
		
		System.out.println(rs.getInt(1) + "\t "+ rs.getString(2));
		}
		
		db.fechaConexao();
		System.out.println("***Conexão Fechada");*/
		

