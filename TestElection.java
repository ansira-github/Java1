class Elections{
    String post;
    String candidate;
    int votes;
    public Elections(String post,String candidate){
        this.post=post;
        this.candidate=candidate;
        this.votes=0;
    }
    public void addVote(){
        votes++;
    }
    public void displayResult(){
        System.out.println(candidate+"for"+post+"received"+votes+"votes.");
    }
}
class Students{
    String name;
    public Students(String name){
        this.name=name;
    }
    public void vote(Elections election){
        election.addVote();
        System.out.println(name+"voted for"+election.candidate+"for"+election.post);
    }
}
public class TestElection {
    public static void main(String[] args){
        System.out.println("College Elections have been announced!");
        Elections president = new Elections("President","Anurag R Rao");
        Elections vicePresident = new Elections("Vice President","Bharath Ashok Devadiga");
        Students student1 = new Students("Michael");
        Students student2 = new Students("Emma");
        System.out.println("\nVoting starts:");
        student1.vote(president);
        student2.vote(vicePresident);
        System.out.println("\nElection Results:");
        president.displayResult();
        vicePresident.displayResult();
    }
    
}
