package br.com.configuracao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

@Component
@PropertySource("classpath:application.properties")
public class RetrofitConfig implements FactoryBean<Retrofit>, InitializingBean, DisposableBean {

    @Value("${api}")
    private String api;

    private Retrofit retrofit;

    @Override
    public void afterPropertiesSet() throws Exception {
        retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Override
    public Retrofit getObject() throws Exception {
        return retrofit;
    }

    @Override
    public Class<?> getObjectType() {
        return Retrofit.class;
    }

    @Override
    public void destroy() throws Exception {

    }

}
