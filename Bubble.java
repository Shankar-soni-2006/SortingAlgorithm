public class Bubble{
    public static void main(String[] args) {
    int []arr = {5,3,4,2,1};
    int end = arr.length-1;
    for(int i = 0;i<arr.length;i++){
        for(int j = 1;j<=end;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
