package com.marklogic.community;

import java.util.Random;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class thing {

    static Random gen = new Random();

    String name;
    int age;
    int id;
 
    public String getName() {
        return name;
    }
 
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
 
    public int getId() {
        return id;
    }
 
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    static public thing random() {
        thing t = new thing();
        t.age = gen.nextInt();
        t.id = gen.nextInt();
        t.name = "" + gen.nextInt();
        return t;
    }
}
