#include<bits/stdc++.h>
using namespace std;


void pairs() 
{
    pair<int, int> p = {1,3};
    cout << p.first << " " << p.second << "\n";
    pair<int, pair<int, int>> pr = {1,{3,4}};
    cout << pr.first << " " << pr.second.second << " " << pr.second.first << "\n";
    pair<int, int> arr[] = {{1,2},{3,4},{5,6}};
    cout << arr[1].second;
}



int main() 
{
    pairs();
    return 0;
}