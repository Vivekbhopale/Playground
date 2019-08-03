#include<iostream>
#include<bits/stdc++.h>
using namespace std;
main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  int ar[3]={a,b,c};
  sort(ar,ar+3,greater<int>());
  cout<<ar[1];
    
}