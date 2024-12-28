public class Java_ND_Arrays {
    public static void main(String [] args){
        int [][] nums= new int[3][3];
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                nums[i][j]=(int)(Math.random()*10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        // Enhanced for-loop
        System.out.println();
        for(int [] n:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

}
