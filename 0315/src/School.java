public class School {
	int grade; //학년
	String dep; //학과
	String building; //건물  
	
	void print1(){
		System.out.println("이 학교의 학년은"+ grade + "학년이 있고 학과의 개수는" + dep + " 총 2개가 있고 건물은"+ building + " 이렇게 총 2개의 건물이 존재합니다. ");
	}
}
	class ClassRoom{ //교실
		int student; //학생수
		String thname; //담임선생님 성함
		int classnumber; //반
		void pirnt2(){
			System.out.println("교실에는 학생들이 있고 학생들의 수는" + student + " 담임선생님의 성함은 " + thname + " 이시고  우리반은" + classnumber + " 입니다. ");
		}
	}
	class Ao { //교무실
		String teacher; //교사
		void print3(){
			System.out.println("교무실에는" + teacher + "들이 열심히 일을 하고 계십니다.");
		}
	 
	}
	