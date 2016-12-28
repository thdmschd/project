package qeury;

public class QuerySelect {
	private String selectEmpInfo = "SELECT * FROM EUNCHONG.PERSONAL";
	private String SelectEmpInfoAboutEname = "SELECT * FROM EUNCHONG.PERSONAL WHERE ENAME = ?";
	
	public String getSelectEmpInfo() {
		return selectEmpInfo;
	}
	
	public String getSelectEmpInfoAboutEname() {
		return SelectEmpInfoAboutEname;
	}
}
