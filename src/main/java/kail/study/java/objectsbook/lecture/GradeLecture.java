package kail.study.java.objectsbook.lecture;

import static java.util.stream.Collectors.*;

import java.util.List;

public class GradeLecture extends Lecture{
	private List<Grade> grades;

	public GradeLecture(String title, int pass, List<Integer> scores, List<Grade> grades) {
		super(title, pass, scores);
		this.grades = grades;
	}

	@Override
	public String evaluate() {
		return super.evaluate() + ", "+ gradesStatistics();
	}

	private String gradesStatistics() {
		return grades.stream()
			.map(grade -> format(grade))
			.collect(joining(" "));
	}

	private String format(Grade grade) {
		return String.format("%s:%d",grade.getName(), gradeCount(grade));
	}

	private long gradeCount(Grade grade) {
		return getScores().stream()
			.filter(grade::include)
			.count();
	}
}
