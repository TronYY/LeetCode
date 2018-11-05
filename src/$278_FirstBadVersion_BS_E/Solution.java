package $278_FirstBadVersion_BS_E;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1,right=n,mid=0;
        while (left<right) {
        	mid=left+(right-left)/2;//可以防止越界
        	if (isBadVersion(mid)) right=mid;//是坏的，这个也可能是第一个坏的，所以不用减1
        	else left=mid+1;
        }
        return left;
    }
}