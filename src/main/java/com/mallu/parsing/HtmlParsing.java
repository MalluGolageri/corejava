package com.mallu.parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by golagem on 7/12/17.
 */
public class HtmlParsing {
    public static void main(String... args){
        Document doc=null;
        try{
         doc=Jsoup.parse(new File("/Users/golagem/Desktop/cache.txt"), "UTF-8");
        }catch (Exception e){}
        System.out.println(doc.title());
        Element element=doc.getElementById("caches_0");

        Elements elements=element.getElementsByTag("table");
        System.out.println(elements);

    }
}
