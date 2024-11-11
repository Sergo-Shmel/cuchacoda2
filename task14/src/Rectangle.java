public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getArea(){
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоуголькик{" +
                "Левая верхняя=" + topLeft +
                ", Правая нижняя=" + bottomRight +
                '}';
    }
}
