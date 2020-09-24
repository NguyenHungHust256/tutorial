    package com.company.singleton;

    import com.company.Params;

    public class ConnectDatabase {
        private String url;
        private String name;

        private static volatile ConnectDatabase instance;

        private ConnectDatabase(String url, String name){
            this.url = url;
            this.name = name;
        }

        public static ConnectDatabase getInstance() {
            // Do something before get instance ...
            if (instance == null) {
                // Do the task too long before create instance ...
                // Block so other threads cannot come into while initialize
                synchronized (ConnectDatabase.class) {
                    // Re-check again. Maybe another thread has initialized before
                    if (instance == null) {
                        instance = new ConnectDatabase(Params.URL_DATABASE, Params.NAME_DATABASE);
                    }
                }
            }
            // Do something after get instance ...
            return instance;
        }
    }
