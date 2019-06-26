public class ArraySort {

    public static void main(String[] args) {

        int [] a=new int[]{2,1,6,5,4};
        System.out.println("arry values before sorting");
        for (int eachno:a)
        {
        System.out.println(eachno);

        }

        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.println("array values after sorting");
        for(int eacno:a){
            System.out.println(eacno);
        }

    }
}
