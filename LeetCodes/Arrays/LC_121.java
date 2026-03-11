package LeetCode.LeetCodes.Arrays;

public class LC_121 {
    public void profit_loss(){
        int arr[] = new int[]{7,3,2,1,5};
        int n= arr.length;
         int final_p = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int buy = arr[i];
                    int sell = arr[j];
                    int profit = sell - buy;
                    if(profit > final_p){
                        final_p = profit;

                    }


                }
            }
        }
        System.out.println(final_p);
        

        }
            
        
        public static void main(String[] args) {
            LC_121 obj = new LC_121();
            obj.profit_loss();
            
        }

    }

