package ArrayCodes;

import java.util.Arrays;

public class FrequencyArray {

    void frequency(){
        int arr[] = new int[]{9, 54, 8,8,8,8,8,8,8,8, 1, 1, 1, 1, 1, 1, 1, 0, 7, 54, 24, 1, 6, 8, 9, 32, 54, 54  };
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            if(count>1){
                System.out.println(arr[i] + "--> "+ count);
            }

        }
    }
    public static void main(String[] args) {
        FrequencyArray obj=new FrequencyArray();
        obj.frequency();
    }

}