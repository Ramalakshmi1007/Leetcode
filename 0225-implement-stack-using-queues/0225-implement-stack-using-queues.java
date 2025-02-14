class MyStack 
{
  
   Queue<Integer> q1=new LinkedList();
    Queue<Integer> q2=new LinkedList();      
    
    public void push(int x)
    {
           q2.add(x);
           while(!q1.isEmpty())
           {
            q2.add(q1.remove());
           }
        Queue q=q1;
        q1=q2;
        q2=q;
    }
    
    public int pop()
    {
       return q1.remove();
    }
    public int top()
    {
      return q1.peek();   
    }
    
    public boolean empty()
    {
       if(q1.isEmpty())
         return true;
       else
         return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */