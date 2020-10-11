#include <iostream> 
#include <cctype>
using namespace std; 

int main(){
    int n,m,a,i=1,sum=0;
    cin >> n>>m;
    a=n+m;
       while(i<a){
       if(a%i==0)
       sum=sum+i;
       i++; 
}
 
if(sum==a)
    cout << "They can read the message"; 
else
    cout << "They can't read the message";
    return 0;
}