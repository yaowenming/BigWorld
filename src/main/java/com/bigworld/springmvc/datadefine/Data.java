package com.bigworld.springmvc.datadefine;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ：ywm
 * @date ：Created in 2020/8/7 16:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Data {
    private Content content;
    public List<Data> relatednesses = new ArrayList<>();

    public Data(Content content) {
        this.content = content;
    }

    public void addRelation(Data... data) {
        for(int i=0;i<data.length;i++){
            relatednesses.add(data[i]);
        }

    }

    private String print() {
        StringBuffer stringBuffer = new StringBuffer();
        relatednesses.stream().forEach(x->stringBuffer.append(x.toString()));
        return stringBuffer.toString();
    }

    @Override
    public String toString() {
        if(relatednesses.size()<=0){
            return "Data{" +
                    "content=" + content.printSelf() +
                    '}';
        }
        return "Data{" +
                "content=" + content.printSelf() +
                ", relatednesses=" +print() +
                '}';
    }
}
