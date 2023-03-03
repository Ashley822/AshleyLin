#include <iostream>
using namespace std;

void credits() {
  cout << "programmed by Graham Mitchell\n";
  cout << "modified by [your name here]\n";
  cout << "This code is distributed under the terms of the standard \n";
  cout << "BSD license.  Do with it as you wish.\n";
}
string randchar(){
  int n=1;
  int MAX = 26;
  char alphabet[26] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                          'h', 'i', 'j', 'k', 'l', 'm', 'n',
                          'o', 'p', 'q', 'r', 's', 't', 'u',
                          'v', 'w', 'x', 'y', 'z' };
 
    string res = "";
    for (int i = 0; i < n; i++)
      res = res + alphabet[rand() % MAX];
     
    return res;
}
void counter(int start, int stop){
	int ctr;
	ctr = start;
	while ( ctr <= stop )
	{
		cout<< ctr << " ";
		ctr = ctr+1;
	}
}

int abso(int value){
	int absval;
	if ( value < 0 )
		absval = -value;
	else
		absval = value;
	return absval;
}

int main() {
  cout<<"Watch as we demonstrate functions.\n";

	cout<<"I'm going to get a random character from A-Z\n";
	cout<<"The character is: " << randchar() <<"\n" ;

	cout<<"Now let's count from -10 to 10\n";
	int begin, end;
	begin = -10;
	end = 10;
	counter(begin, end);
	cout<<"\nHow was that?\n";

	cout<<"Now we take the absolute value of a number.\n";
	int x, y = 99;
	x = -10;
	y = abso(x);
	cout<<"|" << x << "| = " << y <<"\n";
	cout<<"That's all.  This program has been brought to you by:\n";
	credits();
}
