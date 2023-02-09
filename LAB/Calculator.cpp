#include <iostream>
#include <cmath>
using namespace std;

int choice1, answer;
double num1, num2;
string choice2;

double addition(double num1, double num2) {
  cout << "answer :" << num1 + num2 << "\n";
  return num1+num2;
}
double substraction(double num1, double num2) {
  cout << "answer :" << num1 - num2 << "\n";
  return num1-num2;
}
double multiplication(double num1, double num2) {
  cout << "answer :" << num1 * num2 << "\n";
  return num1*num2;
}
double division(double num1, double num2){
  if(num1 == 0){
    cout << "answer: N/A \n";
  }
  else{
    cout << "answer :" << num1 / num2 << "\n";
  }
  return(num1/num2);
}
double exponent(double num1, double num2) {
  cout << "answer: " << exponent(num1, num2) << endl;
  return pow(num1, num2);
}


void choose_the_number(){
  cout << "num1:\n";
  cin >> num1;
  cout << "num2:\n";
  cin >> num2;
}


int main(){
  do{
    cout << "Enter the function you wish to perform.\n";
    cout << "1) addition \n";
    cout << "2) substraction \n";
    cout << "3) multiplication \n";
    cout << "4) division \n";
    cout << "5) exponent \n";
    cout << "6) quit \n";
    cout << "your choice: \n";
    cin >> choice1;
  
    if(choice1 == 1){
      choose_the_number();
      addition(num1, num2);
      cout << "try again(y/n)";
      cin >> choice2;
    }
    if(choice1 ==2){
      choose_the_number();
      substraction(num1, num2);
      cout << "try again(y/n)";
      cin >> choice2;
    }
    if(choice1 == 3){
      choose_the_number();
      multiplication(num1, num2);
      cout << "try again(y/n)";
      cin >> choice2;
    }
    if(choice1 == 4){
      choose_the_number();
      division(num1, num2);
      cout << "try again(y/n)";
      cin >> choice2;
    }
    if(choice1 == 5){
      choose_the_number();
      cout << "try again(y/n)";
      cin >> choice2;
    }
    if(choice1 == 6){
      cout << "bye\n";
    }
    
  }
  while(choice2 == "y");
  

  
}

    
    