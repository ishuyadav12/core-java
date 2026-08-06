package com.intro;

import java.util.*;
import java.util.function.*;

/*
Non-primitive data types are data types that store the reference(memory address)of an object 
rather than the actual value.They are created by the programmer or provided by Java,
can have methods and properties,and their size is not fixed.

# Store references (addresses) to objects.
# Can contain methods, constructors, and fields.
# Size is not fixed.
# Can be assigned the value null.
# Created using the new keyword (except string literals and some special cases).

Class, Object, String, Array, Interface, Enum, Record,
Wrapper Classes (Integer, Double, etc.),
Collections (ArrayList, HashMap, etc.)
*/

// 1. INTERFACE
interface Greetable {
	void greet();
}

// 2. ENUM
enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// 3. RECORD
record Point(int x, int y) {
	double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
}

// 4. ABSTRACT CLASS
abstract class Shape {
	abstract double area();
}

// 5. CLASS extending abstract class, implementing interface
class Circle extends Shape implements Greetable {
	String name;
	double radius;

	Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public void greet() {
		System.out.println("I am circle " + name);
	}
}

// 6. NESTED (INNER) CLASS
class Outer {
	class Inner {
		void show() {
			System.out.println("Inner class instance");
		}
	}
}

// 7. STATIC NESTED CLASS
class Container {
	static class Box {
		int item;

		Box(int item) {
			this.item = item;
		}
	}
}

// 8. CUSTOM EXCEPTION CLASS (also a non-primitive/reference type)
class MyException extends Exception {
	MyException(String message) {
		super(message);
	}
}

public class NonPrimitiveDataTypes {
	public static void main(String[] args) throws MyException {

		// ---- STRING ----
		String greeting = "Welcome to Java!";
		System.out.println(greeting);

		// ---- ARRAY (1D primitive) ----
		int[] numbers = { 10, 20, 30, 40 };
		System.out.println("Array element: " + numbers[2]);

		// ---- ARRAY (2D) ----
		int[][] matrix = { { 1, 2 }, { 3, 4 } };
		System.out.println("Matrix[1][1] = " + matrix[1][1]);

		// ---- ARRAY OF OBJECTS ----
		Circle[] circles = { new Circle("A", 2), new Circle("B", 3) };
		for (Circle c : circles)
			c.greet();

		// ---- CLASS OBJECT ----
		Circle c1 = new Circle("Main", 5);
		System.out.println("Area: " + c1.area());

		// ---- ABSTRACT CLASS REFERENCE ----
		Shape s = c1;
		System.out.println("Shape area via reference: " + s.area());

		// ---- INTERFACE REFERENCE ----
		Greetable g = c1;
		g.greet();

		// ---- ENUM ----
		Day today = Day.WEDNESDAY;
		System.out.println("Today: " + today);

		// ---- RECORD ----
		Point p = new Point(3, 4);
		System.out.println(p + " distance=" + p.distanceFromOrigin());

		// ---- WRAPPER CLASSES ----
		Integer wrappedInt = 100;
		Double wrappedDouble = 3.14;
		Character wrappedChar = 'A';
		Boolean wrappedBool = true;
		System.out.println(wrappedInt + " " + wrappedDouble + " " + wrappedChar + " " + wrappedBool);

		// ---- COLLECTIONS: List, Set, Map, Queue ----
		List<String> fruits = new ArrayList<>(List.of("Apple", "Banana"));
		Set<Integer> uniqueNums = new HashSet<>(Set.of(1, 2, 3));
		Map<String, Integer> ageMap = new HashMap<>();
		ageMap.put("Alice", 30);
		Queue<String> queue = new LinkedList<>();
		queue.add("Task1");
		System.out.println(fruits + " " + uniqueNums + " " + ageMap + " " + queue);

		// ---- NESTED / INNER CLASS ----
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.show();

		// ---- STATIC NESTED CLASS ----
		Container.Box box = new Container.Box(99);
		System.out.println("Box item: " + box.item);

		// ---- FUNCTIONAL INTERFACE / LAMBDA (reference type) ----
		Function<Integer, Integer> square = x -> x * x;
		System.out.println("Square of 5: " + square.apply(5));

		// ---- CUSTOM EXCEPTION (throwing/catching) ----
		try {
			throw new MyException("Custom error occurred");
		} catch (MyException e) {
			System.out.println("Caught: " + e.getMessage());
		}

		// ---- OBJECT (superclass of everything) ----
		Object obj = "I can hold anything";
		System.out.println("Object holds: " + obj);
	}
}
