package fr.univrouen.rss22.model;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestRSS {
    Resource resource;

    public String loadFileXML(){
        resource = new DefaultResourceLoader().getResource("classpath:item.xml");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()),1024);
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append('\n');
            }

            br.close();
            return stringBuilder.toString();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
}
