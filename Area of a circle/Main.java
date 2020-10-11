#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main() 
{
   float d,area,r;
  cin>>d;
  r=d/2;
  if(r>0)
  {
   area=3.14*r*r;
    cout<<setprecision(4)<<area;
  }
}