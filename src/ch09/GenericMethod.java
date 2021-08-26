package ch09;

public class GenericMethod {

	public static <T, V> double markRectangle(Point<T, V> p1, Point<T, V> p2) {
		
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double buttom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = buttom - top;

		return width * height;

	}

	public static void main(String[] args) {
		
		/*
		 * Generic 메서드 구현하기
		 */
		Point<Integer, Double> p1 = new Point<>(3, 3.0);
		Point<Integer, Double> p2 = new Point<>(13, 13.0);
		
		double size = GenericMethod.markRectangle(p1, p2);
		System.out.println(size);
	
	}

}
