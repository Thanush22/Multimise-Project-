import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class topper {
    public static void main(String[]args) throws IOException {
        Scanner show = new Scanner(System.in);
        BufferedReader display = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Float>list= new ArrayList<>();
        ArrayList<Float>list3 = new ArrayList<>();
        ArrayList<String>list1 = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        System.out.println("Enter the number of students : ");
        int x = show.nextInt();
        for(int i=1;i<=x;i++){
            System.out.println("Enter your Name:");
            String s1 = display.readLine();
            System.out.println("Enter the Register Number :");
            String r1 = display.readLine();
            System.out.println("Enter the Mark1:");
            int m1 = show.nextInt();
            System.out.println("Enter the Mark2:");
            int m2 = show.nextInt();
            System.out.println("Enter the Mark3:");
            int m3 = show.nextInt();
            System.out.println("Enter the Mark4:");
            int m4 = show.nextInt();
            System.out.println("Enter the Mark5:");
            int m5 = show.nextInt();
            int tot = m1+m2+m3+m4+m5;
            float Avg = tot / 5;
            list2.add(s1);
            list1.add(r1);
            list.add(Avg);
        }
        float[] arr = new float[list.size()];
        for(int l=0; l<list.size(); l++){
            arr[l] = list.get(l);
        }
        float temp;
        for(int j=0; j<list.size(); j++){
            for(int k=j+1; k<list.size(); k++){
                if(arr[j]<arr[k]){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }for(int n=0; n<arr.length; n++){
            list3.add(arr[n]);
        }
        System.out.println("Enter the number of students want to see : ");
        int z = show.nextInt();
        for(int m=0; m<z; m++){
            System.out.println("Enter the Name : ");
            String g = display.readLine();
            for(int p=0; p<list2.size(); p++){
                if(g.equals(list2.get(p))){
                    System.out.println("Name : " + g);
                    System.out.println("Reg no : " + list1.get(p));
                    for(int q=0; q<list3.size();q++){
                        if(list.get(p).equals(list3.get(q))){
                            System.out.println("Average : " + list3.get(q));
                            System.out.println("Rank : " + (q+1) + "Rank");
                        }
                    }
                }
            }
        }
    }
}