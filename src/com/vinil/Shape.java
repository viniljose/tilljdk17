package com.vinil;

/**
 * https://openjdk.java.net/jeps/409
 * A sealed class or interface can be extended or implemented only by those classes and interfaces permitted to do so.
 */
public sealed class Shape permits Circle {
}

final class Circle extends Shape{

}
