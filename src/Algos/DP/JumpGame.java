package Algos.DP;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length ==1){
            return true;
        }
        int canJump = 0;
        for(int i=0 ; i<=canJump && i < nums.length -1 ;i++){
            canJump = Math.max(canJump,nums[i]+i);
            if(canJump >= nums.length -1) {
                return true;
            }
        }
        return false;
    }
}
