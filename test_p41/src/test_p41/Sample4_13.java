package test_p41;

public class Sample4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(1234, 20.5);
		car1.vShow ();
		car1.mShow ();
	}

}
interface iVehicle 
{
	void vShow();
}

interface iMaterial
{
	void mShow();
}
class Car implements iVehicle,iMaterial
{
	private int num ;
	private double gas ;
	
	public Car (int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F���l" + num + "�A�T�o�q�]��"+gas+"�����l");		
	}
	public void vShow()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		
	}
	public void mShow()
	{
		System.out.println("���l�����ƬO�K");
	}
	
}