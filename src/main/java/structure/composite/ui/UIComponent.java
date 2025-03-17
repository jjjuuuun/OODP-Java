package structure.composite.ui;

interface UIComponent {
    void render();
    void add(UIComponent component);
    void remove(UIComponent component);
}