import java.util.Scanner;

//Игра "Крестики-нолики"
//Разработайте классы для игры "Крестики-нолики".
// Создайте класс Game, который управляет логикой игры, и классы Player,
// описывающие поведение игроков.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем игроков
        Player player1 = new Player("Игрок 1", 'X');
        Player player2 = new Player("Игрок 2", 'O');

        // Создаем игру
        Game game = new Game(player1, player2);

        // Основной цикл игры
        while (true) {
            game.printBoard();
            System.out.println(game.getCurrentPlayer() + ", ваш ход. Введите строку и столбец (от 0 до 2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.checkWin()) {
                    game.printBoard();
                    System.out.println(game.getCurrentPlayer() + " победил!");
                    break;
                } else if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("Ничья!");
                    break;
                } else {
                    game.switchPlayer();
                }
            } else {
                System.out.println("Неверный ход. Попробуйте еще раз.");
            }
        }

        scanner.close();
    }
}