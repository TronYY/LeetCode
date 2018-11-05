package $394_DecodeString_DFS_M;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
    	Stack<Integer> num=new Stack<Integer>();
    	Stack<String> str=new Stack<String>();
    	str.push("");//�п��ܳ��������ǿմ�����ҪԤ��ѹ�����
    	
    	int i=0;
    	while (i<s.length()) {
    		char ch=s.charAt(i);
    		if (ch>='0' && ch<='9') {
    			String temp=""+ch;
    			do {
    				ch=s.charAt(i+1);
    				if (ch>='0' && ch<='9') temp=temp+ch;
    				else break;
    				i++;    				
    			} while (true);
    			num.push(Integer.parseInt(temp));    			
    		}
    		
    		else if (ch=='[') str.push("");//������д������ ����else���� �������ַ���������ǵ�һ�������ַ�����pop������
    		else if (ch==']') {
    			int t=num.pop();
    			String temp1=str.pop();
    			String temp="";
    			for (int k=0;k<t;k++) temp=temp+temp1;
    			str.push(str.pop()+temp);//���ϵ��ǵȴ��ظ���			
    			
    		}
    		else 
    			str.push(str.pop()+ch);   		
    		i++;
    	}
    	return str.pop();        
    }
}