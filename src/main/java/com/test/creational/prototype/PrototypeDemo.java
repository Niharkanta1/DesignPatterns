package com.test.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 02-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class PrototypeDemo {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();

		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		Rectangle rectangle = new Rectangle();
		rectangle.x = 20;
		rectangle.y = 25;
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "green";

		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);
		shapes.add(rectangle);

		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		compare(shapes, shapesCopy);
	}

	private static void compare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical");
				} else {
					System.out.println(i + ": But they are not identical");
				}
			} else {
				System.out.println(i + ": Shape objects are the same");
			}
		}
	}

}
