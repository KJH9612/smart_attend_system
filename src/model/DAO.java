package model;

import java.sql.Connection;
import java.sql.SQLException;

public interface DAO {	//DATA Access Object : 데이터 접근 객체
	Connection getConnection() throws SQLException;
}
