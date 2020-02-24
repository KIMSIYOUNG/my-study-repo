package kail.study.java.enumStudy;

import java.util.Arrays;
import java.util.List;

public enum Program {
	EDUCATION("교육용 프로그램", Arrays.asList("우아한 테크코스","삼성 소프트웨어","서울42","패스트 캠퍼스")),
	FOR_JOB("취업용 프로그램", Arrays.asList("국비지원 아카데미","우아한 테크캠프","프로그래머스 관련"));

	private final String name;
	private final List<String> list;


	Program(String name, List<String> list) {
		this.name = name;
		this.list = list;
	}

	public static Program findGroup(String name) {
		return Arrays.stream(Program.values())
			.filter(group -> find(group, name))
			.findAny()
			.orElseThrow(() -> new IllegalArgumentException("없는 프로그램입니다."));
	}

	private static boolean find(Program group, String name) {
		return group.list.stream()
			.anyMatch(value -> value.equals(name));
	}

	public static void main(String[] args) {
		System.out.println(Program.findGroup("우아한 테크코스"));
	}
}
