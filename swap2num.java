

//User function Template for Java

class Solution{
    static List<Integer> get(int a,int b)
    {
        List<Integer> k=new ArrayList<Integer>();
        a=a+b;
        b=a-b;
        a=a-b;
        k.add(a);
        k.add(b);
        return k;
        // code here
    }
}
