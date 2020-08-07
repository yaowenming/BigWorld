package com.bigworld.springmvc;

import com.bigworld.springmvc.Utils.Print;
import com.bigworld.springmvc.datadefine.Data;
import com.bigworld.springmvc.tree.Persion;
import com.bigworld.springmvc.tree.Tree;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringmvcApplicationTests {

    @Test
    void contextLoads() {
        Persion persion = new Persion();
        persion.setName("yao1");
        persion.setPassword("123");
        Persion persion1 = new Persion();
        persion1.setName("yao2");
        persion1.setPassword("456");
        Persion persion2 = new Persion();
        persion2.setName("yao3");
        persion2.setPassword("789");
        Data data2 = new Data(persion2);
        Data data = new Data(persion);
        Data data1 = new Data(persion1);
        data.addRelation(data1,data2);
        data1.addRelation(data2);
        System.out.println(data);
        System.out.println(data1);
        //List<Data> relatednesses = data.relatednesses;
        //System.out.println(relatednesses.toString());


    }

}
