package profile;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
		Car myCar=new Car();
		//�ʵ尪 �ϱ�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("���� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		//�ʵ尪 ����
		myCar.color="�ʷ�";
		System.out.println("����� ���� : " + myCar.color);
		myCar.setCompany("samsung");
		myCar.getCompany();
		System.out.println(myCar.getCompany());
		
	}

}
