package it.beije.pool;

import java.time.LocalDateTime;
import java.time.Period;


public class ConnectionPool {
	
	private static final int numConnections = 10;
	private static MyConnection[] connections = null;
	
	private static void init() {
		connections = new MyConnection[numConnections];
//		for (MyConnection c : connections) {
//			c = new MyConnection();
//		}
	}
	
	public static MyConnection getConnection() {
		if (connections == null) {
			init();
		}
		
		for (int i=0; i < numConnections; i++) {
			if (connections[i] == null) {
				connections[i] = new MyConnection(i);
				
				return connections[i];
			} else if (connections[i].isAvailable()) {
				connections[i].setAvailable(false);
				connections[i].setTimestamp(LocalDateTime.now());
				
				return connections[i];
			}
		}
		
		return null;//tenere in attesa il richiedente ?
	}
	
//	public static void closeConnection(MyConnection c) {
//		c.setAvailable(true);
//		c.setTimestamp(null);
//	}
	
	public static void closeConnections(Period expiredTime) {
		for (MyConnection c : connections) {
			if (!c.isAvailable()) {
				if (c.getTimestamp() == null ||
					c.getTimestamp().plus(expiredTime).isBefore(LocalDateTime.now())
					) {
					c.close();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("chiedo una connessione (1)...");
		MyConnection connection = ConnectionPool.getConnection();
		System.out.println(connection.getConn());
		
		System.out.println("chiedo una connessione (2)...");
		MyConnection connection2 = ConnectionPool.getConnection();
		System.out.println(connection2.getConn());
		
		connection.close();

		System.out.println("chiedo una connessione (3)...");
		MyConnection connection3 = ConnectionPool.getConnection();
		System.out.println(connection3.getConn());
		
		//...
		//ConnectionPool.closeConnection(connection);
	}
}
