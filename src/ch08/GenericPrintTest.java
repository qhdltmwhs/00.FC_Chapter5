package ch08;

public class GenericPrintTest {

	public static void main(String[] args) {

		/*
		 * Generic 프로그래밍 사용시
		 * 클래스<T extends Material>설정시 연산자<> 안에는
		 * Material을 상속받은 T만 사용가능 하도록 제한을 둔다.
		 */
		Powder powder = new Powder();

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

		powderPrinter.setMaterial(powder);

		Powder p = powderPrinter.getMaterial();

	}

}
