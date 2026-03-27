package assignment;

public class SumofRow {
        public static int sumOfRow(int nums[][],int row) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    if(row==i){
                        sum+=nums[i][j];
                        
                    }
                }
            }
            return sum;
        }

        public static void main(String args[]) {
            int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
            int row=1;
            System.out.println((sumOfRow(nums,row)));
        }
    }


