package $860_LemonadeChange_Greedy_E;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for (int i=0;i<bills.length;i++)
            if (bills[i]==5) five++;
            else if (bills[i]==10 && five>=1) {
                five--;
                ten++;
            }
            else if (bills[i]==20 && ten>=1 && five>=1) {
                five--;
                ten--;
            }
            else if (bills[i]==20 &&ten==0 && five>=3) {
                five=five-3;
            }
            else return false;
        return true;
    }
}