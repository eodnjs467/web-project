public class SwitchCaseTest02 {
	public static void main(String[] args) {

		int score = 87;
		switch ( (score-1) / 10) {
			case 10:
				System.out.println("A학점 입니다!");
				break;
			case 9:
				System.out.println("A학점 입니다!");
				break;
			case 8:
				System.out.println("B학점 입니다!");
				break;
			case 7:
				System.out.println("C학점 입니다!");
				break;
			case 6:
				System.out.println("D학점 입니다!");
				break;			
			default :
				System.out.println("F학점 입니다!");
				break;
		}
		
		if( (score / 10) == 10 || (score / 10) == 9 ){
			System.out.println("A학점 입니다!");
		}else if( (score / 10) == 8 ){
			System.out.println("B학점 입니다!");
		}else if( (score / 10) == 7 ){
			System.out.println("C학점 입니다!");
		}else if( (score / 10) == 6 ){
			System.out.println("D학점 입니다!");
		}else{
			System.out.println("F학점 입니다!");
		}
		
	}
}
