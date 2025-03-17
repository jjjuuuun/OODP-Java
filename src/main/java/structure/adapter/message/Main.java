package structure.adapter.message;

class Main {
    public static void main(String[] args) {
        OldMessageSender oldSystem = new OldMessageSystem();
        ModernMessageSender adapter = new Adapter(oldSystem);

        adapter.sendMessage("Hello, World!", "john@example.com");
    }
}