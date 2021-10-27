
public class Stack {

    int stack[]=new int[5];
    int top=0;
    
    public void push(int data)
    {
       stack[0]=data;
       top++;  //after push and increment
    }
    
    public int pop()
    {
    	int data;
    	top--;
    	data=stack[top]; //get the data
    	stack[top]=0;
    	return data;
    }


    public void show() //create a method to print entire stack
    {
        for (int n:stack)
        {

            System.out.print(n + " ");
        }

    }

}
