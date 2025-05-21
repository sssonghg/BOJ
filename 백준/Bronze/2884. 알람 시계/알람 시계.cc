#include <iostream>
using namespace std;

int main(){
    int a, b;
    cin >> a >> b;
    if(b >= 45) cout << a << ' ' << b-45;
    if(b<45){
        b += 60;
        a--;
        if(a<0) cout << 23 <<' '<< b-45;
        else cout << a << ' ' << b-45;
    }
}