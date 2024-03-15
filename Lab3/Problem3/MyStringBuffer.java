/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.Arrays;

/**
 *
 * @author Habiba
 */
public class MyStringBuffer {
    private char[] array;
    
    public MyStringBuffer(String value){
        array = value.toCharArray();
    }
    
    void print(){
        System.out.println(toString());
    }
    
    int indexOf(char c){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }
    
    int length(){
        return array.length;
    }
    
    void erase(int index, int length){
        char[] newArr = new char[array.length - length];
        System.arraycopy(array, 0, newArr, 0, index);
        System.arraycopy(array, index + length, newArr, index, array.length - index - length);
        array = newArr; 
    }
    
    void insert(int index, String str){
        char[] newArr = new char[array.length + str.length()];
        System.arraycopy(array, 0, newArr, 0, index);
        System.arraycopy(str.toCharArray(), 0, newArr, index, str.length());
        System.arraycopy(array, index, newArr, index + str.length(), array.length - index);
        array = newArr;
    }
    @Override
    public String toString() {
        return new String(array);
    }
    
    public static void main(String[] args){
        MyStringBuffer name = new MyStringBuffer("Name");
        System.out.println(name.length());
        name.print();
        MyStringBuffer buffer = new MyStringBuffer("Hello, world!");
        buffer.erase(0,7);
        buffer.insert(0, "Goodbye ");
        buffer.print(); 
    }
}


