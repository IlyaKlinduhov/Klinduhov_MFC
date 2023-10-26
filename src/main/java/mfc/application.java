package mfc;

import java.util.Random;

public class application {

    public static void main(String[] args) {

        Window windowOne=new Window(1);
        Window windowTwo=new Window(2);
        Window windowThree=new Window(3);

        for(int i=0;i<5000;i++){
            int categ=new Random().nextInt(1,4);
            int windowNumber=new Random().nextInt(1,4);
            if(windowNumber==1){
                windowOne.service(categ);
            }
            if(windowNumber==2){
                windowTwo.service(categ);
            }
            if(windowNumber==3){
                windowThree.service(categ);
            }
        }
        
        int a=0;
        for (int i=0;i<3;i++){
            a++;
            System.out.println("процент злых из "+a+" категории "+((float)(windowOne.getBadCount(i)+windowTwo.getBadCount(i)+windowThree.getBadCount(i))/(float)(windowOne.getAllCount(i)+windowTwo.getAllCount(i)+windowThree.getAllCount(i)))*100);
        }
    }

}
