package test;

import java.sql.Connection;
import java.sql.ResultSet;

import DBControl.DeleteControl;
import DBControl.SelectControl;
import connect.OracleConnect;

public class DB_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleConnect oraConn = new OracleConnect();
		
		Connection conn = oraConn.connect();
		
		if ( conn != null) System.out.println("Oracle Connect Success");
		else System.out.println("Oracle Connect Fail");
		
		SelectControl sc = new SelectControl();
		ResultSet rs = sc.SelectEmpInfo(conn);
//		InsertControl Is = new InsertControl();
//		Is.InsertEmpInfo(conn, 1004, "Grace");
//		UpdateControl Ud = new UpdateControl();
//		Ud.UpdateEmpInfo(conn, 10000, 1000);
//		DeleteControl Dl = new DeleteControl();
//		Dl.DeleteEmpInfo(conn,2);
	}

}
