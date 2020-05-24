// Java program to ReverseString using ByteArray. 
import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
//Sanju
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "sanju";
  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println("Sanju Conflict" + new String(result));
    } 
} 
