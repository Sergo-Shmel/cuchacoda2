// Комплексные числа
//Создайте класс ComplexNumber с полями для действительной и мнимой частей.
// Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.
public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, -1);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber difference = num1.subtract(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber quotient = num1.divide(num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}