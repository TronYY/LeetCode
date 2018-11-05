# LeetCode
Solutions of leetcode


## $001_TwoSum  
Arrays.toString(某数组);打印一个数组所有内容，如[1，2]  
Map<Integer, Integer> map = new HashMap<Integer, Integer>();哈希新建  

## $002_AddTwoNumbers  
int l1v=(l1==null)? 0:l1.val;//把队列的长度都放在一起考虑了，不用后面分情况再来  
int l2v=(l2==null)? 0:l2.val;   

## $105_ConstructBinaryTreefromPreorderandInorderTraversal_DFS  
## $106_ConstructBinaryTreefromInorderandPostorderTraversal_DFS  
这两题类似，用到递归，根据两个序来构造树。  

## $100_SameTree_DFS  
两行可以写为if (p == NULL || q == NULL) return (p == q)
 

## $111_MinimumDepthofBinaryTree_DFS 找最小深度 
注意考虑各种情况[] 单只，单点；
考虑该点左右子树都有还是只有单支；  

  

## $112_PathSum_DFS  
节点的值不一定是正数  
## $113 PathSumII_DFS
list引用，这道题为了不每次dfs都得新建一个list，我采用让访问过的节点从list中最后位置弹出`list.remove(list.size()-1);`判断各种情况用了挺长时间  
## $114_FlattenBinaryTreetoLinkedList_DFS  
考虑好单支、无子树的情况

## $442_FindAllDuplicatesinanArray  
利用O(n)时间，没有额外空间找出出现两次的数字，使用到符号的技巧  
List<Integer> list1= new List<Integer>();这句是错误的 ，List是一个接口，接口不能创建对象，但你可以引用一个他子类的实例，可以这样创建引用：List<Integer>list1=new ArrayList<Integer>();  
增加元素： 
List<String> name = new ArrayList();  
name.add("xxx");    
name.add("yyy");    
name.add("zzz");    
List<String> name = Arrays.asList("xxx","yyy","zzz");  
or  
List<String> name =new ArrayList<>(Arrays.asList("xxx","yyy","zzz"));  
考虑按位异或，这里不好用  

Integer的  
List<Integer>list1=new ArrayList<Integer>();（import java.util.ArrayList;import java.util.List;）
list1.add(5); int可以直接放进去 
System.out.println(list1.get(0));  

初始化可以用`new ArrayList<Integer>(list)`

## $561_ArrayPartitionI
Arrays.sort(nums);数组的快速排序

## $695_MaxAreaofIsland_Arrays    
这道题就是采用深搜，三部曲 结束条件+标记+深搜  
这道题目案例是精心设计过的，之前一直读成了岛屿数目，结果才知道是最大岛屿的面议

## $766_ToeplitzMatrix_Array 
检查各条对角线 除去最后一行最后一列。检查matrix[i][j]和matrix[i+1][j+1]是否相等  
  
## $124_BinaryTreeMaximumPathSum_DFS  
基本上树的dfs第一句是root==null
``if (root==null) return 0;
    	int left=Math.max(0, dfs(root.left));
    	int right=Math.max(0,dfs(root.right));//把左支小于零，右支小于零的时候就舍去了
    	result=Math.max(result, left+root.val+right);//有了上面两句，就不用 分开判断只用左支 、只用右支还是都用。
    	//上面这句的结果是通知给全部节点的，下面这句的结果是给上层节点的。
    	return Math.max(left, right)+root.val;//返回给上面的时候，上层只走单支``  
## package $129_SumRoottoLeafNumbers_DFS;
树的dfs一般是if root==null return  
本题我一开始在是不是要把只有左支、只有右支的要分别判断所以一开始写成  
`if (root.left!=null) dfs(root.left, temp);  
if (root.right!=null) dfs(root.right, temp);`  
但是如果写成一开始`if (root==null) return 0;`代表叶子节点会结束，而且会返回零值，那么return sum(左)+sum(右)，就不用分别考虑单支的情况了。**让某支为零，最后不用把单支分别考虑，这个思想在124题中也有运用**  
## 110_BalancedBinaryTree_DFS_Easy  
1.递归只能一层层返回，System.exit()会结束整个程序  
2.平衡二叉树任意一个节点的左右子树高度差不能超过一，判断条件if null returntrue； |l-r|<=1 &&左为平衡&&右为平衡

## $199_BinaryTreeRightSideView_DFS_M;  
list的用法要加强弄一下
 if (res.size() == level){
            res.add (root.val);
        }
        if (root.right != null){
            dfs (root.right, res, level + 1);
        }
        if (root.left != null){
            dfs (root.left, res, level + 1);  
## 深入理解计算机系统 编码隐匿 算法图解  
## $200_NumberofIslands_DFS_M;  
类似695之前错的思路，深搜 结束条件+标记+深搜  
题目把695的int 改为了char数组  
1. 数组静态初始化int [][] dir= {{-1,0},{0,1},{1,0},{0,-1}};  
2. leetcode经常有空的输入数据；
3. 设置缓存，已经做过的探索就不必再做。

## $337_HouseRobberIII_DFS_M  
分情况，当前节点不打劫，怎么样才会最大；当前节点打劫，怎么样才会最大
1. result[0]代表在不打劫root的情况下，以root为树总共打劫多少；result[1]代表打劫root
2. result[0]=Math.max(left[0], left[1])+Math.max(right[0], right[1]);//当前节点不打劫，就左右两边最大的就可以
    	result[1]=root.val+left[0]+right[0];//当前节点打劫，那么左右就都不能打劫
3. 本题中不会出现重复访问，可以不加hash；测了一下，使用map  9ms 打败50%，不使用就2ms 打败90%，看来map的操作增大了工作时间 
4. Map<int,int> map=new Map<int,int>();是错的————泛型的声明必须是一个类,int是基本数据类型而不是一个类,这里应该用int的封装类Integer做声明,也就是Map<Integer,Integer> ,另外等号右边Map是一个接口不能直接实例化,应该用其实现类比如HashMap<Integer,Integer>()  

Map<TreeNode, int[]> map;//jy定义键值类型  
map=new HashMap<>();//jy初始化，Map是接口  
if (map.containsKey(root)) return map.get(root);//jy hash map 查找  
map.put(root, result);//jy hash map 插入  
- //若要添加到HashMap中的键值对对应的key已经存在HashMap中，则找到该键值对；然后新的value取代旧的value，并退出！
若要添加到HashMap中的键值对对应的key不在HashMap中，则将其添加到该哈希值对应的链表中，并调用addEntry()。 
- Map的新方法getOrDefault(Object,V)允许调用者在代码语句中规定获得在map中符合提供的键的值，否则在没有找到提供的键的匹配项的时候返回一个“默认值”。


## $098_ValidateBinarySearchTree_DFS_M;
1. && 短路与 从左到右
   || 短路或 从左到右  
2. 左子树的上界是root的值，右子树的下界是root的值。通过把当前的上下界调整后传给下层。
3. 题目注意是全部左边节点比root值要小，全部右边节点的值比root值要大。比较坑的是原先上下界设为Integer的最大最小值，后来发现测试数据居然就有MAX Integer，无奈改为Long。leetcode要是明确说明数据规模就好了。

## $101_SymmetricTree_DFS_E  
1. 可以和100对照下
2. 比较是否对称，先主方法里判断根节点是否为空，再调用isSH(左，右)； 递归时，p的左和q的右比，p的右和q的左比

## 257_BinaryTreePaths_DFS_E;
输出所有到叶节点的路径。题目比较简单主要是String的问题，可以看一下自己的博客[关于Java中String的传递问题](https://blog.csdn.net/TronYY/article/details/79904144).  
String具有不可变性，String被重新赋值为abcdel时，是在堆内重新开辟空间放入abcdel，并且String指向它，相当于新建了一个String对象，但是原先的String s=abcd仍然存在。

## 116PopulatingNextRightPointersinEachNode_DFS_M;——把节点的next指向他右边的节点  
1. 右节点的next就是root.next.left;再来connext左节点，connect 右节点.
2. null的下面不能有方法或属性了，所以需要判断root.next是否为null

## 109_ConvertSortedListtoBinarySearchTree_DFS_M  
1. 把有序序列转换为平衡二叉树，找出中间的数，左边部分的递归求，右边部分再递归求。
2. 本题的有序序列是单链表，我把它转为了数组，方便查中间的数。这样做有两个问题一是指定数组长度时不好确定，只能静态（最后设了十万才刚好），第二是运行只比4%的人快。 
3. 针对上面这个问题查找了一下，发现网上有利用快慢指针求中间的数。原理是快指针的速度是慢指针的两倍，结果快指针到达结尾时，慢指针刚好到达中间位置，准备在blog里写一下。http://www.cnblogs.com/hxsyl/p/4395794.html  

blog中求中位数
``` java
while (fast&&slow)
{
　　if (fast->next==NULL) // 假设都从0开始，slow走到k位，fast走到的是2k位，（加上0号位，总共是奇数个点），所以k刚好是中间以为
　　    return slow ->data;
　　else if (fast->next!= NULL && fast->next->next== NULL) //否则需要加上后一位的取平均
　　    return (slow ->data + slow ->next->data)/2;
　　else
　　{
　　    fast= fast->next;
　    　fast= fast->next;
　　    slow = slow ->next;
　　}
　}
``` 
4. 今天利用快慢指针做了一下，总的想法还是和二分法差不多，这儿slow就是中心点，由于是单向的，必须要置顶中心点的前一个元素所以用了一个slowPre（一开始设为null，之后slow挪动前先记录为slow）  
5. 倒是在判断终止条件时花了不少时间——//注意要判断end为null——end为null就是左半子树没了——其实按照下面的while循环最终弄下去肯定现有两个元素的(a,b)，退出while循环时两个元素的slow指在第一个元素做root，pre是空，左半部分是（head，null），右半部分是（end，end）右半部分相等所以返回b,左半部分要判断空就不能用head，必须用end==null  
这个终止判断得结合后面的while来。。。

## 108_ConvertSortedArraytoBinarySearchTree_DFS_E
1. 和109同样的题目，题目要求用数组，呵呵呵109里练过了，类似二分。有序的数组，要形成平衡二叉树，那么根节点就是mid元素，那么左子树就是左边的数组，右子树就是右边的部分，在递归求  

## 104_MaximumDepthofBinaryTree_DFS  
这题和111差不多，但是更容易两句话写完  
if (root==null) return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;

## $094_BinaryTreeInorderTraversal_Tree_M;  
1. 中序的问题挺简单； 
2. list的初始化要掌握public List<Integer> inorderTraversal(TreeNode root) {  
List<Integer> list=new ArrayList<Integer>();

## 394_DecodeString_DFS_M  
1. ``` java
	预先是push进"",预防空串；
	while {	
	if 遇到数字 把数字push进num栈
	else if [ push空串 //这一步必须，否则 最后的else部分 （遇到字符），如果是第一次遇到字符，就pop不出来
	else if ] {
		pop 数字，循环多次形成串；
		push(pop出的顶部+形成的串)
	}
	else //字母
		push(pop出的顶部+字母)
	}```  

## 717_1bitand2bitCharacters_E  
根据最后跳出的位数来判断  
## 035_SearchInsertPosition_E  
1. 一开始傻了用了线性查找，居然会出错——原因在于一个个找过去如果target比所有元素都大，则会越界，所以务必要加上对边界的限制。  其次，&&是短路与，所以要把边界的限制放在 && 左侧：```while ( i<nums.length && target>nums[i]) i++;
    	return i;```  
2. 应该用二分查找，和普通的一样，只是最后输出时输出L；同时二分查找有变种，可以看下博客——下一次可以练练二分查找  
## $074_Searcha2DMatrix_BS_M;  
1. 二维表当成有序表来进行，通过t=matrix[mid/n][mid % n];  
2. 要防止变态输入数据，如，居然有[],这样的话n=matrix[0].length就会有问题（越界），所以要增加判断matrix.length==0直接退出



## $349_IntersectionofTwoArrays_BS_E;  
1. 初始化队列、栈的区别Queue<Integer> queue = new LinkedList<Integer>();Queue使用时要尽量避免Collection的add()和remove()方法，而是要使用offer()来加入元素，使用poll()来获取并移出元素。它们的优点是通过返回值可以判断成功与否，add()和remove()方法在失败的时候会抛出异常。 如果要使用前端而不移出该元素，使用element()或者peek()方法  
   Stack<Integer> num=new Stack<Integer>();

Set<Integer> set = new HashSet<>();  
int [] a=new int[set.size()];  
2. 返回类型是数组，判断条件，返回空数组if (nums1.length==0 || nums2.length==0) return new int[0];
3. nums2要排序，找过的元素就不要找了，用while往后移直到没找过的元素。  

## 230_KthSmallestElementinaBST_BS_M  
1. 排序二叉树找第k大的元素，这里每个节点没有设置孩子个数的变量。所以按中序一个个找喽  

## $454_4SumII_BS_M;
1. hash表的运用，可以搜索该文件README.md的hash部分。注意后CD数组循环时，就看sum(ci,dj)是否出现，出现了结果ans就加上getOrDefault(-sum,0);  

## $167_TwoSumIIInputarrayissorted_BS_E  
1. 左右往中间缩  

## 分类器里的交叉验证，uci网站数据集

## 081_SearchinRotatedSortedArrayII_BS_M  与33区别在于有了重复元素  
1. 假设原数组是{1,2,3,3,3,3,3}，那么旋转之后有可能是{3,3,3,3,3,1,2}，或者{3,1,2,3,3,3,3}，这样的我们判断左边缘和中心的时候都是3，如果我们要寻找1或者2，我们并不知道应该跳向哪一半。解决的办法只能是对边缘移动一步，直到边缘和中间不在相等或者相遇，这就导致了会有不能切去一半的可能。所以最坏情况（比如全部都是一个元素，或者只有一个元素不同于其他元素，而他就在最后一个）就会出现每次移动一步，总共是n步，算法的时间复杂度变成O(n)。

## $033_SearchinRotatedSortedArray_BS_M;
1. 把081的拿过来

## $153_FindMinimuminRotatedSortedArray_BS_M  
1. 如果nums[l]<nums[r] 说明已经有序输出左边的。
2. 否则如果nums[l]<=nums[mid] 说明在右边，l=mid +1
3. while 用< 是因为一个元素；if里用<=是因为考虑两元素  

## $154_FindMinimuminRotatedSortedArrayII_BS_M  
1. while (l<r-1 && nums[l]==nums[r] ) l++;加上这一句处理重复，其他和153一样  
2. 看（2）.java
``` java
if (nums[mid]<nums[r]) r=mid;  
else if (nums[mid]==nums[r]) r=r-1;//不好判断只能一个个试  
else l=mid+1;
```

## $162_FindPeakElement_BS_M  
1. 如果nums[mid-1]<mid>mid+1,mid就是  
2. 如果mid-1>mid<mid+1,两个半段都可能；  
3. 如果mid-1>mid>mid+1 在左半段  
4. 如果mid-1<mid<mid+1 在右半段  
综合一下，如果mid<mid+1 在右半段l=mid+1；
否则 r=mid——这种和二分法还是有区别，二分法while里的等于要保留主要是为了找到一个元素，不能错过单个的。我们这里只剩一个了，那个肯定就是，所以不用等于号

## $209_MinimumSizeSubarraySum_BS_M  
1. 法一：双指针，一个不停地扩大，一旦扩大到当前串口内大于等于s，就缩小窗口。缩的时候注意更改答案；此题有两个坑，输入是空，或者所有元素之和小于s;O(n)  
2. 法二是运用二分，sum[i]为0-i所有值的和，锁定左端右端，查找该区域内sum[Left]+s的位置，来更新ans； 

## $278_FirstBadVersion_BS_E   
1. 如果是坏的版本，他有可能是第一个，所以right=mid不用减1；  
2. mid=(left+right)>>1和mid=left+(right-left)/2;为什么前者超时，后者不会——但是运行时在这个例子上超时。 2126753390  1702766719 原因时，两个数字相加之后，就超过了界限。但是如果用left+ (right-left)/2的话则不会过界，好玩吧，嘿嘿嘿，新大陆。

## $069_Sqrt
1. 可以运用牛顿法 f(x)=f(x0)+f'(x0)(x-x0)  ∴ x=x0-f(x0)/f'(x0) 
2. 题目是要保留整数部分注意不要用Math.round()四舍五入  
3. t1=0.5*t0+0.5*x/t0一开始写成了t1=1/2*t0+1/2*x/t0会错误，因为1/2是做整数处理只留了0

## $222_CountCompleteTreeNodes_Tree_M;
1. 主要思路是哪个子树满，就按公式先加上这支子树的节点数，再递归操作另一支 

## $258_AddDigits_E
1. https://en.wikipedia.org/wiki/Digital_root#Congruence_formula  
数位和的问题1+((num-1) % 9)

## $860_LemonadeChange_Greedy_E
1.注意20元有两种找法

## $122_BestTimetoBuyandSellStockII_Greedy_E
1.画出曲线图，谷底买，峰点卖；总利润其实是上坡的和

## $874_WalkingRobotSimulation_Greey_E;
1. 利用hashSet的增加的查找
``` java
Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + " " + obs[1]);
        }
```
查找 set.contains(元素)

2. idea使用，修改一个包内的代码后需要 rebuild，edit configuration里main要写对，build no error check
3. System.out.println(7+8+" "+8+9) 输出 15 89，" "后面自动视为字符

## $861_ScoreAfterFlippingMatrix_Greedy_M;
1. 第一行是都翻为1,后面每列看0与1哪个多,0多的话这一列要翻
 
## $072_EditDistance_DP_H
设函数dist(str1,st2)表示两个字符串str1与str2之间的编辑距离，若0表示空串，则边界条件
- dist(0,str2)=strlen(str2)//都做增加
- dist(str1,0)=strlen(str1)//都做删除

现在求解dist(str1+a,str2+b) (a,b是单个字符)，则
- 若采取str1 转为 str2+b，则要先操作dist(str1,str2+b)步，再加一步删除a
- 若采取str1+a转为str2，则要先操作dist(str1+1,str2),再加一步增加b
- 若采取str1转为上str2， 则根据a==b决定是否做替换，操作为
dist(str1,str2)+1/0；

dist()的参数是两个字符串，实际代码中，使用editDistanTable[i][j]表示str1[0..i-1]到str2[0..j-1]的编辑距离

editDistanTable[i][j]=min{editDistanTable[i-1][j]+1，editDistanTable[i][j-1]+1，editDistanTable[i-1][j-1]+1/0}     





## String_jyg_Solution牛客  
1. if (str == null || str.length()== 0) return 0;//java string判断为空的方法
一、判断一个字符串str不为空的方法有：

　　1、str == null;

　　2、"".equals（str）；

　　3、str.length <= 0;

　　4、str.isEmpty（）；

　　注意：length是属性，一般集合类对象拥有的属性，取得集合的大小。

　　例如：数组。length就是取得数组的长度。

　　length（）是方法，一般字符串类对象有该方法，也是取得字符串长度。

　　例如：字符串。length（）；

　　说明：

　　1、null表示这个字符串不指向任何的东西，如果这时候你调用它的方法，那么就会出现空指针异常。

　　2、""表示它指向一个长度为0的字符串，这时候调用它的方法是安全的。

　　3.、null不是对象，""是对象，所以null没有分配空间，""分配了空间，例如：

　　String str1 = null; str引用为空

　　String str2 = ""; str引用一个空串

　　str1还不是一个实例化的对象，而str2已经实例化。

　　对象用equals比较，null用等号比较。

　　如果str1=null;下面的写法错误：

　　if（str1.equals（""）||str1==null）{ }

　　正确的写法是 if（str1==null||str1.equals（""））{ //所以在判断字符串是否为空时，先判断是不是对象，如果是，再判断是不是空字符串 }

　　4. 所以，判断一个字符串是否为空，首先就要确保他不是null,然后再判断他的长度。

　　String str = xxx;

　　if（str != null && str.length（） != 0） { }

　　二、以下是java 判断字符串是否为空的四种方法：

　　四种方法执行的效率分别如下：

　　JudgeString1耗时：625ms

　　JudgeString2耗时：125ms

　　JudgeString3耗时：234ms

　　JudgeString4耗时：109ms  
2. java中没有结束符这一概念，所以str.length()就是实际长度  
3. java不支持运算符重载 String访问某个字符 不能用str[i] 

## byj_Solution牛客  
/*
两个数异或：相当于每一位相加，而不考虑进位；
两个数相与，并左移一位：相当于求得进位；
将上述两步的结果相加*/ 

## q123_Solution jzoffer
1.  java中||，&&两侧必须要都是Boolean才行
2.  java中不能出现单独一行只是表达式，必须要赋值给别的temp变量。 
3. 这一题利用了短路与性质：boolean t=(n>0) && ((ans+=Sum_Solution(n-1))>0);//短路与，只有当n=0时，不会计算右边； 

## 1000瓶水中找 出有毒的那瓶，毒性一周后发作，一周内最少需要多少只老鼠： 
10只，二进制来表示，第n只喝下第n bit=1的那几杯；第二天，第n只死了，令第nbit=1，第n只未死，令第n bit=0，  

## jzoffer 从尾到头打印链表
1. ArrayList<Integer> arrayList=new ArrayList<Integer>();//ArrayList初始化  
arrayList.add(listNode.val);//ArrayList添加  
## jzoffer 重建二叉树 cxess 从前中序构造二叉树  
1. 注意利用//前序的根+左=中序的左+根

## jzoffer 斐波那契数列  
另一种解法



## 《图解算法》动态规划
1. 每个动态规划都从一个网格开始  
当一个问题（1）依赖于子问题的最优解，（2）子问题重叠，（3）问题存在边界，（4）子问题独立，就可以考虑使用动态规划来解决
2. 不适用的情况
- 使用动态规划时，要么考虑拿走整件商品，要么考虑不拿，而没法判断该 不该拿走商品的一部分；
- 动态规划功能强大，它能够解决子问题并使用这些答案来解决大问题。但仅当 每个子问题都是离散的，即不依赖于其他子问题时，动态规划才管用

4. 步骤  绘制网格，网格的内容，坐标轴
5. git diff也是动态规划，  
6. 最长公共子序列
![](https://ws2.sinaimg.cn/large/006tNbRwly1fwhj2dxh1yj30u805idh0.jpg)

## 《图解算法》图
- Dijkstra算法  
如果有负权边，就不能使用狄克斯特拉算法。
节点一旦被处理，就意味 着没有前往该节点的更便宜途径，

## 《图解算法》K近邻
回归就是预测结果

## 《图解算法》接下来如何做
布隆过滤器可能出现错报，不会漏报

## 二分查找
1. >> 的优先级比 + - 低