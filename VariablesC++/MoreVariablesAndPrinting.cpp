#include <iostream>
using namespace std;

int main() {
    string myName, myEyes, myTeeth, myHair;
    int myAge, myHeight, myWeight;

    myName = "Ashley Lin";
    myAge = 15;
    myHeight = 165;
    myWeight = 44;
    myEyes = "black";
    myTeeth = "white";
    myHair = "black";

    cout << "Let's talk about " + myName + ". \n";
    cout << "She's " << myWeight << " kgs. \n";
    cout << "She's " << myHeight << "cms tall. \n";
    cout << "She's got " + myEyes + " eyes and " + myHair + " hair. \n";
    cout << "Her teeth are usually " + myTeeth + " depending on the coffee. \n";

    cout << "If I add " << myAge << ", " << myHeight << ", and " << myWeight << ", I get " << (myAge + myHeight + myWeight) << ". \n";
}
