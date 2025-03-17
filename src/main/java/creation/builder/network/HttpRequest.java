package creation.builder.network;

import java.util.HashMap;
import java.util.Map;

// Product class
public class HttpRequest {
    private String method;
    private String url;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;

    // private constructor
    private HttpRequest(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.headers = builder.headers;
        this.parameters = builder.parameters;
        this.body = builder.body;
    }

    @Override
    public String toString() {
        return "HttpRequest [method=" + this.method + ", url=" + this.url +
                ", headers=" + this.headers + ", parameters=" + this.parameters +
                ", body=" + this.body + "]";
    }

    public static class Builder {
        private String method;
        private String url;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> parameters = new HashMap<>();
        private String body;

        public Builder(String method, String url) {
            this.method = method;
            this.url = url;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder addParameter(String key, String value) {
            this.parameters.put(key, value);
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
