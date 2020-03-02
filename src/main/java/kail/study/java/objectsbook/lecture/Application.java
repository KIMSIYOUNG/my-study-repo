package kail.study.java.objectsbook.lecture;

import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		Lecture lecture = new Lecture("시영학 개론",
			70,
			Arrays.asList(81, 93, 40, 32, 70));

		System.out.println(lecture.evaluate());

		List<Grade> grades = Arrays.asList(new Grade("A", 100, 95),
			new Grade("B", 94, 80),
			new Grade("C", 79, 70),
			new Grade("D", 69, 50),
			new Grade("F", 49, 0));

		GradeLecture gradeLecture = new GradeLecture("객체지향 프로그래밍", 70, Arrays.asList(81,95,75,50,45), grades);

		System.out.println(gradeLecture.evaluate());
	}
}
