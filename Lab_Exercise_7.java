
interface Store {
    String performAction(String member);
}

interface StoreMember {
    int MemberId(int Id);
}

public class LabExercise_7 {
    public static void main(String[] args) {

        Store welcomeMember = (member) -> "Welcome to PC game site, " + member + "!";
        Store loginInMember = (member) -> member + " has loged in.";
        StoreMember LoginId = (Id) -> Id;

        System.out.println(welcomeMember.performAction("Riya"));
        System.out.println(loginInMember.performAction("Riya"));
        System.out.println(LoginId.MemberId(21));
    }
}
