package org.example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class Main {
    public static String getEncrypt(String password) throws Exception {
        try {
            MessageDigest md =  MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password to Encrypt := ");
        String password = sc.nextLine();


        System.out.println("Encrypted password := " + getEncrypt(password));
        System.out.println("Encrypted password := " + getEncrypt(password));
    }
}