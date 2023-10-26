package mfc;

import java.util.ArrayList;
import java.util.List;

public class Window {

    ArrayList<Kasta> kastaArrayList=new ArrayList<Kasta>();

    public int category;
    public boolean flag=false;
    public Window(int category){
        this.category=category;
        kastaArrayList.add(new Kasta());
        kastaArrayList.add(new Kasta());
        kastaArrayList.add(new Kasta());
    }

    public void service(int categ){
        SomeThread someThread=new SomeThread(this,categ);
        someThread.start();
    }

    public int getBadCount(int cat){
        return kastaArrayList.get(cat).badCount;
    }

    public int getAllCount(int cat){
        return kastaArrayList.get(cat).allCount;
    }
}
