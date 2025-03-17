package creation.singleton.theme;

public class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void display() {
        String themeColor = Theme.getInstance().getThemeColor();
        System.out.println(
                "Button [" +
                        this.label +
                        "] displayed in " +
                        themeColor +
                        " theme."
        );
    }
}
