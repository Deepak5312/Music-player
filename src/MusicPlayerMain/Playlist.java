/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayerMain;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Monika
 */
public class Playlist {
     final ArrayList<String> id;
     final ArrayList<String> img;

    public Playlist() {
        this.id = new ArrayList();
        this.img = new ArrayList();
        //1
        id.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Music\\Alan Walker - Faded.snd");
        img.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Images\\Faded.jpg");
        //2
        id.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Music\\Backstreet Boys - I want it that way.snd");
        img.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Images\\backstreet boys.jpg");
        //3
        id.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Music\\Charlie Puth - We don't talk Anymore.snd");
        img.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Images\\we don't talk anymore.jpg");
        //4
        id.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Music\\Chris Brown - Under The Influence.snd");
        img.add("C:\\Users\\Monika\\Documents\\NetBeansProjects\\MusicPlayer\\src\\Images\\under the infuence.jpg");
    }
    
    public String FileAdd(int j){
        return id.get(j);
    }
    
    public String GetName(int i){
        File f = new File(id.get(i));
        String name = f.getName();
        return name.substring(0, name.length()-4);
    }
    
    public String GetImage(int k){
        return img.get(k);
    }
}
