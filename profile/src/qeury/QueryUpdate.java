package qeury;

public class QueryUpdate {
	private String updateEmpSal = "UPDATE EUNCHONG.PERSONAL SET contact = ? and e_email = ? and address = ? and motivation = ? WHERE seq_no = ?";
	
	public String getUpdateEmpSal() {
		return updateEmpSal;
	}
}
