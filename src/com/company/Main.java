package com.company;

import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.nio.file.Path;


public class Main {
//
    public static void main(String[] args) throws FileNotFoundException,IOException{
        try{
            String fileName="/Users/farid/Documents/Analyze/jenkins.xml";
            BufferedReader fr= new BufferedReader(new FileReader((fileName)));
            String xml="";
            String line;
            while((line=fr.readLine())!=null){
                //System.out.priﬁntln(xml);
                xml+=line+" ";
            }
                System.out.println(xml);
            /*InputStream myStream=new FileInputStream("/Users/farid/Documents/Analyze/jenkins.xml");
            String my= IOUtils.toString(myStream);*/

        }catch (FileNotFoundException ex){
            System.out.println("Fichier introuvable");
        }


//demander à l'utilisateur de le customiser voir parsseur xml





    }
}
