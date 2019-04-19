package com.company;

import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;


public class Main {
//
    public static void main(String[] args) throws FileNotFoundException,IOException{


        String vml="";
        String url="https://github.com/sserhanm1a2019_tdd_samy_serhan.git";
            String key="<url>";
        try {
            String fileName = "/Users/farid/Documents/Analyze/jenkins.xml";
            BufferedReader fr = new BufferedReader(new FileReader((fileName)));
            String xml = "";
            String line;
            while ((line = fr.readLine()) != null) {
                //System.out.priﬁntln(xml);
                xml += line;
            }
            if(xml.contains("<url>")){
               vml= xml.substring(0,xml.indexOf("</url>"))+url+xml.substring(xml.indexOf("</url>"));
            }
            System.out.println(vml);
        }catch (FileNotFoundException ex){
            System.out.println("Fichier introuvable");
        }






    }
}
