#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  float temp=0.5;
  for(int i=0;i<a;i++)
  {
    std::cout<<temp<<" ";
    temp=temp*3;
  }
}