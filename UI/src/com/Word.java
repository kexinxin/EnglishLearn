/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import javax.swing.ImageIcon;

/**
 *
 * @author sadas
 */
public class Word {
    public String word;
    ImageIcon down;
    ImageIcon up;
    ImageIcon down_yes;
    ImageIcon down_no;
    ImageIcon mean;
    ImageIcon pic;
    ImageIcon seg;
    Word(String w,ImageIcon d,ImageIcon d_n,ImageIcon d_y,ImageIcon m,ImageIcon p,ImageIcon s,ImageIcon u){
        word=w;
        down=d;
        up=u;
        down_yes=d_y;
        down_no=d_n;
        mean=m;
        pic=p;
        seg=s;
    }
    Word(){
    }
}
