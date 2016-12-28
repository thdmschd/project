package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qeury.QueryDelete;

public class DeleteControl {

QueryDelete delete = new QueryDelete();
	
	public void DeleteEmpInfo(Connection conn,int seq_no){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(delete.getDeleteEmpInfo());
			pstmt.setInt(1,seq_no);
			
			pstmt.executeUpdate();
			
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Delete Insert End");
		}
		
	}

}
