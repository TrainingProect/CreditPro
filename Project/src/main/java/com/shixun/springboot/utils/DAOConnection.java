package com.shixun.springboot.utils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOConnection {
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String DB_NAME = "credit";
	private final static String URL = "jdbc:mysql://localhost:3306/" + DB_NAME +"?characterEncoding=utf8&useSSL=false";
	private final static String USER = "root";
	private final static String PASSWORD = "root";

	public static <E> List<E> dbDQLWithSQL(String sql, Class<E> class1, Object... objects) {
		Connection connection = getConnection();
		PreparedStatement statement = null; 
		List<E> list = new ArrayList<>();
		ResultSet set = null;
		try {
			statement = connection.prepareStatement(sql);
			for (int i = 1; i <= objects.length; i++) {
				Object o = objects[i - 1];
				statement.setObject(i, o);
			}
			ResultSetMetaData data = statement.getMetaData();
			String[] names = new String[data.getColumnCount()-1];
			for (int i = 2; i <= data.getColumnCount(); i++) {
				String name = data.getColumnLabel(i);
				names[i - 2] = name;
			}
			set = statement.executeQuery();
			while (set.next()) {
				E oE = class1.newInstance();
				for (String name : names) {
					Object value = set.getObject(name);
					Field field = class1.getDeclaredField(name);
					field.setAccessible(true);
					field.set(oE, value);
				}
				list.add(oE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close(connection, statement, set);
		}
		return list;
	}

	public static boolean dbDMLWithSQL(String sql, Object... objects) {

		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			for (int i = 1; i <= objects.length; i++) {
				Object object = objects[i - 1];
				statement.setObject(i, object);
			}
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			close(connection, statement);
		}
		return true;
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(Connection connection, Statement statement, ResultSet set) {
		close(set);
		close(statement);
		close(connection);
	}

	public static void close(Connection connection, Statement statement) {
		close(statement);
		close(connection);

	}

	public static void close(ResultSet set) {
		if (set != null) {
			try {
				set.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
