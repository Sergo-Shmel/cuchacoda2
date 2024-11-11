// Перегрузка операторов: Матрица
//Создайте класс Matrix, представляющий двумерную матрицу.
//Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(new int[][]{{5, 6}, {7, 8}});

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        System.out.println(sum);

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        System.out.println(product);
    }
}