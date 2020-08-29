package udemyJavaMasterclassInterfaces;

public class MainTelephone {

	public static void main(String[] args) {
		ITelephone timsPhone;
//		DeskPhone timsPhone; -> also valid
		
		timsPhone = new DeskPhone(1234567890);

		timsPhone.powerOn();
		timsPhone.callPhone(1234567890);
		timsPhone.answer();
		
		timsPhone = new MobilePhone(987654321);
		timsPhone.powerOn();
		timsPhone.callPhone(987654321);
		timsPhone.answer();
	}
}
