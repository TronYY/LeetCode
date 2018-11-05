package $874_WalkingRobotSimulation_Greey_E;

import java.util.HashSet;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] dir=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        HashSet<String> obset=new HashSet<>();
        for (int[] obs:obstacles) obset.add(obs[0]+" "+obs[1]);//把障碍点加入hash集

        int d=0,x=0,y=0,maxDist=0;
        for (int cmd:commands)
            if (cmd==-1) d=(d+1) % 4;
            else if (cmd==-2) d=(d-1+4) % 4;
            else {
                while (cmd>0 && !obset.contains((x+dir[d][0])+" "+(y+dir[d][1]))) {
                    x+=dir[d][0];
                    y+=dir[d][1];
                    cmd--;
                    if (x*x+y*y>maxDist) maxDist=x*x+y*y;

                }
            }
        return maxDist;

    }
}
