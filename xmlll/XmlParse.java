package com.heima.xmlll;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader=new SAXReader();
        Document document=reader.read((new File("myIdeaTest\\src\\com\\STUDENT.xml")));

        Element rootElement = document.getRootElement();

        List elements = rootElement.elements();
        System.out.println(elements.size());

        ArrayList<Student> list = new ArrayList<Student>();

//        带参数的elements
        List<Element> studentElements1 = rootElement.elements("student");
        for (Element element : studentElements1) {
            Attribute id = element.attribute("id");
            String value = id.getValue();

            Element name = element.element("name");
            String text = name.getText();

            Element age = element.element("age");
            String text1 = age.getText();

            System.out.println(id);
            System.out.println(text);
            System.out.println(text1);


            Student student = new Student(value,text, Integer.parseInt(text1));
            list.add(student);
                    }
        for (Student student : list) {
            System.out.println(student);
        }


    }
}
