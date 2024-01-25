import java.util.*;

class Numbers{
public static void main(String args[]){
    System.out.println(".....NUMBER GAME......");
    game();
	Scanner s=new Scanner(System.in);int i=0;
    while(i!=1){
    System.out.print("\nOPTIONS\n1.Play again\n2.End the game\nEnter your option ");
    int op=s.nextInt();
    switch(op){
      	case 1:game();break;
	case 2:System.out.println("game over......");i=1;
	}
}
    

}
public static void game(){
 Scanner s=new Scanner(System.in);
    Random rand=new Random();
System.out.println("\n*you have only five chances to guess the number the number must be below 100* ");
int i=1,score=0;
int randint1 = rand.nextInt(100);
System.out.println("...GAME STARTS...");
 while(i<=5){
        System.out.print("\nEnter number :");
        int n=s.nextInt();
        if(n>randint1)
        System.out.println("your guess is high\nTry Again");
        if(n<randint1)
        System.out.println("your guess is low\nTry Again");
        if(n==randint1){
        System.out.println("your guess is correct\n");
	score++;
	break;
        }
        System.out.println("your chances "+i+"/5\n");
	i++;
    }
	if(score==0)
	System.out.println("Sorry your chances are over. Try next game.\n");
}
}