package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "Samsung", 17);
		컴퓨터 com2 = new 컴퓨터(20000, "LG", 21);
		System.out.println(com1);
		System.out.println(com2);
	}

}
