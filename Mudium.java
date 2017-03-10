import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mudium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mudium extends World
{

    /**
     * Constructor for objects of class Mudium.
     * 
     */
    public Mudium()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(41, 41, 15); 
        for(int i = 0 ; i <= 41 ; i++){
            addObject(new grey(), i, 0);
        }
        for(int i = 0 ; i <= 37 ; i++){
            addObject(new grey(), 41, i);
        }
        for(int i = 0 ; i <= 30 ; i++){
            addObject(new grey(), 0, i);
        }
        for(int i = 33 ; i <= 41 ; i++){
            addObject(new grey(), 0, i);
        }
        for(int i = 0 ; i <= 38 ; i++){
            addObject(new grey(), i, 41);
        }
        //y = 1,2
        addObject(new grey(), 10, 1);addObject(new grey(), 36, 1);
        for(int i =2 ; i <= 10 ; i++ ){
            addObject(new grey(), i, 2);
        }for(int i = 12 ; i <= 18 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 20 ; i <= 34 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 36 ; i <= 38; i++){
            addObject(new grey(), i, 2);
        }
        addObject(new returnn(), 40, 0);
        addObject(new restart(), 39, 0);
        //y = 3,4
        addObject(new grey(), 12, 3);addObject(new grey(), 18, 3);
        addObject(new grey(), 34, 3);addObject(new grey(), 38, 3);
        for(int i = 2 ; i <= 16; i++){
            addObject(new grey(), i, 4);
        }for(int i = 18 ; i <= 32; i++){
            addObject(new grey(), i, 4);
        }for(int i = 34 ; i <= 36; i++){
            addObject(new grey(), i, 4);
        }addObject(new grey(), 38, 4);
        //y = 5,6
        addObject(new grey(), 2, 5);addObject(new grey(), 16, 5);
        addObject(new grey(), 24, 5);addObject(new grey(), 28, 5);
        addObject(new grey(), 34, 5);addObject(new grey(), 36, 5);
        addObject(new grey(), 38, 5);addObject(new grey(), 4, 6);
        addObject(new grey(), 2, 6);addObject(new grey(), 28, 6);
        for(int i = 6 ; i <= 14; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 16, 6);addObject(new grey(), 18, 6);
        for(int i = 20 ; i <= 22; i++){
            addObject(new grey(), i, 6);
        }for(int i = 24 ; i <= 26; i++){
            addObject(new grey(), i, 6);
        }for(int i = 30 ; i <= 34; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 36, 6);addObject(new grey(), 38, 6);
        //y = 7 , 8
        addObject(new grey(), 2, 7);addObject(new grey(), 4, 7);
        addObject(new grey(), 6, 7);addObject(new grey(), 14, 7);
        addObject(new grey(), 16, 7);addObject(new grey(), 18, 7);
        addObject(new grey(), 20, 7);addObject(new grey(), 22, 7);
        addObject(new grey(), 28, 7);addObject(new grey(), 30, 7);
        addObject(new grey(), 36, 7);
        addObject(new grey(), 2, 8);addObject(new grey(), 8, 8);
        addObject(new grey(), 4, 8);addObject(new grey(), 6, 8);
        for(int i = 10 ; i <= 14; i++){
            addObject(new grey(), i, 8);
        }addObject(new grey(), 16, 8);addObject(new grey(), 18, 8);
        addObject(new grey(), 20, 8);
        for(int i = 22 ; i <= 26; i++){
            addObject(new grey(), i, 8);
        }addObject(new grey(), 28, 8);addObject(new grey(), 30, 8);
        for(int i = 32 ; i <= 38; i++){
            addObject(new grey(), i, 8);
        }
        //y = 9,10
        addObject(new grey(), 2, 9);addObject(new grey(), 4, 9);
        addObject(new grey(), 6, 9);addObject(new grey(), 8, 9);
        addObject(new grey(), 16, 9);addObject(new grey(), 18, 9);
        addObject(new grey(), 20, 9);addObject(new grey(), 28, 9);
        addObject(new grey(), 30, 9);
        for(int i = 2 ; i <= 4; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 6, 10);
        for(int i = 8 ; i <= 12; i++){
            addObject(new grey(), i, 10);
        }for(int i = 14 ; i <= 16; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 18, 10);
        for(int i = 20 ; i <= 28; i++){
            addObject(new grey(), i, 10);
        }for(int i = 30 ; i <= 40; i++){
            addObject(new grey(), i, 10);
        }
        //y = 11,12
         addObject(new grey(), 2, 11); addObject(new grey(), 12, 11);
         addObject(new grey(), 6, 11);addObject(new grey(), 8, 11);
         addObject(new grey(), 14, 11);addObject(new grey(), 18, 11);
         addObject(new grey(), 28, 11);addObject(new grey(), 14, 12);
         addObject(new grey(), 2, 12);
         for(int i = 4 ; i <= 8; i++){
            addObject(new grey(), i, 12);
        }addObject(new grey(), 10, 12);addObject(new grey(), 12, 12);
        for(int i = 16 ; i <= 26; i++){
            addObject(new grey(), i, 12);
        }for(int i = 28 ; i <= 38; i++){
            addObject(new grey(), i, 12);
        }
        //y = 13,14
         addObject(new grey(), 2, 13); addObject(new grey(), 10, 13);
         addObject(new grey(), 12, 13);addObject(new grey(), 14, 13);
         addObject(new grey(), 24, 13); addObject(new grey(), 26, 13);
         addObject(new grey(), 32, 13);addObject(new grey(), 38, 13);
         addObject(new grey(), 2, 14);
         for(int i = 4 ; i <= 10; i++){
            addObject(new grey(), i, 14);
        }addObject(new grey(), 12, 14);
         for(int i = 14 ; i <= 22; i++){
            addObject(new grey(), i, 14);
        }addObject(new grey(), 24, 14);
        for(int i = 26 ; i <= 28; i++){
            addObject(new grey(), i, 14);
        }addObject(new grey(), 30, 14);addObject(new grey(), 32, 14);
        for(int i = 34 ; i <= 38; i++){
            addObject(new grey(), i, 14);
        }
        //y= 15,16
        addObject(new grey(), 2, 15); addObject(new grey(), 4, 15);
         addObject(new grey(), 6, 15);addObject(new grey(), 12, 15);
         addObject(new grey(), 22, 15); addObject(new grey(), 24, 15);
         addObject(new grey(), 28, 15);addObject(new grey(), 30, 15);
         addObject(new grey(), 32, 15);addObject(new grey(), 34, 15);
          addObject(new grey(), 2, 16); addObject(new grey(), 4, 16);
         addObject(new grey(), 6, 16);addObject(new grey(), 14, 15);
         for(int i = 8 ; i <= 12; i++){
            addObject(new grey(), i, 16);
        } addObject(new grey(), 14, 16); addObject(new grey(), 16, 16);
         for(int i = 18 ; i <= 22; i++){
            addObject(new grey(), i, 16);
        }  for(int i = 24 ; i <= 26; i++){
            addObject(new grey(), i, 16);
        } addObject(new grey(), 28, 16); addObject(new grey(), 30, 16);
        addObject(new grey(), 32, 16); addObject(new grey(), 34, 16);
           for(int i = 36 ; i <= 38; i++){
            addObject(new grey(), i, 16);
        }
        //y = 17,18
        addObject(new grey(), 2, 17); addObject(new grey(), 4, 17);
        addObject(new grey(), 6, 17);addObject(new grey(), 8, 17);
        addObject(new grey(), 12, 17); addObject(new grey(), 14, 17);
        addObject(new grey(), 28, 17); addObject(new grey(), 30, 17);
        addObject(new grey(), 34, 17);addObject(new grey(), 18, 17);
        addObject(new grey(), 36, 17); addObject(new grey(), 38, 17);
        addObject(new grey(), 2, 18); addObject(new grey(), 4, 18);
        addObject(new grey(), 6, 18);addObject(new grey(), 8, 18);
        addObject(new grey(), 12, 18); addObject(new grey(), 10, 18);
        addObject(new grey(), 14, 18);addObject(new grey(), 16, 18);
        addObject(new grey(), 18, 18); addObject(new grey(), 16, 17);
         for(int i = 20 ; i <= 28; i++){
            addObject(new grey(), i, 18);
        }for(int i = 30 ; i <= 34; i++){
            addObject(new grey(), i, 18);
        } addObject(new grey(), 36, 18);addObject(new grey(), 38, 18);
        //y = 19,20
        addObject(new grey(), 2, 19); addObject(new grey(), 4, 19);
        addObject(new grey(), 6, 19);addObject(new grey(), 8, 19);
        addObject(new grey(), 10, 19); addObject(new grey(), 12, 19);
        addObject(new grey(), 14, 19);addObject(new grey(), 16, 19);
        addObject(new grey(), 18, 19); addObject(new grey(), 20, 19);
        addObject(new grey(), 30, 19);addObject(new grey(), 36, 19);
        addObject(new grey(), 38, 19); addObject(new grey(), 2, 20);
        addObject(new grey(), 4, 20);addObject(new grey(), 6, 20);
        for(int i = 8 ; i <= 10; i++){
            addObject(new grey(), i, 20);
        } addObject(new grey(), 12, 20);addObject(new grey(), 14, 20);
        for(int i = 16 ; i <= 18; i++){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 20, 20);
        for(int i = 22 ; i <= 30; i++){
            addObject(new grey(), i, 20);
        }for(int i = 32 ; i <= 36; i++){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 38, 20);
        //y = 21,22
        addObject(new grey(), 2, 21); addObject(new grey(), 4, 21);
        addObject(new grey(), 6, 21);addObject(new grey(), 8, 21);
         addObject(new grey(), 12, 21);
        addObject(new grey(), 14, 21); addObject(new grey(), 20, 21);
        addObject(new grey(), 30, 21); addObject(new grey(), 32, 21);
        addObject(new grey(), 38, 21);
        addObject(new grey(), 2, 22); addObject(new grey(), 4, 22);
        addObject(new grey(), 6, 22);addObject(new grey(), 8, 22);
         for(int i = 10 ; i <= 12; i++){
            addObject(new grey(), i, 22);
        }for(int i = 14 ; i <= 28; i++){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 30, 22); addObject(new grey(), 32, 22);
        addObject(new grey(), 34, 22);
        for(int i = 36 ; i <= 38; i++){
            addObject(new grey(), i, 22);
        }
        //y = 23,24
        addObject(new grey(), 2, 23); addObject(new grey(), 4, 23);
        addObject(new grey(), 6, 23);addObject(new grey(), 8, 23);
        addObject(new grey(), 30, 23); addObject(new grey(), 32, 23);
        addObject(new grey(), 34, 23);
        addObject(new grey(), 2, 24); addObject(new grey(), 4, 24);
        addObject(new grey(), 6, 24);addObject(new grey(), 8, 24);
        for(int i = 10 ; i <= 30; i++){
            addObject(new grey(), i, 24);
        }addObject(new grey(), 32, 24); 
         for(int i = 34 ; i <= 40; i++){
            addObject(new grey(), i, 24);
        }
        //y = 25 , 26
         addObject(new grey(), 2, 25); addObject(new grey(), 6, 25);
        addObject(new grey(), 8, 25);addObject(new grey(), 12, 25);
        addObject(new grey(), 16, 25); addObject(new grey(), 30, 25);
        addObject(new grey(), 32, 25); addObject(new grey(), 34, 25);
        addObject(new grey(), 38, 25);
        for(int i = 2 ; i <= 4; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 6, 26);
         for(int i = 8 ; i <= 12; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 14, 26);addObject(new grey(), 16, 26);
        for(int i = 18 ; i <= 28; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 30, 26);addObject(new grey(), 32, 26);
        addObject(new grey(), 34, 26);addObject(new grey(), 36, 26);
        addObject(new grey(), 38, 26);
        // y = 27,28
        addObject(new grey(), 2, 27);addObject(new grey(), 6, 27);
        addObject(new grey(), 8, 27); addObject(new grey(), 14, 27);
        addObject(new grey(), 18, 27);addObject(new grey(), 38, 28);
         addObject(new grey(), 32, 27); addObject(new grey(), 34, 27);
        addObject(new grey(), 38, 27);addObject(new grey(), 36, 27);
        for(int i = 2 ; i <= 6; i++){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 8, 28); 
        for(int i = 10 ; i <= 32; i++){
            addObject(new grey(), i, 28);
        }addObject(new grey(), 34, 28);addObject(new grey(), 36, 28);
        //y=29,30
         addObject(new grey(), 6, 29);addObject(new grey(), 8, 29);
        addObject(new grey(), 16, 29);addObject(new grey(), 32, 29);
        addObject(new grey(), 34, 29);addObject(new grey(), 36, 29);
        for(int i = 0 ; i <= 4; i++){
            addObject(new grey(), i, 30);
        } addObject(new grey(), 6, 30);
         for(int i = 8 ; i <= 14; i++){
            addObject(new grey(), i, 30);
        }addObject(new grey(), 16, 30);addObject(new grey(), 32, 30);
        addObject(new grey(), 34, 30);addObject(new grey(), 36, 30);
        for(int i = 18 ; i <= 30; i++){
            addObject(new grey(), i, 30);
        }for(int i = 36 ; i <= 40; i++){
            addObject(new grey(), i, 30);
        }
        //y=31,32
        addObject(new grey(), 4, 31);addObject(new grey(), 6, 31);
        addObject(new grey(), 8, 31);addObject(new grey(), 16, 31);
        addObject(new grey(), 18, 31);addObject(new grey(), 34, 31);
        addObject(new grey(), 32, 31);addObject(new grey(), 2, 32);
        addObject(new grey(), 4, 32);addObject(new grey(), 6, 32);
        addObject(new grey(), 8, 32);addObject(new grey(), 10, 32);
        for(int i = 12 ; i <= 16; i++){
            addObject(new grey(), i, 32);
        }addObject(new grey(), 18, 32);
        for(int i = 20 ; i <= 32; i++){
            addObject(new grey(), i, 32);
        }for(int i = 34 ; i <= 38; i++){
            addObject(new grey(), i, 32);
        }
        //y = 33,34
        addObject(new grey(), 2, 33);addObject(new grey(), 4, 33);
        addObject(new grey(), 6, 33);addObject(new grey(), 8, 33);
        addObject(new grey(), 10, 33);addObject(new grey(), 12, 33);
        addObject(new grey(), 18, 33);addObject(new grey(), 20, 33);
        addObject(new grey(), 28, 33);addObject(new grey(), 34, 33);
        addObject(new grey(), 2, 34);addObject(new grey(), 4, 34);
        addObject(new grey(), 6, 34);addObject(new grey(), 8, 34);
        addObject(new grey(), 10, 34);addObject(new grey(), 12, 34);
        for(int i = 14 ; i <= 18; i++){
            addObject(new grey(), i, 34);
        }addObject(new grey(), 20, 34);addObject(new grey(), 22, 34);
        for(int i = 24 ; i <= 28; i++){
            addObject(new grey(), i, 34);
        }for(int i = 30 ; i <= 34; i++){
            addObject(new grey(), i, 34);
        }for(int i = 36 ; i <= 38; i++){
            addObject(new grey(), i, 34);
        }
        //y = 35,36
        addObject(new grey(), 2, 35);addObject(new grey(), 4, 35);
        addObject(new grey(), 8, 35);addObject(new grey(), 18, 35);
        addObject(new grey(), 10, 35);addObject(new grey(), 12, 35);
        addObject(new grey(), 20, 35);addObject(new grey(), 22, 35);
        addObject(new grey(), 36, 35);addObject(new grey(), 4, 36);
        addObject(new grey(), 2, 36);addObject(new grey(), 18, 36);
        for(int i = 12 ; i <= 16; i++){
            addObject(new grey(), i, 36);
        }addObject(new grey(), 10, 36);
        for(int i = 6 ; i <= 8; i++){
            addObject(new grey(), i, 36);
        }for(int i = 20 ; i <= 40; i++){
            addObject(new grey(), i, 36);
        }
        //y = 37,38
        addObject(new grey(), 2, 37);addObject(new grey(), 4, 37);
        addObject(new grey(), 6, 37);addObject(new grey(), 10, 37);
        addObject(new grey(), 16, 37);addObject(new grey(), 18, 37);
        addObject(new grey(), 24, 37);
        for(int i = 2 ; i <= 4; i++){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 6, 38);
        for(int i = 8 ; i <= 16; i++){
            addObject(new grey(), i, 38);
        }for(int i = 18 ; i <= 22; i++){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 24, 38);
        for(int i = 26 ; i <= 38; i++){
            addObject(new grey(), i, 38);
        }
        addObject(new grey(), 22, 39);addObject(new grey(), 38, 39);
        addObject(new grey(), 6, 39);
        
        timecounter = 180000;
        addObject(new player(), 0, 32);
        addObject(new flag(), 40, 39);
    }
     public static int timecounter ;
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
