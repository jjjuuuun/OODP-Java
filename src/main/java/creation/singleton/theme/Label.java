package creation.singleton.theme;

public class Label {
    private String text;

    public Label(String text) {
        this.text = text;
    }

    public void display() {
        String themeColor = Theme.getInstance().getThemeColor();
        System.out.println(
                "Label [" +
                        this.text +
                        "] displayed in " +
                        themeColor +
                        " theme."
        );
    }
}
