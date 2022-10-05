package banggwahu;
import java.util.*;
public class d0420 {

	public static void main(String[] args) {
		
		int num[] = new int[3];		//배열에 저장
		int answer[] = new int[3];
		Random r = new Random();	//랜덤으로 입력받음
		
		while(true) {
			num[0] = r.nextInt(9)+1;
			num[1] = r.nextInt(9)+1;
			num[2] = r.nextInt(9)+1;
				if(!(num[0]==num[1] || num[1]==num[2] || num [0]==num[2])) {
					break;
				}
		}
	
			//for(int j=0; j<i; j++)
			//	if(num[i]==num[j]) {
			//		i--;
			//		break;
			//	}
		
	
	for(int i=0; i<answer.length; i++) {
		System.out.println(num[i]+" ");
	}
	Scanner sc = new Scanner(System.in);
	int strike = 0;				//변수 설정
	int ball=0;
	
	while(true) {
	strike = 0;
	ball=0;
	System.out.println("답을 입력해주세요(스페이스로 구분)");	//값 입력받기
	answer[0] = sc.nextInt();				
	answer[1] = sc.nextInt();
	answer[2] = sc.nextInt();
	
	for(int i=0; i<answer.length; i++) {			
		if(num[i]==answer[i]){
			strike++;
		}
	}
	if(num[0]==answer[1]||num[0]==answer[2])ball++;		//입력한 수와 랜덤수를 비교하기
	if(num[1]==answer[0]||num[1]==answer[2])ball++;		
	if(num[2]==answer[1]||num[2]==answer[0])ball++;
	
	
	System.out.println(strike+"스트라이크!"+ball+"볼!");	   //자리와 수 모두 같으면 스트라이크, 수만 같으면 볼로 출력함
		
	if(strike==3) {
		System.out.println("클리어!");		      //if문을 사용하여 스트라이크의 값이 3과 동일할 때 게임 클리어
		break;
	}
	
	System.out.println("한판 더? ㅇㅇ-->~ ㄴㄴ-->2");	   //재시작화면을 출력, 2를 입력하면 게임 종료. 2를 제외한 나머지 수를 									입력할 경우 게임 
	int restart = sc.nextInt();
	if(restart==2) {
		System.out.println("게임종료");
		System.exit(0);
		break;
	}else {
		System.out.println("게임을 다시 시작합니다!");
	}
	}
	/*
	for(int i=0; i<answer.length; i++) {			//값 입력받기
		System.out.println("답을 입력해주세요.");
		answer[0] = sc.nextInt();
	}
	for(int i=0; i<answer.length; i++) {
		for(int s=0; i<answer.length; i++) {	
		}
	}
*/
	}

}
