package com.day4.session1.solid.srp.problem;

import java.io.File;

class Connection {

}

class Jmsconnection {

}

class HibernateConnection {

}

class ConnectionFactory {

	Connection getJdbcConnection() {
		return new Connection();
	}

	File getFileConnection() {
		return new File("foo");
	}

	Jmsconnection getJmsConnection() {
		return new Jmsconnection();
	}

	HibernateConnection getHibernateConnection() {
		return new HibernateConnection();
	}
}

public class Demo {

	public static void main(String[] args) {

	}
}
