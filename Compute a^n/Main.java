#include <iostream> 
using namespace std; 
int FindPower(int base, int power) {
   if (power == 0)
      return 1;
   else
      return (base * FindPower(base, power-1));
}  
int main() {
   int base, power;
   cout<<"Enter the value of a"<<endl;
   cout<<"Enter the value of n"<<endl;
   cin>>base;
   cin>>power;
   cout<<"The value of "<<base<<" power "<<power<<" is "<<FindPower(base, power);
   return 0;
}