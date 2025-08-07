package org.corebaseit.jwtrenewal.gson;

public class POJO {

    public class Root {
        public boolean success;
        public Data data;
    }

    class Data {
        public String name;
        public Integration integration;
        public Session session;
        public String terminal_id;
        public String api_key;
    }

    class Integration {
        public String code;
    }

    class Session {
        public Token access;
        public Token refresh;
    }

    class Token {
        public String api_key;
        public int expires_in;
    }
}
