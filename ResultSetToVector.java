package aplicacionBD;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class ResultSetToVector {

	public static Vector<Vector<String>> getDatos(ResultSet r){
		Vector<Vector<String>> datos = new Vector<Vector<String>>();
		Vector<String> temp;
		ResultSetMetaData rs;
		try {
			rs = r.getMetaData();
			int nroColumnas = rs.getColumnCount();
			while (r.next()) {
				temp = new Vector<String>();
				for(int i = 1; i <= nroColumnas; i++) {
					temp.add(r.getString(i));
				}
				datos.addElement(temp);
			}
		} catch (SQLException e) {
		}
		return datos;
	}

	public static Vector<String> getColumnas(ResultSet r){
		Vector<String> columnas = new Vector<String>();
		ResultSetMetaData rs;
		try {
			rs = r.getMetaData();
			int nroColumnas = rs.getColumnCount();
			for(int i = 1; i <= nroColumnas; i++) {
				columnas.add(rs.getColumnName(i));
			}
		} catch (SQLException e) {
		}
		return columnas;
	}
	
	
	
	
}
