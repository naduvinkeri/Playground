#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit_consumed,bill;
  cin>>unit_consumed;
  if(unit_consumed<=200)
  {
   bill=float(0.5*unit_consumed);
   cout<<"Rs."<<bill;
  }
  else if(unit_consumed<=400)
  {
   bill=float((0.65*unit_consumed)+100);
   cout<<"Rs."<<bill;
  }
  else if(unit_consumed<=600)
  {
   bill=float((0.80*unit_consumed)+200);
   cout<<"Rs."<<bill;
  }
  else if(unit_consumed>600)
  {
   bill=float((1.25*unit_consumed)+425);
   cout<<"Rs."<<bill;
  }
  return 0;
}