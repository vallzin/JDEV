package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {

	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String user = "valmilson";
	private static String senha = "valval";
	private static Connection connection = null;

	public static Connection getConnection() {
		return connection;
	}

	static {
		conectar();
	}

	public SingleConnectionBanco() {
		conectar();
	}

	private static void conectar() {
	    try {
	        System.out.println("Tentando conectar ao banco...");
	        
	        // Verifica se o driver está disponível
	        Class.forName("org.postgresql.Driver");
	        System.out.println("Driver PostgreSQL encontrado!");
	        
	        if (connection == null) {
	            connection = DriverManager.getConnection(banco, user, senha);
	            connection.setAutoCommit(false);
	            System.out.println("Conexão estabelecida com sucesso!");
	        }
	    } catch (Exception e) {
	        System.err.println("Erro na conexão:");
	        e.printStackTrace();
	        throw new RuntimeException("Erro ao conectar com o banco de dados");
	    }
	}

}
