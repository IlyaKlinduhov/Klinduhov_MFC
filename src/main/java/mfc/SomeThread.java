package mfc;

public class SomeThread extends Thread{

    Window window;
    int category;

    public SomeThread(Window window,int category){
        this.window=window;
        this.category=category;
    }
    @Override
    public void run() {
        if(window.flag==false & (category==window.category)){
            window.flag=true;
            window.kastaArrayList.get(category-1).allCount++;
        } else if (window.flag==false & window.category==1) {
            window.flag=true;
            window.kastaArrayList.get(category-1).allCount++;
        } else{
            window.kastaArrayList.get(category-1).allCount++;
            window.kastaArrayList.get(category-1).badCount++;
        }
        window.flag=false;
    }



}
