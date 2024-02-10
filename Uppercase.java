package com.java.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppercase {
	public static void main(String[] args) {
		Stream <String> names= Stream.of("aBc","d","ef");
		List<String> uppercase=names.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
	}
	
}
	