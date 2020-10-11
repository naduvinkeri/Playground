#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int birth_year;
  cin>>birth_year;
  if(birth_year%4==0)
  {
    if(birth_year%100==0)
    {
      if(birth_year%400==0)
      {
       cout<<birth_year<<" is a leap year" ;
      }
      else
      {
        cout<<birth_year<<" is not a leap year";
      }
    }
    else
    {
      cout<<birth_year<<" is a leap year";
    }
  }
  else
  {
    cout<<birth_year<<" is not a leap year";
  }
  return 0;
}