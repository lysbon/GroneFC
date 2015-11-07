package com.lysbon.gronefc.ents;

public class Constants {

    public static final String PCK = "uk.co.tae.twitterclientexercise";

    public static class SigningKey {

        public static final String TWITTER_KEY = "smXFzFZTarpTCJ4p3rXnEl3rC";
        public static final String TWITTER_SECRET = "qP2Cy9k7vWgOWeAAd1pWqkHIWaopGCd21ZYlS7NSbgpODL3NfJ";
    }


    public static class Url {

        public static final String BASE_URL = "https://api.twitter.com/1.1/";
        public static final String REQUEST_URL = "http://api.twitter.com/oauth/request_token";
        public static final String ACCESS_URL = "http://api.twitter.com/oauth/access_token";
        public static final String AUTHORIZE_URL = "http://api.twitter.com/oauth/authorize";
        public static final String OAUTH_CALLBACK_URL = "http://localhost";
    }

    public static class StoreJSON {

        public static final String TWEET_JSON = "TWEET_JSON";
    }

    public static class Credential {

        public static final String TOKEN = "TOKEN";
        public static final String SECRET = "SECRET";
        public static final String USERNAME = "USERNAME";
        public static final String USER_ID = "USER_ID";
        public static final String EMAIL = "EMAIL";
    }

    public static class Headers {

        public static final String AUTHORIZATION_KEY = "Authorization";
        public static final String HOST_KEY = "Host";
        public static final String HOST_VALUE = "api.twitter.com";
        public static final String CONTENT_TYPE_KEY = "Content-Type";
        public static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded";
        public static final String USER_AGENT_KEY = "User-Agent";
        public static final String USER_AGENT_VALUE = "OAuth gem v0.4.4";
        public static final String ACCEPT_KEY = "Accept";
        public static final String ACCEPT_VALUE = "*/*";

        public static final String TARGET_URI_KEY = "X-Target-URI";
        public static final String TARGET_URI_VALUE = "https://api.twitter.com";
        public static final String KEEP_ALIVE_KEY = "Connection";
        public static final String KEEP_ALIVE_VALUE = "Keep-Alive";
    }
}
