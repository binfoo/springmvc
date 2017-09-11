package com.binfoo.www.prop;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("ALL")
public class PropertiesTest {

    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PropertiesTest.class);

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();



        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\binfoo\\IdeaProjects\\springmvc\\src\\main\\resources\\a.properties"));
        properties.load(fileInputStream);

//        String name = properties.getProperty("name");

//        if("binfoo".equals(name)){
//            System.out.println(true);
//        }


//        String[] strs = new String[]{"1","2"};


        List list = new ArrayList(2);
        list.add("1");
        list.add("2");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if ("1".equals(temp)) {
                it.remove();
            }
        }

        System.out.println(list.get(0));


//        System.out.println(list.get(0));
//        System.out.println(name);

        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp : a) {
            if ("1".equals(temp))
            { a.remove(temp);
            }
        }

        System.out.println(a.get(0));

        System.out.println(Instant.now());

        System.out.println(LocalDateTime.now());
        System.out.println( );
    }
}