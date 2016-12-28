package profile;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car myCar=new Car();
		//필드값 일기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("차종 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		//필드값 변경
		myCar.color="초록";
		System.out.println("변경된 색깔 : " + myCar.color);
		myCar.setCompany("samsung");
		myCar.getCompany();
		System.out.println(myCar.getCompany());
		
	}

}
