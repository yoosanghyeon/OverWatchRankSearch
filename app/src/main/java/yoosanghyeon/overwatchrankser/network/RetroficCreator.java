package yoosanghyeon.overwatchrankser.network;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yoosanghyeon.overwatchrankser.R;
import yoosanghyeon.overwatchrankser.common.OverSearchApplication;
import yoosanghyeon.overwatchrankser.constant.NetworkDefineConstant;

/**
 * Created by Arous on 2017-01-23.
 */

public class RetroficCreator {

    public static Retrofit createRetrofit() {


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().
                readTimeout(15, TimeUnit.MINUTES).
                sslSocketFactory(getSSLConfig(OverSearchApplication.getOverSearchContext()).getSocketFactory()).
                connectTimeout(15, TimeUnit.MINUTES).
                addInterceptor(interceptor).build();


        return new Retrofit.Builder()
                .client(client)
                .baseUrl(NetworkDefineConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }


    private static SSLContext getSSLConfig(Context context) {

        SSLContext sslContext = null;
        try {
            // Loading CAs from an InputStream
            CertificateFactory cf = null;
            cf = CertificateFactory.getInstance("X.509");

            Certificate ca;
            // I'm using Java7. If you used Java6 close it manually with finally.
            try (InputStream cert = context.getResources().openRawResource(R.raw.your_certificate)) {
                ca = cf.generateCertificate(cert);
            }

            // Creating a KeyStore containing our trusted CAs
            String keyStoreType = KeyStore.getDefaultType();
            KeyStore keyStore   = KeyStore.getInstance(keyStoreType);
            keyStore.load(null, null);
            keyStore.setCertificateEntry("ca", ca);

            // Creating a TrustManager that trusts the CAs in our KeyStore.
            String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
            tmf.init(keyStore);

            // Creating an SSLSocketFactory that uses our TrustManager
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, tmf.getTrustManagers(), null);



        }catch (Exception e){

        }
        return sslContext;
    }
}
