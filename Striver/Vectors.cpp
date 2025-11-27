#include<bits/stdc++.h>
using namespace std;

void vectors() 
{
    //Dynamic in nature - Sizes can be increased
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);
    vector<pair<char,char>> v1;
    v1.push_back({'A','V'});
    vector<int> v2(v);
    cout << "Hello" << v << "\n" << v1 << "\n" << v2;
}


int main() 
{
    vectors();
    return 0;
}