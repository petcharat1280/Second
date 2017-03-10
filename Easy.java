import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends World
{

    /**
     * Constructor for objects of class Easy.
     * 
     */
    public static int timecounter ;
    public Easy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(41, 41, 15); 
        
        for(int i = 3; i <= 41 ; i++){
            addObject(new grey(), i, 0);
        }for(int i = 0 ; i < 41 ; i ++){
            addObject(new grey(), 0, i);
        }for(int i = 0 ; i < 38  ; i++){
            addObject(new grey(), 41, i);
        }for(int i = 0 ; i <41 ; i++){
            addObject(new grey(), i, 41);
        }for(int i = 1 ; i <=2 ; i++){
            addObject(new grey(), 8, i);
            addObject(new grey(), 12, i);
            addObject(new grey(), 16, i);
            addObject(new grey(), 20, i);
        }for(int i = 1 ; i <=2 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 4 ; i <= 6;i++){
            addObject(new grey(), i, 2);
        }
        addObject(new grey(), 10, 2);addObject(new grey(), 14, 2);
        addObject(new grey(), 18, 2);
        for(int i =  22 ; i <= 26 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 28 ; i <= 40 ; i++){
            addObject(new grey(), i, 2);
        }
        addObject(new returnn(), 40, 0);
        addObject(new restart(), 39, 0);
        //y=3,4
        addObject(new grey(), 4, 3);addObject(new grey(), 10, 3);
        addObject(new grey(), 14, 3); addObject(new grey(), 18, 3);
        addObject(new grey(), 20, 3); addObject(new grey(), 26, 3);
        addObject(new grey(), 36, 3) ;
        for(int i =2 ; i <=10 ; i++){
            addObject(new grey(), i, 4);
        }
        for(int i = 12 ; i <= 24 ; i++){
            addObject(new grey(), i, 4);
        }for(int i = 26 ; i <= 34 ; i++){
            addObject(new grey(), i, 4);
        }addObject(new grey(), 36, 4); addObject(new grey(), 38, 4);
        //y=5,6
        addObject(new grey(), 2, 5);addObject(new grey(), 6, 5);
        addObject(new grey(), 22, 5);addObject(new grey(), 26, 5);
        addObject(new grey(), 32, 5);addObject(new grey(), 38, 5); 
        addObject(new grey(), 2, 6);addObject(new grey(), 4, 6);
        for(int i = 6 ; i <=18 ; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 20, 6);
        for(int i = 22 ; i <= 26 ; i++){
            addObject(new grey(), i, 6);
        }for(int i = 28 ; i <= 30 ; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 32, 6);
        for(int i = 34 ; i <= 38 ; i++){
            addObject(new grey(), i, 6);
        }
        
        //y=7,8
        addObject(new grey(), 2, 7); addObject(new grey(), 4, 7);
        addObject(new grey(), 12, 7); addObject(new grey(), 20, 7);
        addObject(new grey(), 28, 7);addObject(new grey(), 34, 7);
        addObject(new grey(), 38, 7);addObject(new grey(), 2, 8);
        for(int i =4; i <= 10 ; i++){
            addObject(new grey(), i, 8);
        }
        for(int i = 12 ; i <= 16 ; i++){
            addObject(new grey(), i, 8);
        }for(int i = 18 ; i <= 24 ; i++){
            addObject(new grey(), i, 8);
        }for(int i = 26 ; i <= 30 ; i++){
            addObject(new grey(), i, 8);
        }addObject(new grey(), 32, 8);
        for(int i = 34 ; i <= 36 ; i++){
            addObject(new grey(), i, 8);
        }addObject(new grey(), 38, 8);
        
        //y=9,10
        addObject(new grey(), 4, 9);addObject(new grey(), 12, 9);
        addObject(new grey(), 16, 9);addObject(new grey(), 18, 9);
        addObject(new grey(), 24, 9); addObject(new grey(), 30, 9);
        addObject(new grey(), 32, 9);addObject(new grey(), 34, 9);
        addObject(new grey(), 38, 9);
        for(int i = 2 ; i <= 6 ; i++){
            addObject(new grey(), i, 10);
        }for(int i = 8 ; i <= 10 ; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 12, 10);addObject(new grey(), 14, 10);
        for(int i = 16 ; i <= 18 ; i++){
            addObject(new grey(), i, 10);
        } for(int i = 20 ; i <= 22 ; i++){
            addObject(new grey(), i, 10);
        }for(int i = 24 ; i <= 28 ; i++){
            addObject(new grey(), i, 10);
        }for(int i = 30 ; i <= 32 ; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 34, 10);
        for(int i = 36 ; i <= 38 ; i++){
            addObject(new grey(), i, 10);
        }
        //y= 11,12
        addObject(new grey(), 2, 11); addObject(new grey(), 4, 11);
        addObject(new grey(), 8, 11); addObject(new grey(), 12, 11);
        addObject(new grey(), 14, 11);addObject(new grey(), 18, 11);
        addObject(new grey(), 20, 11);addObject(new grey(), 22, 11);
        addObject(new grey(), 28, 11);addObject(new grey(), 32, 11);
        addObject(new grey(), 34, 11);addObject(new grey(), 36, 11);
        addObject(new grey(), 38, 11);addObject(new grey(), 2, 12);
        addObject(new grey(), 4, 12);
        for(int i = 6 ; i <= 8 ; i++){
            addObject(new grey(), i, 12);
        }addObject(new grey(), 10, 12);
        addObject(new grey(), 12, 12);
        for(int i = 14 ; i <= 16 ; i++){
            addObject(new grey(), i, 12);
        }addObject(new grey(), 18, 12);
        addObject(new grey(), 20, 12);
        for(int i = 22 ; i <= 26 ; i++){
            addObject(new grey(), i, 12);
        }for(int i = 28 ; i <= 30 ; i++){
            addObject(new grey(), i, 12);
        }for(int i = 32 ; i <= 34 ; i++){
            addObject(new grey(), i, 12);
        } addObject(new grey(), 36, 12);addObject(new grey(), 38, 12);
        
        //y=13,14
        addObject(new grey(), 4, 13);addObject(new grey(), 8, 13);
        addObject(new grey(), 10, 13);addObject(new grey(), 12, 13);
        addObject(new grey(), 14, 13);addObject(new grey(), 16, 13);
        addObject(new grey(), 18, 13);addObject(new grey(), 20, 13);
        addObject(new grey(), 24, 13);addObject(new grey(), 28, 13);
        addObject(new grey(), 30, 13);addObject(new grey(), 36, 13);
        for(int i =2 ; i <= 6 ; i++){
            addObject(new grey(), i, 14);
        }addObject(new grey(), 8, 14);addObject(new grey(), 10, 14);
        addObject(new grey(), 12, 14);addObject(new grey(), 14, 14);
        addObject(new grey(), 16, 14);addObject(new grey(), 20, 14);
        addObject(new grey(), 18, 14);
        for(int i =22 ; i <= 24 ; i++){
            addObject(new grey(), i, 14);
        }for(int i = 26 ; i <= 28 ; i++){
            addObject(new grey(), i, 14);
        }for(int i = 30 ; i <= 38 ; i++){
            addObject(new grey(), i, 14);
        }
        //y=15,16
        addObject(new grey(), 2, 15);addObject(new grey(), 8, 15);
        addObject(new grey(), 10, 15);addObject(new grey(), 14, 15);
        addObject(new grey(), 16, 15);addObject(new grey(), 20, 15);
        addObject(new grey(), 22, 15);addObject(new grey(), 26, 15);
        addObject(new grey(), 28, 15);addObject(new grey(), 30, 15);
        addObject(new grey(), 32, 15);addObject(new grey(), 38, 15);
        addObject(new grey(), 2, 16);
        for(int i = 4 ; i <= 8 ; i++){
            addObject(new grey(), i, 16);
        }for(int i = 10 ; i <= 14 ; i++){
            addObject(new grey(), i, 16);
        }for(int i = 16 ; i <= 20 ; i++){
            addObject(new grey(), i, 16);
        }addObject(new grey(), 22, 16);
        for(int i = 24 ; i <= 26 ; i++){
            addObject(new grey(), i, 16);
        }
        addObject(new grey(), 28, 16);addObject(new grey(), 30, 16);
        addObject(new grey(), 32, 16);addObject(new grey(), 34, 16);
        for(int i = 36 ;i<=38;i++ ){
            addObject(new grey(), i, 16);
        }
        //y=17,18
        addObject(new grey(), 2, 17);addObject(new grey(), 6, 17);
        addObject(new grey(), 12, 17);addObject(new grey(), 16, 17);
        addObject(new grey(), 22, 17);addObject(new grey(), 28, 17);
        addObject(new grey(), 32, 17);addObject(new grey(), 34, 17);
        addObject(new grey(), 36, 17);
        for(int i = 2 ;i<=4;i++ ){
            addObject(new grey(), i, 18);
        }
        for(int i = 6 ;i<=10;i++ ){
            addObject(new grey(), i, 18);
        }addObject(new grey(), 12, 18);
        for(int i = 14 ;i<=16;i++ ){
            addObject(new grey(), i, 18);
        }addObject(new grey(), 18, 18);addObject(new grey(), 20, 18);
        for(int i = 22 ;i<=30;i++ ){
            addObject(new grey(), i, 18);
        }
        for(int i = 32 ;i<=34;i++ ){
            addObject(new grey(), i, 18);
        }addObject(new grey(), 36, 18);
        for(int i = 38 ;i<=40;i++ ){
            addObject(new grey(), i, 18);
        }
        //19,20
        addObject(new grey(), 4, 19);addObject(new grey(), 8, 19);
        addObject(new grey(), 10, 19);addObject(new grey(), 14, 19);
        addObject(new grey(), 18, 19);addObject(new grey(), 20, 19);
        addObject(new grey(), 26, 19);addObject(new grey(), 30, 19);
        addObject(new grey(), 36, 19);
        for(int i = 2 ;i<=6;i++ ){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 8, 20);
        for(int i = 10 ;i<=14;i++ ){
            addObject(new grey(), i, 20);
        }for(int i = 16 ;i<=18;i++ ){
            addObject(new grey(), i, 20);
        }
        for(int i = 20 ;i<=24;i++ ){
            addObject(new grey(), i, 20);
        }for(int i = 26 ;i<=28;i++ ){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 32, 20);addObject(new grey(), 30, 20);
        for(int i = 34 ;i<=38;i++ ){
            addObject(new grey(), i, 20);
        }
        //y=21,22
        addObject(new grey(), 6, 21);addObject(new grey(), 10, 21);
        addObject(new grey(), 12, 21);addObject(new grey(), 18, 21);
        addObject(new grey(), 20, 21);addObject(new grey(), 24, 21);
        addObject(new grey(), 28, 21);addObject(new grey(), 32, 21);
        addObject(new grey(), 38, 21);
        for(int i = 2 ;i<=4;i++ ){
            addObject(new grey(), i, 22);
        }
        for(int i = 6 ;i<=10;i++ ){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 12, 22);
        for(int i = 14 ;i<=18;i++ ){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 20, 22);addObject(new grey(), 22, 22);
        for(int i = 24 ;i<=26;i++ ){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 28, 22);
        for(int i = 30 ;i<=34;i++ ){
            addObject(new grey(), i, 22);
        }for(int i = 36 ;i<=38;i++ ){
            addObject(new grey(), i, 22);
        }
        //23,24
        addObject(new grey(), 2, 23);addObject(new grey(), 6, 23);
        addObject(new grey(), 12, 23);addObject(new grey(), 14, 23);
        addObject(new grey(), 20, 23);addObject(new grey(), 22, 23);
        addObject(new grey(), 26, 23);addObject(new grey(), 28, 23);
        addObject(new grey(), 32, 23);addObject(new grey(), 34, 23);
        addObject(new grey(), 38, 23);addObject(new grey(), 2, 24);
        for(int i = 4 ;i<=6;i++ ){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 8, 24);addObject(new grey(), 10, 24);
        for(int i = 12 ;i<=14;i++ ){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 16, 24);
        for(int i = 18 ;i<=20;i++ ){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 22, 24);addObject(new grey(), 24, 24);
        addObject(new grey(), 26, 24);
        for(int i = 28 ;i<=30;i++ ){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 32, 24);
        for(int i = 34 ;i<=36;i++ ){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 38, 24);
        //y=25,26
        addObject(new grey(), 2, 25);addObject(new grey(), 6, 25);
        addObject(new grey(), 8, 25);addObject(new grey(), 10, 25);
        addObject(new grey(), 12, 25);addObject(new grey(), 16, 25);
        addObject(new grey(), 20, 25);addObject(new grey(), 22, 25);
        addObject(new grey(), 24, 25);addObject(new grey(), 26, 25);
        addObject(new grey(), 30, 25);addObject(new grey(), 36, 25);
        for(int i = 2 ;i<=4;i++ ){
            addObject(new grey(), i, 26);
        }for(int i = 6 ;i<=8;i++ ){
            addObject(new grey(), i, 26);
        } addObject(new grey(), 10, 26);addObject(new grey(), 12, 26);
        for(int i = 14 ;i<=18;i++ ){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 20, 26);addObject(new grey(), 22, 26);
        addObject(new grey(), 24, 26);
        for(int i = 26 ;i<=28;i++ ){
            addObject(new grey(), i, 26);
        }for(int i = 30 ;i<=34;i++ ){
            addObject(new grey(), i, 26);
        }for(int i = 36 ;i<=40;i++ ){
            addObject(new grey(), i, 26);
        }
        //y=27,28
        addObject(new grey(), 2, 27);addObject(new grey(), 4, 27);
        addObject(new grey(), 8, 27);addObject(new grey(), 10, 27);
        addObject(new grey(), 12, 27);addObject(new grey(), 16, 27);
        addObject(new grey(), 20, 27);addObject(new grey(), 22, 27);
        addObject(new grey(), 24, 27);addObject(new grey(), 26, 27);
        addObject(new grey(), 30, 27);addObject(new grey(), 32, 27);
        addObject(new grey(), 36, 27);addObject(new grey(), 2, 28);
        for(int i = 4 ;i<=6;i++ ){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 8, 28);addObject(new grey(), 10, 28);
        for(int i = 12 ;i<=14;i++ ){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 16, 28);addObject(new grey(), 18, 28);
        for(int i = 20 ;i<=22;i++ ){
            addObject(new grey(), i, 28);
        }for(int i = 24 ;i<=26;i++ ){
            addObject(new grey(), i, 28);
        }for(int i = 28 ;i<=30;i++ ){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 32, 28);
        for(int i = 34 ;i<=36;i++ ){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 38, 28);
        //y=29,30
        addObject(new grey(), 4, 29);addObject(new grey(), 6, 29);
        addObject(new grey(), 10, 29);addObject(new grey(), 14, 29);
        addObject(new grey(), 16, 29);addObject(new grey(), 18, 29);
        addObject(new grey(), 20, 29);addObject(new grey(), 26, 29);
        addObject(new grey(), 30, 29);addObject(new grey(), 36, 29);
        addObject(new grey(), 38, 29);addObject(new grey(), 4, 30);
        for(int i = 0 ;i<=2;i++ ){
            addObject(new grey(), i, 30);
        }for(int i = 6 ;i<=12;i++ ){
            addObject(new grey(), i, 30);
        }for(int i = 14 ;i<=16;i++ ){
            addObject(new grey(), i, 30);
        }addObject(new grey(), 18, 30);addObject(new grey(), 20, 30);
        for(int i = 22 ;i<=24;i++ ){
            addObject(new grey(), i, 30);
        }addObject(new grey(), 26, 30);addObject(new grey(), 28, 30);
        for(int i = 30 ;i<=34;i++ ){
            addObject(new grey(), i, 30);
        }for(int i = 36 ;i<=38;i++ ){
            addObject(new grey(), i, 30);
        }
        //y=31,32
        addObject(new grey(), 2, 31);addObject(new grey(), 8, 31);
        addObject(new grey(), 18, 31);addObject(new grey(), 20, 31);
        addObject(new grey(), 24, 31);addObject(new grey(), 26, 31);
        addObject(new grey(), 28, 31);addObject(new grey(), 32, 31);
        addObject(new grey(), 34, 31);addObject(new grey(), 38, 31);
        for(int i = 2 ;i<=6;i++ ){
            addObject(new grey(), i, 32);
        }for(int i = 8 ;i<=18;i++ ){
            addObject(new grey(), i, 32);
        }
        for(int i = 20 ;i<=22;i++ ){
            addObject(new grey(), i, 32);
        }addObject(new grey(), 24, 32);addObject(new grey(), 26, 32);
        for(int i = 28 ;i<=30;i++ ){
            addObject(new grey(), i, 32);
        }addObject(new grey(), 32, 32);addObject(new grey(), 34, 32);
        addObject(new grey(), 36, 32);addObject(new grey(), 38, 32);
        //y=33,34
        addObject(new grey(), 2, 33);addObject(new grey(), 4, 33);
        addObject(new grey(), 8, 33);addObject(new grey(), 12, 33);
        addObject(new grey(), 20, 33);addObject(new grey(), 18, 33);
        addObject(new grey(), 24, 33);addObject(new grey(), 26, 33);
        addObject(new grey(), 30, 33);addObject(new grey(), 34, 33);
        addObject(new grey(), 36, 33); addObject(new grey(), 24, 34);
        addObject(new grey(), 2, 34);addObject(new grey(), 4, 34);
        for(int i = 6 ;i<=8;i++ ){
            addObject(new grey(), i, 34);
        }  addObject(new grey(), 12, 34); addObject(new grey(), 10, 34);
        for(int i = 14 ;i<=18;i++ ){
            addObject(new grey(), i, 34);
        }addObject(new grey(), 20, 34);addObject(new grey(), 22, 34);
        for(int i = 26 ;i<=34;i++ ){
            addObject(new grey(), i, 34);
        }for(int i = 36 ;i<=40;i++ ){
            addObject(new grey(), i, 34);
        }
        //y=35,36
        addObject(new grey(), 4, 35);addObject(new grey(), 8, 35);
        addObject(new grey(), 10, 35);addObject(new grey(), 12, 35);
        addObject(new grey(), 20, 35);addObject(new grey(), 22, 35);
        addObject(new grey(), 24, 35);addObject(new grey(), 28, 35);
        addObject(new grey(), 32, 35);addObject(new grey(), 36, 35);
        addObject(new grey(), 2, 36);addObject(new grey(), 4, 36);
        addObject(new grey(), 6, 36);
        for(int i = 8 ;i<=10;i++ ){
            addObject(new grey(), i, 36);
        }for(int i = 12 ;i<=20;i++ ){
            addObject(new grey(), i, 36);
        }for(int i = 22 ;i<=26;i++ ){
            addObject(new grey(), i, 36);
        }addObject(new grey(), 28, 36);addObject(new grey(), 32, 36);
        addObject(new grey(), 30, 36);addObject(new grey(), 38, 36);
        for(int i = 34 ;i<=36;i++ ){
            addObject(new grey(), i, 36);
        }
        //y=37,38
        addObject(new grey(), 4, 37);addObject(new grey(), 2, 37);
        addObject(new grey(), 6, 37);addObject(new grey(), 10, 37);
        addObject(new grey(), 12, 37);addObject(new grey(), 16, 37);
        addObject(new grey(), 22, 37);addObject(new grey(), 26, 37);
        addObject(new grey(), 28, 37);addObject(new grey(), 30, 37);
        addObject(new grey(), 32, 37);addObject(new grey(), 36, 37);
        addObject(new grey(), 38, 37);addObject(new grey(), 24, 38);
        for(int i = 2 ;i<=4;i++ ){
            addObject(new grey(), i, 38);
        }for(int i = 6 ;i<=8;i++ ){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 10, 38);addObject(new grey(), 12, 38);
        addObject(new grey(), 14, 38);addObject(new grey(), 16, 38);
        for(int i = 18 ;i<=22;i++ ){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 16, 38);addObject(new grey(), 30, 38);
        for(int i = 26 ;i<=28;i++ ){
            addObject(new grey(), i, 38);
        }for(int i = 32 ;i<=34;i++ ){
            addObject(new grey(), i, 38);
        }for(int i = 36 ;i<=38;i++ ){
            addObject(new grey(), i, 38);
        }
        //y=39,40
        addObject(new grey(), 8, 39);addObject(new grey(), 14, 39);
        addObject(new grey(), 24, 39);
        addObject(new grey(), 34, 39);addObject(new grey(), 30, 39);
        
        
        timecounter = 180000;
        addObject(new player(), 1, 1);
        addObject(new flag(), 40, 39);
    }
    public void act(){
         //Time
         
        for(int i = 30 ; i > 0; i--){
            showText("time : " + (int)(timecounter/2000),30,0);
            
            if(timecounter == 0){
                Greenfoot.setWorld(new EndScore());
            }
            timecounter--;
        }
    
    }
}
