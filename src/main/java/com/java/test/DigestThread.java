package com.java.test;

import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestThread  extends Thread{
    private String name;

    DigestThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try (FileInputStream fn = new FileInputStream(name)) {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            DigestInputStream din = new DigestInputStream(fn,sha);

            while (din.read()!= -1);
            din.close();

            byte[] digest = sha.digest();
            StringBuilder s = new StringBuilder(name);
            s.append(":");
            s.append(DatatypeConverter.printHexBinary(digest));
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Thread t = new DigestThread("UF3.txt");
        t.start();


        //System.out.println(new DigestThread("UF3.txt"));
    }

}