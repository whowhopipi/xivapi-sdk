package cn.ruihusoft.xviapi;

import cn.ruihusoft.xviapi.core.SSLSocketClient;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import okhttp3.OkHttpClient;

public class AbstractTest {

    private feign.okhttp.OkHttpClient createOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .sslSocketFactory(SSLSocketClient.getSSLSocketFactory(), SSLSocketClient.getX509TrustManager())
                .hostnameVerifier(SSLSocketClient.getHostnameVerifier())
                .build();

        return new feign.okhttp.OkHttpClient(okHttpClient);
    }

    public <T> T createApi(Class<T> clazz, String url) {
        return Feign.builder()
                .client(createOkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(clazz))
                .logLevel(Logger.Level.FULL)
                .target(clazz, url);
    }

    public <T> T createApi(Class<T> clazz) {
        return createApi(clazz,"https://xivapi.com/");
    }
}
