package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qeury.QueryUpdate;

public class UpdateControl {

QueryUpdate Update = new QueryUpdate();
	
	public void UpdateEmpInfo(Connection conn,String contact,String e_email, String address, String motivation, int seq_no){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(Update.getUpdateEmpSal());
			pstmt.setString(1,contact);
			pstmt.setString(2,e_email);
			pstmt.setString(3,address);
			pstmt.setString(4,motivation);
			pstmt.setInt(5,seq_no);
			pstmt.executeUpdate();
			
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Update Insert End");
		}
		
	}
}
