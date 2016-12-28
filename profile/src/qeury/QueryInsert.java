package qeury;

public class QueryInsert {
	private String insertEmpInfo = "INSERT INTO PERSONAL (seq_no, e_name, contact, birthday, e_email, address, major, motivation, university) VALUES (?,?,?,?,?,?,?,?,?)";
	
	public String getInsertEmpInfo() {
		return insertEmpInfo;
	}
}
