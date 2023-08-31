import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingEligiblity votingEligiblity = new VotingEligiblity();
        Scanner sc = new Scanner(System.in);
        votingEligiblity.age = sc.nextInt();
        votingEligiblity.eligible();

    }
}
class VotingEligiblity{
    int age;
    void eligible() {
        if(age < 18)
        {
            System.out.println("Not Eligible to Vote");
        }
        else {
            System.out.println("Eligible to Vote");
        }

    }
}