import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends World
{

    /**
     * Constructor for objects of class Hard.
     * 
     */
    public Hard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(41, 41, 15); 
        for(int i  = 0 ; i <= 41 ; i++){
            addObject(new grey(), 0, i);
            addObject(new grey(), i, 41);
        }
        for(int i = 0 ; i <= 32 ; i++){
            addObject(new grey(), 41, i);
        }
        for(int i = 36 ; i <= 41 ; i++){
            addObject(new grey(), 41, i);
        }
        for(int i = 0 ; i <= 2 ; i++){
            addObject(new grey(), i, 0);
        }
        for(int i = 6 ; i <= 41 ; i++){
            addObject(new grey(), i, 0);
        }
        //y = 1,2
        addObject(new grey(), 6, 1);addObject(new grey(), 12, 1);
        addObject(new grey(), 22, 1);addObject(new grey(), 32, 1);
        for(int i = 2 ; i <= 6 ; i++){
            addObject(new grey(), i, 2);
        } addObject(new grey(), 8, 2); addObject(new grey(), 10, 2);
        for(int i = 12 ; i <= 14 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 16 ; i <= 18 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 20 ; i <= 22 ; i++){
            addObject(new grey(), i, 2);
        }for(int i = 24 ; i <= 28 ; i++){
            addObject(new grey(), i, 2);
        }addObject(new grey(), 30, 2); addObject(new grey(), 32, 2);
        for(int i = 34 ; i <= 36 ; i++){
            addObject(new grey(), i, 2);
        }addObject(new grey(), 38, 2);
        addObject(new returnn(), 40, 0);
        addObject(new restart(), 39, 0);
        //y = 3,4
        addObject(new grey(), 8, 3); addObject(new grey(), 10, 3);
        addObject(new grey(), 16, 3); addObject(new grey(), 18, 3);
        addObject(new grey(), 20, 3); addObject(new grey(), 28, 3);
        addObject(new grey(), 30, 3); addObject(new grey(), 32, 3); 
        addObject(new grey(), 34, 3); addObject(new grey(), 38, 3); 
        for(int i = 2 ; i <= 8 ; i++){
            addObject(new grey(), i, 4);
        }for(int i = 10 ; i <= 16 ; i++){
            addObject(new grey(), i, 4);
        }addObject(new grey(), 18, 4);addObject(new grey(), 20, 4);
        for(int i = 22 ; i <= 26 ; i++){
            addObject(new grey(), i, 4);
        }addObject(new grey(), 28, 4);addObject(new grey(), 30, 4);
        addObject(new grey(), 32, 4);addObject(new grey(), 34, 4);
        for(int i = 36 ; i <= 38 ; i++){
            addObject(new grey(), i, 4);
        }
        //y = 5,6
        addObject(new grey(), 2, 5);addObject(new grey(), 10, 5);
        addObject(new grey(), 20, 5);addObject(new grey(), 22, 5);
        addObject(new grey(), 26, 5);addObject(new grey(), 28, 5);
        addObject(new grey(), 30, 5);addObject(new grey(), 32, 5);
        addObject(new grey(), 34, 5);addObject(new grey(), 36, 5);
         for(int i = 4 ; i <= 8 ; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 2, 6);
        for(int i = 10 ; i <= 20 ; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 22, 6);addObject(new grey(), 24, 6);
         for(int i = 26 ; i <= 28 ; i++){
            addObject(new grey(), i, 6);
        }addObject(new grey(), 30, 6);addObject(new grey(), 36, 6);
        for(int i = 32 ; i <= 34 ; i++){
            addObject(new grey(), i, 6);
        }for(int i = 38 ; i <= 40 ; i++){
            addObject(new grey(), i, 6);
        }
        //y = 7,8
        addObject(new grey(), 2, 7);addObject(new grey(), 4, 7);
        addObject(new grey(), 10, 7);addObject(new grey(), 20, 7);
        addObject(new grey(), 22, 7);addObject(new grey(), 24, 7);
        addObject(new grey(), 30, 7);addObject(new grey(), 36, 7);
        addObject(new grey(), 2, 8);addObject(new grey(), 4, 8);
        for(int i = 6 ; i <= 10 ; i++){
            addObject(new grey(), i, 8);
        } for(int i = 12 ; i <= 18 ; i++){
            addObject(new grey(), i, 8);
        } addObject(new grey(), 20, 8);addObject(new grey(), 22, 8);
        for(int i = 24 ; i <= 38 ; i++){
            addObject(new grey(), i, 8);
        }
        //y= 9,10
        addObject(new grey(), 2, 9);addObject(new grey(), 4, 9);
        addObject(new grey(), 6, 9);addObject(new grey(), 10, 9);
        addObject(new grey(), 12, 9);addObject(new grey(), 18, 9);
        addObject(new grey(), 20, 9);addObject(new grey(), 22, 9);
        addObject(new grey(), 32, 9);addObject(new grey(), 38, 9);
        for(int i = 0 ; i <= 2 ; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 4, 10);addObject(new grey(), 10, 10);
        addObject(new grey(), 6, 10);addObject(new grey(), 8, 10);
        addObject(new grey(), 12, 10);addObject(new grey(), 20, 10);
        for(int i = 14 ; i <= 18 ; i++){
            addObject(new grey(), i, 10);
        }for(int i = 22 ; i <= 30 ; i++){
            addObject(new grey(), i, 10);
        }addObject(new grey(), 32, 10);
        for(int i = 34 ; i <= 36 ; i++){
            addObject(new grey(), i, 10);
        }
        //y = 11,12
        addObject(new grey(), 4, 11);addObject(new grey(), 6, 11);
        addObject(new grey(), 8, 11);addObject(new grey(), 10, 11);
        addObject(new grey(), 12, 11);addObject(new grey(), 16, 11);
        addObject(new grey(), 20, 11);addObject(new grey(), 22, 11);
        addObject(new grey(), 30, 11);addObject(new grey(), 32, 11);
        addObject(new grey(), 34, 11);addObject(new grey(), 36, 11);
         for(int i = 2 ; i <= 4 ; i++){
            addObject(new grey(), i, 12);
        }addObject(new grey(), 6, 12);addObject(new grey(), 16, 12);
        addObject(new grey(), 8, 12);addObject(new grey(), 10, 12);
        for(int i = 12 ; i <= 14 ; i++){
            addObject(new grey(), i, 12);
        }for(int i = 18 ; i <= 20 ; i++){
            addObject(new grey(), i, 12);
        }for(int i = 22 ; i <= 24 ; i++){
            addObject(new grey(), i, 12);
        }for(int i = 26 ; i <= 30 ; i++){
            addObject(new grey(), i, 12);
        }addObject(new grey(), 32, 12);addObject(new grey(), 34, 12);
        for(int i = 36 ; i <= 40 ; i++){
            addObject(new grey(), i, 12);
        }
        //y = 13,14
        addObject(new grey(), 2, 13);addObject(new grey(), 8, 13);
        addObject(new grey(), 10, 13);addObject(new grey(), 16, 13);
        addObject(new grey(), 26, 13);addObject(new grey(), 32, 13);
        for(int i = 2 ; i <= 10 ; i++){
            addObject(new grey(), i, 14);
        }for(int i = 12 ; i <= 26 ; i++){
            addObject(new grey(), i, 14);
        }for(int i = 28 ; i <= 40 ; i++){
            addObject(new grey(), i, 14);
        }
        //y = 15,16
        addObject(new grey(), 10, 15);addObject(new grey(), 12, 15);
        addObject(new grey(), 28, 15);
        for(int i = 2 ; i <= 8 ; i++){
            addObject(new grey(), i, 16);
        }addObject(new grey(), 10, 16);addObject(new grey(), 12, 16);
        for(int i = 14 ; i <= 28 ; i++){
            addObject(new grey(), i, 16);
        }for(int i = 30 ; i <= 38 ; i++){
            addObject(new grey(), i, 16);
        }
        //y = 17,18
        addObject(new grey(), 2, 17);addObject(new grey(), 6, 17);
        addObject(new grey(), 10, 17);addObject(new grey(), 12, 17);
        addObject(new grey(), 36, 17);addObject(new grey(), 6, 18);
        for(int i = 2 ; i <= 4 ; i++){
            addObject(new grey(), i, 18);
        }addObject(new grey(), 8, 18);addObject(new grey(), 10, 18);
        for(int i = 12 ; i <= 34 ; i++){
            addObject(new grey(), i, 18);
        }addObject(new grey(), 36, 18);addObject(new grey(), 38, 18);
        //y=19,20
        addObject(new grey(), 6, 19);addObject(new grey(), 8, 19);
        addObject(new grey(), 10, 19);addObject(new grey(), 12, 19);
        addObject(new grey(), 20, 19);addObject(new grey(), 24, 19);
        addObject(new grey(), 26, 19);addObject(new grey(), 32, 19);
        addObject(new grey(), 36, 19);addObject(new grey(), 38, 19);
        for(int i = 2 ; i <= 6 ; i++){
            addObject(new grey(), i, 20);
        }for(int i = 8 ; i <= 10 ; i++){
            addObject(new grey(), i, 20);
        } addObject(new grey(), 12, 20); addObject(new grey(), 14, 20);
        for(int i = 16 ; i <= 18 ; i++){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 20, 20); addObject(new grey(), 22, 20);
        addObject(new grey(), 24, 20); addObject(new grey(), 26, 20);
         for(int i = 28 ; i <= 30 ; i++){
            addObject(new grey(), i, 20);
        } for(int i = 32 ; i <= 36 ; i++){
            addObject(new grey(), i, 20);
        }addObject(new grey(), 38, 20);
        //y = 21,22
        addObject(new grey(), 2, 21);addObject(new grey(), 8, 21);
        addObject(new grey(), 12, 21);addObject(new grey(), 14, 21);
        addObject(new grey(), 16, 21);addObject(new grey(), 18, 21);
        addObject(new grey(), 20, 21);addObject(new grey(), 22, 21);
        addObject(new grey(), 26, 21);addObject(new grey(), 28, 21);
        addObject(new grey(), 30, 21);addObject(new grey(), 32, 21);
        addObject(new grey(), 38, 21);addObject(new grey(), 2, 22);
        for(int i = 4 ; i <= 6 ; i++){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 8, 22);addObject(new grey(), 16, 22);
        for(int i = 10 ; i <= 14 ; i++){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 18, 22);addObject(new grey(), 20, 22);
        for(int i = 22 ; i <= 26 ; i++){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 28, 22);addObject(new grey(), 30, 22);
        for(int i = 34 ; i <= 38 ; i++){
            addObject(new grey(), i, 22);
        }addObject(new grey(), 32, 22);
        //y=23,24
        addObject(new grey(), 2, 23);addObject(new grey(), 4, 23);
        addObject(new grey(), 6, 23);addObject(new grey(), 8, 23);
        addObject(new grey(), 16, 23);addObject(new grey(), 18, 23);
        addObject(new grey(), 20, 23);addObject(new grey(), 22, 23);
        addObject(new grey(), 26, 23);addObject(new grey(), 28, 23);
        addObject(new grey(), 30, 23);addObject(new grey(), 34, 23);
        addObject(new grey(), 38, 23);addObject(new grey(), 6, 24);
        addObject(new grey(), 2, 24);addObject(new grey(), 4, 24);
        for(int i = 8 ; i <= 16 ; i++){
            addObject(new grey(), i, 24);
        } addObject(new grey(), 18, 24);addObject(new grey(), 20, 24);
        addObject(new grey(), 22, 24);addObject(new grey(), 24, 24);
        addObject(new grey(), 26, 24);addObject(new grey(), 28, 24);
        for(int i = 30 ; i <= 34 ; i++){
            addObject(new grey(), i, 24);
        }for(int i = 36 ; i <= 38 ; i++){
            addObject(new grey(), i, 24);
        }
        //y = 25, 26
        addObject(new grey(), 2, 25);addObject(new grey(), 4, 25);
        addObject(new grey(), 6, 25);addObject(new grey(), 8, 25);
        addObject(new grey(), 12, 25);addObject(new grey(), 18, 25);
        addObject(new grey(), 20, 25);addObject(new grey(), 24, 25);
        addObject(new grey(), 26, 25);addObject(new grey(), 28, 25);
        addObject(new grey(), 34, 25);addObject(new grey(), 2, 26);
        addObject(new grey(), 4, 26);addObject(new grey(), 6, 26);
        for(int i = 8 ; i <= 10 ; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 12, 26);addObject(new grey(), 34, 26);
        for(int i = 14 ; i <= 16 ; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 18, 26);addObject(new grey(), 20, 26);
        for(int i = 22 ; i <= 24 ; i++){
            addObject(new grey(), i, 26);
        }addObject(new grey(), 26, 26);addObject(new grey(), 28, 26);
        for(int i = 30 ; i <= 32 ; i++){
            addObject(new grey(), i, 26);
        }for(int i = 36 ; i <= 40 ; i++){
            addObject(new grey(), i, 26);
        }
        //y=27,28
        addObject(new grey(), 2, 27);addObject(new grey(), 4, 27);
        addObject(new grey(), 12, 27);addObject(new grey(), 18, 27);
         addObject(new grey(), 14, 27);addObject(new grey(), 16, 27);
        addObject(new grey(), 20, 27);addObject(new grey(), 22, 27);
        addObject(new grey(), 26, 27);addObject(new grey(), 28, 27);
        addObject(new grey(), 32, 27);addObject(new grey(), 34, 27);
        addObject(new grey(), 2, 28);addObject(new grey(), 14, 28);
        addObject(new grey(), 16, 28);addObject(new grey(), 18, 28);
        addObject(new grey(), 28, 28);addObject(new grey(), 30, 28);
        for(int i = 4 ; i <= 12 ; i++){
            addObject(new grey(), i, 28);
        }for(int i = 20 ; i <= 22 ; i++){
            addObject(new grey(), i, 28);
        }for(int i = 24 ; i <= 26 ; i++){
            addObject(new grey(), i, 28);
        }for(int i = 32 ; i <= 38 ; i++){
            addObject(new grey(), i, 28);
        }
        //y = 29,30
        addObject(new grey(), 2, 29);addObject(new grey(), 4, 29);
        addObject(new grey(), 14, 29);addObject(new grey(), 16, 29);
        addObject(new grey(), 18, 29);addObject(new grey(), 24, 29);
        addObject(new grey(), 28, 29);addObject(new grey(), 30, 29);
        addObject(new grey(), 2, 30);addObject(new grey(), 4, 30);
        for(int i = 6 ; i <= 14 ; i++){
            addObject(new grey(), i, 30);
        }addObject(new grey(), 16, 30);addObject(new grey(), 18, 30);
        for(int i = 20 ; i <= 24 ; i++){
            addObject(new grey(), i, 30);
        }for(int i = 26 ; i <= 28 ; i++){
            addObject(new grey(), i, 30);
        }for(int i = 30 ; i <= 40 ; i++){
            addObject(new grey(), i, 30);
        }
        //y = 31,32
        addObject(new grey(), 2, 31);addObject(new grey(), 4, 31);
        addObject(new grey(), 6, 31);addObject(new grey(), 8, 31);
        addObject(new grey(), 16, 31);addObject(new grey(), 20, 31);
        addObject(new grey(), 26, 31);
        addObject(new grey(), 2, 32);addObject(new grey(), 4, 32);
        addObject(new grey(), 6, 32);addObject(new grey(), 8, 32);
        for(int i = 10 ; i <= 14 ; i++){
            addObject(new grey(), i, 32);
        }for(int i = 16 ; i <= 20 ; i++){
            addObject(new grey(), i, 32);
        }for(int i = 22 ; i <= 40 ; i++){
            addObject(new grey(), i, 32);
        }
        //y = 33,34
        addObject(new grey(), 2, 33);addObject(new grey(), 4, 33);
        addObject(new grey(), 6, 33);addObject(new grey(), 12, 33);
        addObject(new grey(), 18, 33);addObject(new grey(), 20, 33);
        addObject(new grey(), 2, 34);addObject(new grey(), 4, 34);
        for(int i = 6 ; i <= 12 ; i++){
            addObject(new grey(), i, 34);
        }for(int i = 14 ; i <= 16 ; i++){
            addObject(new grey(), i, 34);
        }addObject(new grey(), 18, 34);
        for(int i = 20 ; i <= 38 ; i++){
            addObject(new grey(), i, 34);
        }
        //y=35,36
        addObject(new grey(), 2, 35);addObject(new grey(), 4, 35);
        addObject(new grey(), 6, 35);addObject(new grey(), 14, 35);
        addObject(new grey(), 16, 35);addObject(new grey(), 18, 35);
        addObject(new grey(), 24, 35);addObject(new grey(), 32, 35);
        addObject(new grey(), 38, 35);
        for(int i = 0 ; i <= 2 ; i++){
            addObject(new grey(), i, 36);
        }addObject(new grey(), 4, 36);addObject(new grey(), 6, 36);
        for(int i = 8 ; i <= 14 ; i++){
            addObject(new grey(), i, 36);
        }addObject(new grey(), 16, 36);addObject(new grey(), 18, 36);
        addObject(new grey(), 20, 36);addObject(new grey(), 22, 36);
        for(int i = 24 ; i <= 26 ; i++){
            addObject(new grey(), i, 36);
        }for(int i = 28 ; i <= 30 ; i++){
            addObject(new grey(), i, 36);
        }for(int i = 34 ; i <= 36 ; i++){
            addObject(new grey(), i, 36);
        }addObject(new grey(), 32, 36);
        for(int i = 38 ; i <= 40 ; i++){
            addObject(new grey(), i, 36);
        }
        //y=37,38
        addObject(new grey(), 4, 37);addObject(new grey(), 8, 37);
        addObject(new grey(), 16, 37);addObject(new grey(), 18, 37);
        addObject(new grey(), 20, 37);addObject(new grey(), 22, 37);
        addObject(new grey(), 24, 37);addObject(new grey(), 28, 37);
        addObject(new grey(), 30, 37);addObject(new grey(), 32, 37);
        addObject(new grey(), 36, 37);
        for(int i = 2 ; i <= 8 ; i++){
            addObject(new grey(), i, 38);
        }for(int i = 10 ; i <= 16 ; i++){
            addObject(new grey(), i, 38);
        }for(int i = 18 ; i <= 20 ; i++){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 20, 38);addObject(new grey(), 22, 38);
        for(int i = 26 ; i <= 28 ; i++){
            addObject(new grey(), i, 38);
        }for(int i = 32 ; i <= 36 ; i++){
            addObject(new grey(), i, 38);
        }addObject(new grey(), 30, 38);addObject(new grey(), 38, 38);
        addObject(new grey(), 22, 39);addObject(new grey(), 26, 39);
        addObject(new grey(), 38, 39);
        
        timecounter = 180000;
        addObject(new player(), 4, 0);
        addObject(new flag(), 41, 34);
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
