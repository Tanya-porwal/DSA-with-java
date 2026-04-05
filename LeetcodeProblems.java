import java.util.*;
public class LeetcodeProblems {
    public static int ProblemNo27(int[] nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static int ProblemNo387(String s){
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) ){
                    c++;
                }
            }
            if(c==1){
                return i;
            }
        }
        return -1 ;
    }
    public static void ProblemNo125(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                System.out.println("Is not a palindrome");
                return;
            }
        }
        System.out.println("Is a palindrome");
    }
    public static int ProblemNo136(int[] nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])count++ ;
            }
            if(count==1)return nums[i];

        }
        return -1 ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // int res=ProblemNo387(str);
        // System.out.println(res);
        // ProblemNo125(str);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=ProblemNo136(arr);
        System.out.println(result);
        sc.close();
        int val=sc.nextInt();
        int res=ProblemNo27(arr,val);
        System.out.println(res);

  }

}