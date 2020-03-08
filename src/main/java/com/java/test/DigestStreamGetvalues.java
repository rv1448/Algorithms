package com.java.test;

import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class DigestStreamGetvalues extends Thread {

    String name;
    byte[] digest;

    DigestStreamGetvalues(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try (FileInputStream fin = new FileInputStream(name)) {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            DigestInputStream din = new DigestInputStream(fin,sha);
            while(din.read() != -1);
            din.close();
            digest = sha.digest();
        }
        catch (Exception e){

        }
    }

    public byte[] getDigest(){
        return digest;
    }

}

class Test{

    public static void main(String[] args) throws InterruptedException {

            String name = "UF.txt";
            DigestStreamGetvalues t = new DigestStreamGetvalues(name);
            t.start();
//            t.sleep(50);
            int i = 0;
             while (true){
                 byte[] b = t.getDigest();
                 System.out.println(i++);
                 if(b != null) {
                     StringBuilder ss = new StringBuilder(name);
                    ss.append(":");
                    ss.append(DatatypeConverter.printHexBinary(t.getDigest()));
                    System.out.println(ss);
                     break;
                }
             }


    }

}
