import  java.util.ArrayList;
import  java.util.Arrays;

public class ListPractice {
    public static void main(String[] args) {

        System.out.println("\nArray practice list\n");



        ArrayList<String> myFriendsList = new ArrayList<>();
        // Add five friends to my list
        myFriendsList.add("Joel");
        myFriendsList.add("Alex");
        myFriendsList.add("John");
        myFriendsList.add("Daniel");
        myFriendsList.add("Eric");

        System.out.println("\n My Fifth friend is " + myFriendsList.get(4));

        System.out.println("\n The size (of number of elements) " + myFriendsList.size());

        // Set change the data in an element
        myFriendsList.set(0, "Tony");
        System.out.println("\n My first friend is now...  " + myFriendsList.get(0));

        myFriendsList.remove(2);

        // output the list without a for loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1;


        // output the list with a for/each loop
        for (String s : myFriendsList) {
            System.out.println("\n Friends  " + myFriendNumber + " is " + s);

            myFriendNumber++;
        }

        // add list elements with a for loop
        for (int i = 0; i < 10; i++){
            // use .add()
            myFriendsList.add(i+4, "New friend");
            System.out.println("new friend added to list");
        }

        System.out.println((myFriendsList));

        for (int i = 0; i < myFriendsList.size(); i++){
            System.out.println("\n Friends  " + myFriendNumber + " is " + myFriendsList.get(i));

            myFriendNumber++;
        }

        // Write a for/each loop to output the list





    }
}