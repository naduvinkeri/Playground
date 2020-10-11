#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main() 
{
  float a,b,c;
  cin>>a >>b;
  c=(a*a)+(b*b);
  c=sqrt(c);
  cout<<setprecision(3)<<c;
}