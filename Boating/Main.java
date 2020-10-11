#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int weight,no_ad,no_ch;
  cin>>weight>>no_ad>>no_ch;
  int total_weight_of_adult=no_ad*75;
  int total_weight_of_child=no_ch*30;
  int total_weight=total_weight_of_adult+total_weight_of_child;
  
  if(weight>=total_weight)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
  return 0;
}