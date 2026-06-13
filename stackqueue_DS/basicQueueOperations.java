public class basicQueueOperations{
    int currsize=0;
    int start=-1;
    int end=-1;
    public void push(int arr[],int val , int size){
        if(currsize == size){
            System.out.println("Queue overflow");
            return;
        }
        if(currsize==0){
            start++;
        }
        end=(end+1)%size;
        arr[end]=val;
        currsize++;
    }
    public int top(int arr[]){
        if(currsize==0){
            return -1;
        }
        return arr[start];
    }

    public void pop(int size){
        if(currsize == 0){
            System.out.println("queue underflow");
            return;

        }
        start=(start+1)%size;
        currsize--;
        if(currsize==0){
            start=-1;
            end=-1;
        }
    }

    public int size(){
        return currsize;
    }

    public static void main(String[] args) {
        basicQueueOperations obj=new basicQueueOperations();
        int n=4;
        int arr[]=new int[n];
        obj.push(arr,3,n);
        System.out.println(obj.top(arr));
        obj.pop(n);
        System.out.println(obj.size());
    }


}