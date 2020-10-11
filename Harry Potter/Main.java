#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,i;
  cin>>a;
  b=a%10;
 for(i=0;i<3;i++)
  {
    c=a/10;
    a=c+i;
  }
   d=b+c;
  cout<<d;
  return 0;
}