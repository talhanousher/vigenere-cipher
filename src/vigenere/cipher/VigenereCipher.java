/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere.cipher;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class VigenereCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text : ");
        String str = sc.next();
        //Encryption 
        String key = "banana";
        StringBuffer encryptedStr = new StringBuffer();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch;
            if (Character.isLowerCase(str.charAt(i))) {
                ch = (char) (((int) ((str.charAt(i) + (int)(key.charAt(j)-97) - 97) % 26) + 97));
                j++;
                j = j % key.length();
            } else {
                ch = (char) (((int) ((str.charAt(i) + (int)(key.charAt(j)-97) - 97) % 26) + 97));
                j++;
                j = j % key.length();
            }
            encryptedStr.append(ch);
        }
        System.out.println("Encrypted Text : " + encryptedStr);
        
    }

}
