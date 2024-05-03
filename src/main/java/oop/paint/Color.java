package oop.paint;

public enum Color {
    RED("красный"),
    GREEN("зеленый"),
    BLACK("черный"),
    BLUE("синий"),
    YELLOW("желтый");
    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
