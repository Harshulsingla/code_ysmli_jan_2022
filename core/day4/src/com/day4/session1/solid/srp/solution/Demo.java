package com.day4.session1.solid.srp.solution;

import java.io.File;

class Connection {

}

class Jmsconnection {

}

class HibernateConnection {

}

class JdbcConnectionFactory{
	Connection getJdbcConnection() {
		return new Connection();
	}
}

class FileConnectionFactory{
	File getFileConnection() {
		return new File("foo");
	}
}

class JmsconnectionFactory{
	File getFileConnection() {
		return new File("foo");
	}
}

class HibernateConnectionFactory {
	HibernateConnection getHibernateConnection() {
		return new HibernateConnection();
	}
}

public class Demo {

	public static void main(String[] args) {

	}
}
