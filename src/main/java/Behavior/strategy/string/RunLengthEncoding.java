package Behavior.strategy.string;

class RunLengthEncoding implements CompressionStrategy {
    @Override
    public String compress(String data) {
        StringBuffer compressed = new StringBuffer();
        int count = 1;
        for (int i = 1; i <= data.length(); i++) {
            if (i < data.length() && data.charAt(i) == data.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(data.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }
}
