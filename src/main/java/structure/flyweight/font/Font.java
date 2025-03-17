package structure.flyweight.font;

class Font {
    private String font;
    private int size;
    private String color;

    public Font(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void apply(String text) {
        System.out.println(
                "Text: '" + text +
                        "' with Font: " + this.font +
                        ", Size: " + this.size +
                        ", Color: " + this.color);
    }
}