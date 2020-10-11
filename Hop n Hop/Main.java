#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x1=3,y1=4,x2,y2;
cin>>x2>>y2;  
int c_sq=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));  //instead of this you use pow function also.
int d=sqrt(c_sq);
  
  cout<<d;
  return 0;
}