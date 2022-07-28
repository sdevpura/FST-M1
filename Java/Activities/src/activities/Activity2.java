package activities;

public class Activity2 {
    Activity2(){
        int[] arr;
        int temp;
        boolean isThirty;
        boolean notThirty;
    }


    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};
        int temp = 0;
        boolean isThirty = true;
        boolean notThirty = false;



        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==10)
                temp = temp + arr[i];
    }

        if(temp==30){
            System.out.println(isThirty);
        }
        else
            System.out.println(notThirty);
    }
}
