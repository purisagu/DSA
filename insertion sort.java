public class Insertion{
public static void main(String [] args){
int [] arr={5,4,3,1,2};
for(int i=1;i<arr.length;i++){
int temp=arr[i];
j=i-1;
while(j>0&&arr[j]>temp){
arr[j+1]=arr[j];
j++;
}
arr[j+1]=temp;
}