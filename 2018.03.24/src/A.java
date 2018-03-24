
class A {
	public void a(int x) {}
}

class B extends A {

	public static void main(String[] args) {
		A a = new B();
		System.out.println("실행완료");
	}

}
//답 : 클래스 A의 기본 생성자가 없기 떄문에 컴파일 오류가 발생한다. 클래스  B의 기본 생성자가  클래스 A의 기본 생성자를 호출한다.