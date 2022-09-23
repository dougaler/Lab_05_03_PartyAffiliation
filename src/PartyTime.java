public class PartyTime {
    public static void main(String[] args) {
        System.out.println("Input D R I or Other");
        String partyAff = "J";
        if(partyAff == "D"){
            System.out.println("You get a Democratic Donkey.");
        }else if(partyAff == "R"){
            System.out.println("You get a Republican Elephant.");
        } else if (partyAff == "I") {
            System.out.println("You get an Independent Man.");
        }else{
            System.out.println("You get Other.");
        }
    }
}