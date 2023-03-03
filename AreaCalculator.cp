#include <iostream>
using namespace std;

double choice, area, base, height, length, width, sidelength, radius;
string choice2;

void menu(){
  cout <<"-----------------------\n";
  cout <<"\n";
  cout << "1) Triangle\n";
  cout << "2) Rectangle\n";
  cout << "3) Square\n";
  cout << "4) Circle\n";
  cout << "5) Quit\n";
  cout << "Which shape: ";
  cin >> choice;
  cout <<"\n";
}

double triangle(int base, int height){
  cout << "base: ";
  cin >> base;
  cout << "height ";
  cin >> height;
  cout <<"\n";
  area = base*height*0.5;
  cout << "The area is "<< area << "\n";
  return base*height*0.5;
}

double rectangle(int length, int width){
  cout << "length: ";
  cin >> length;
  cout << "width: ";
  cin >> width;
  cout <<"\n";
  area = length*width;
  cout << "The area is "<< area << "\n";
  return length*width;
}

double square(int sidelength){
  cout << "sidelength: ";
  cin >> sidelength;
  cout <<"\n";
  area = sidelength*sidelength;
  cout << "The area is "<< area << "\n";
  return sidelength*sidelength;
}

double circle(int radius){
  cout << "radius: ";
  cin >> radius;
  cout <<"\n";
  area = radius*radius*3.14;
  cout << "The area is "<< area << "\n";
  return radius*radius*3.14;
}



int main() {
  do{
    menu();
    if(choice == 1){
      triangle(base, height);
      cout << "try again? (y/n) ";
      cin >> choice2;
    }
    if(choice == 2){
      rectangle(width, length);
      cout << "try again? (y/n) ";
      cin >> choice2;
    }
    if(choice == 3){
      square(sidelength);
      cout << "try again? (y/n) ";
      cin >> choice2;
    }
    if(choice == 4){
      circle(radius*radius*3.14);
      cout << "try again? (y/n) ";
      cin >> choice2;
    }
    if(choice == 5){
      cout << "Goodbye.";
    }
  }while (choice2 =="y");

  if(choice2 == "n"){
    cout << "goodbye.";
  }
}