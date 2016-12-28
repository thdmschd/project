package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qeury.QuerySelect;

public class SelectControl {
	
	QuerySelect select = new QuerySelect();
	
	public ResultSet SelectEmpInfo(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(select.getSelectEmpInfo());
			rs = pstmt.executeQuery();
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow());
			while(rs.next()){
				int seq_no = rs.getInt("SEQ_NO");
				String e_name = rs.getString("E_NAME");
				String contact = rs.getString("CONTACT");
				String birthday = rs.getString("BIRTHDAY");
				String e_email = rs.getString("E_EMAIL");
				String address = rs.getString("ADDRESS");
				String major = rs.getString("MAJOR");
				String motivation = rs.getString("MOTIVATION");
				String university = rs.getString("UNIVERSITY");
				System.out.println("SEQ_NO : " + seq_no + "\t NAME : " + e_name + "\t CONTACT : " + contact +
						"\t BIRTHDAY : " + birthday + "\t EMAIL : " + e_email + "\t ADDRESS : " + address + 
						"\t MAJOR : " + major + "\t MOTIVATION : " + motivation + "\t UNIVERSITY : " + university);
			}
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow());
			
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Query Select End");
		}
		
		return rs;
	}
	
//	public ResultSet SelectEmpInfoAboutEname(Connection conn, String Ename){
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		try{
//			pstmt=conn.prepareStatement(select.getSelectEmpInfoAboutEname());
//			pstmt.setString(1,Ename);
//			rs=pstmt.executeQuery();
//			while(rs.next()){
//				int empno=rs.getInt("Empno");
//				String ename=rs.getString("Ename");
//				System.out.println("empno : " + empno + "\t ename : " + ename);
//			}
//		}
//		catch(Exception e){
//		}
//		
//		
//		
//		
//		
//		return rs;
//	
//	}
}

