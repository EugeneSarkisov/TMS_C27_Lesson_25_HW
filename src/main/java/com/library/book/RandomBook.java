package com.library.book;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomBook {
    public static File getBook(){
        File books = new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\books");
        Random random = new Random();
        List<File> library = Arrays.asList(books.listFiles());
        return library.get(random.nextInt(library.size()));
    }


}
