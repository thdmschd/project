package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qeury.QueryInsert;

public class InsertControl {

	QueryInsert insert = new QueryInsert();
	
	public void InsertEmpInfo(Connection conn,int seq_no,String e_name,String contact,String birthday
			,String e_email,String address,String major,String motivation,String university){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(insert.getInsertEmpInfo());
			pstmt.setInt(1,seq_no);
			pstmt.setString(2, e_name);
			pstmt.setString(3, contact);
			pstmt.setString(4, birthday);
			pstmt.setString(5, e_email);
			pstmt.setString(6, address);
			pstmt.setString(7, major);
			pstmt.setString(8, motivation);
			pstmt.setString(9, university);
			pstmt.executeUpdate();
			
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Insert End");
		}
		
	}
	
	
}
