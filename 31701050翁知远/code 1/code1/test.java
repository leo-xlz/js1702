package code1;
public class test {  
    public static void main(String[] args) {  
    	int[] a = {1,4,5,3,2,6};
        Sleep[] sleep = new Sleep[a.length]; 
        for (int i = 0; i < sleep.length; i++) {  
        	sleep[i] = new Sleep(a[i]);  
        } 
        for (int i = 0; i < sleep.length; i++) {  
        	sleep[i].start();  
        }  
    }  
}  
class Sleep extends Thread{  
    int s = 0;  
    public Sleep(int s){  
        this.s = s;  
    }  
    public void run(){  
        try {  
            sleep(s*10+10);
        } catch (InterruptedException e) {  
              
            e.printStackTrace();  
        }  
        System.out.println(s);  
    }  
}  