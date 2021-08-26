package ch07;

public class GenericPrintTest {

	public static void main(String[] args) {

		/*
		 * Generic 프로그래밍 사용시
		 * Compiler시 <>다이아몬드 연산자의 클래스 내부에 있는
		 * T 타입변수를 전부 <>안의 클래스로 replace 변경해줌
		 * 형변환(typecasting)을 하지 않아도 된다.
		 */
		Powder powder = new Powder();

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

		powderPrinter.setMaterial(powder);

		Powder p = powderPrinter.getMaterial();

	}

}
