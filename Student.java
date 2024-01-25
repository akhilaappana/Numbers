import java.util.*;
class Student{
    public static void main(String args[]){
        System.out.println("\n........Students Marks List........");
        Scanner s=new Scanner (System.in);
        System.out.print("Enter no of students: ");
        int n=s.nextInt();
        int[] a=new int[n];
        read(a,n);

    }
    public static void read(int[] total,int n){
        int i=0; 
        Scanner s=new Scanner (System.in);
        String[] name=new String[n];
        String[] roll_num=new String[n];
        char[] math=new char[n];
        char[] science=new char[n];
        char[] social=new char[n];
        char[] telugu=new char[n];
        char[] hindi=new char[n];
        char[] english=new char[n];
        while(i<n){
            System.out.print("\nEnter student name   : ");
            name[i]=s.nextLine();
            System.out.print("Enter Register number: ");
            roll_num[i]=s.nextLine();
            System.out.println("Enter subject marks(marks must be less than 100)");
            System.out.print("Telugu= ");
            int k=s.nextInt();
            total[i]=k;
            telugu[i]=compare(k);
            System.out.print("Hindi= ");
            k=s.nextInt();
            total[i]+=k;
	    hindi[i]=compare(k);
            System.out.print("English= ");
            k=s.nextInt();
            total[i]+=k;
            english[i]=compare(k);
            System.out.print("Maths= ");
            k=s.nextInt();
            total[i]+=k;
            math[i]=compare(k);
            System.out.print("Science= ");
            k=s.nextInt();
            total[i]+=k;
            science[i]=compare(k);
            System.out.print("social= ");
            k=s.nextInt();
            total[i]+=k;
            social[i]=compare(k);
		s.nextLine();
		i++;
        }
	System.out.println("\nSearch Student Result");
	i=0;
	while(i!=1){
	System.out.print("\nEnter register number(*if you want to exit enter exit*): ");
        String search=s.nextLine();
	if(search.equalsIgnoreCase("exit")==true)
	break;
        display(name,roll_num,telugu,hindi,english,math,science,social,total,search);
	}
    }
    public static char compare(int n){
        if(90<=n&&n<=100)
        return 'A';
        if(80<=n&&n<=89)
        return 'B';
        if(70<=n&&n<=79)
        return 'C';
        if(60<=n&&n<=69)
        return 'D';
        if(50<=n&&n<=59)
        return 'E';
        if(40<=n&&n<=49)
        return 'E';
        if(n<40)
        return 'F';
return 0;
    }
    public static void display(String[] name,String[] roll,char[] telugu,char[] hindi,char[] english,char[] math,char[] science,char[] social,int[] total,String n){int i;
        for( i=0;i<name.length;i++){
	if(roll[i].equalsIgnoreCase(n)){
           	System.out.println("\nName             : "+name[i]);
		System.out.println("Register number  : "+roll[i]);
                System.out.println("Telugu           : "+telugu[i]);
                System.out.println("Hindi            : "+hindi[i]);
                System.out.println("English          : "+english[i]);
                System.out.println("Maths            : "+math[i]);
                System.out.println("Science          : "+science[i]);
                System.out.println("Social           : "+social[i]);
                System.out.println("                         Total marks        : "+total[i]);
		double ans=((double)total[i])/600;
                System.out.printf("                         Average percentage : %.2f%%",ans*100);
		break;
	}
    }
	if(i>=name.length)
	System.out.println("Invalid register number");
            

    }
}