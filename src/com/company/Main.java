package com.company;

import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;


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




//demander à l'utilisateur de le customiser voir parsseur xml



    /* lire un fichier xml jusqu'a <hudson.plugins.git.UserRemoteConfig> puis apres demander
      * à l'utilisateur quel est son git son repository et sa branche et remplie le reste du fichier
        * en ajoutant les info au fichier Jenkins.xml  */


            String file="/Users/farid/Documents/Analyze/jen.xml";
            BufferedReader fr= new BufferedReader(new FileReader((file)));
            String yml="";
            String lin;
            while ((lin=fr.readLine())!=null){
                yml+=lin+" ";
            }
            System.out.println("Quel est votre login GitHub?");
            String a;
            Scanner S=new Scanner(System.in);
            a=S.nextLine();
            System.out.println("Quel est votre repository?");
            String b;
            Scanner S=new Scanner(System.in);
            b=S.nextLine();
            System.out.println("Quel est votre branch?");
            String c;
            Scanner S=new Scanner(System.in);
            c=S.nextLine();
            String url="<url>https://github.com/"+a+b+"</url></hudson.plugins.git.UserRemoteConfig>\n" +
                    "     </userRemoteConfigs>\n" +
                    "     <branches>\n" +
                    "       <hudson.plugins.git.BranchSpec><name>*/"+c+"</name>\n" +
                    "       </hudson.plugins.git.BranchSpec>\n" +
                    "     </branches>\n" +
                    "     <doGenerateSubmoduleConfigurations>false</doGenerateSubmoduleConfigurations>\n" +
                    "     <submoduleCfg class=\"list\"/>\n" +
                    "     <extensions/>\n" +
                    "   </scm>\n" +
                    "   <scriptPath>Jenkinsfile</scriptPath>\n" +
                    "   <lightweight>true</lightweight>\n" +
                    " </definition>\n" +
                    " <triggers/>\n" +
                    " <disabled>false</disabled>\n" +
                    "</flow-definition>";
             xml=+url;





        }catch (FileNotFoundException ex){
            System.out.println("Fichier introuvable");
        }







    }
}
