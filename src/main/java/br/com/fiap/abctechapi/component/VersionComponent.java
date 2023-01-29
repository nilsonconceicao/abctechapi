package br.com.fiap.abctechapi.component;


import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class VersionComponent {

    private Properties properties;
    public VersionComponent(){
        this.properties = new Properties();

        try{
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.yml");
            properties.load(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public String getName(){
        return properties.getProperty("build.name");
    }


    public String getVersion(){

        return properties.getProperty("build.version");
    }

    public String getNameVersion(){
        return getName() + " - " + getVersion();
    }


}
