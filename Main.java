/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmodul9;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.info();
        kucing.suara();
        
        anjing.info();
        anjing.suara();
        
    }
}

