package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] as = null;
        as = sc.nextLine().split(" ");
        int a[] = new int[as.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.valueOf(as[i]);
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]) {
                    int k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(     );
        Scanner s = new Scanner(System.in);
        String[] bs = null;
        bs = s.nextLine().split(" ");
        int b[] = new int[bs.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.valueOf(bs[i]);
        }
        int []c=new int [a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i< c.length;i++){
            c[i]=b[i-a.length];
        }
        for(int i=1;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(c[i]<c[j]){
                    int k=c[j];
                    c[j]=c[i];
                    c[i]=k;
                }
            }
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}


