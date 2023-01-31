#include <iostream>
using namespace std;

int main() {
    double height, weight;
    string room, furniture, choice, room2;

    cout << "WELCOME TO MITCHELL'S TINY ADVENTURE!";
    cout << "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"? ";
    cin >> room;

    if(room == "kitchen"){
        cout << "There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". ";
        cin >> furniture;
        if(furniture == "refrigerator")
        {
            cout << "Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\") ";
            cin >> choice;
            if (choice == "yes")
            {
                cout << "You survived "; 
            }
            else
            {
                cout <<"You die of starvation... eventually. "; 
            }
        }
        else
            {
                cout<<"Inside the cabinet. you see jam. Would you like to eat some of the jam? (\"yes\" or \"no\")";   
                cin >> choice;
                if (choice == "yes")
                {
                    cout << "You survived "; 
                }
                else
                {
                    cout << "You die of starvation... eventually. "; 
                }
            }
    }
    else
        {
            cout << "Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?" ;   
            if (room2 == "bedroom")
            {
                cout << "You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\") ";
                cin >> choice;
                if (choice == "yes")
                {
                    cout << "good... "; 
                }
                else
                {
                    cout << "Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements."; 
                }
            }
            else
            {
                cout << "You are in a bathroom, would you like to open door? (\"yes\" or \"no\")";   
                cin >> choice;
                if (choice == "yes")
                {
                    cout << "good... "; 
                }
                else
                {
                    cout << "Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements. "; 
                }
            }
        }
    }