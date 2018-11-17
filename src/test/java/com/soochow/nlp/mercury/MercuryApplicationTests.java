package com.soochow.nlp.mercury;

import com.soochow.nlp.mercury.mapper.TaMapper;
import com.soochow.nlp.mercury.model.Ta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MercuryApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TaMapper taMapper;

    @Test
    public void contextLoads() {
        Ta ta = new Ta();
        ta.setName("abcd");
        System.out.println(taMapper.insert(ta));
        System.out.println(taMapper.selectAll());
    }

}
