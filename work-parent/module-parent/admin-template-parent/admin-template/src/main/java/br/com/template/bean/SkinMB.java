package br.com.template.bean;

import static br.com.context.util.Assert.has;
import br.com.template.config.AdminConfig;

import javax.annotation.PostConstruct;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by rmpestano on 07/01/17.
 */
@Component
@Scope("session")
public class SkinMB implements Serializable {

    private String skin;

    @Autowired
    private AdminConfig adminConfig;

    @PostConstruct
    public void init() {
        skin = adminConfig.getSkin();
        if (!has(skin)) {
            skin = "skin-blue";
        }
    }

    public void changeSkin(String skin) {
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
}
