#include<iostream>
using namespace std;
void swap (int &num1,int &num2) 
{
  int temp;
  temp=num1;
  num1=num2;
  num2=temp;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping"<<" a= "<<a<<" and b="<<b<<endl;
  swap(a,b);
  std::cout<<"After swapping"<<" a= "<<a<<" and b="<<b<<endl;
  return 0;
}