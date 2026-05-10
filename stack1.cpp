#include<iostream>
using namespace std;

#define MAX 100

class StackArray
{
    int top;
    int arr[MAX];

public:

    StackArray()
    {
        top = -1;
    }

    bool push(int x)
    {
        if(top >= MAX - 1)
        {
            cout << "Stack Overflow\n";
            return false;
        }

        top++;
        arr[top] = x;

        cout << x << " pushed into stack\n";
        return true;
    }

    int pop()
    {
        if(top < 0)
        {
            cout << "Stack Underflow\n";
            return 0;
        }

        int value = arr[top];
        top--;

        return value;
    }

    int peek()
    {
        if(top < 0)
        {
            return 0;
        }

        return arr[top];
    }

    bool isEmpty()
    {
        if(top < 0)
        {
            return true;
        }

        return false;
    }
};

int main()
{
    StackArray k;

    k.push(10);
    k.push(30);
    k.push(33);

    cout << k.pop() << " poped from stack";

    cout << "\nTop element is : " << k.peek() << endl;

    return 0;
}
