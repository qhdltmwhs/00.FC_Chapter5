package ch07;

public class ThreeDPrintTest {

	public static void main(String[] args) {
		
		/*
		 * Generic 프로그래밍 사용하지 않을시
		 * Object 타입 변수로 설정할경우 꺼낼때 강제 형변환 필요
		 */
		Powder powder = new Powder();
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
	
		printer.setMaterial(powder);

		Powder p = (Powder) printer.getMaterial();
		
	}

}
