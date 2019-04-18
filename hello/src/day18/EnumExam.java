package day18;

public class EnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	UniversityStudent std1 = new UniversityStudent
			(Gender.MALE, Grade.ETC, Major.COMPUTER, "신윤호",2019160135);
		
		System.out.println(std1);
		
		std1.setUniversityStudent("그린");
		std1.setAverage(3.5);
		
		System.out.println(std1);

	}
}


