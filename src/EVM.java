import java.util.*;
public class EVM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] votes={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
        int[] rolls = {20,36,51,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,71,72,75,76,77,79,81,82,84,86,87,88,89,90,91,92,93,94,95,96,97,99,100,101,102,103,104,106,107};
        String[] names={"Attia","Junaid","Afzal","Ali","Arslan","Sikander","Daniyal Haider","Daniyal Rana","Daud","Fasih","Hussnain","Huzaifa","Ibrahim","Kabeer","Kashan","Kashif","Moiz","Mughees","Muneeb","Safi Ullah","Shahmir","Shahroz","Wasique","Zubair","Muneeb Aslam","Mutee","Noor Ul Huda","Noor Ul Huda Shoukat","Romaisa","Saffa","Sammar","Shahzeb","Shaiq","Shayan","Sidra","Summiya","Faizan","Taha","Fabeha","Taqdees","Touheed","Waleed","Warda","Zain","Zeenia","Zillehuma","Zobia","Laiqa","Shaheer"};
        int CRs=0;
        int GRs=0;
        int TotalVotes=0;
        int cond1=0;
        int cond2=0;

        while (true){
            System.out.println("\nTo start voting enter 1:\nTo view candidates enter 2:\nTo view voters list enter 3:");
            int option = input.nextInt();
            if(option==3){
                System.out.println("Reg no | Name");
                for(int a=0;a<rolls.length;a++){
                    System.out.println(rolls[a]+":   "+names[a]);
                }
            }
            else if(option==2){
                System.out.println("The candidates for the election are:\n1. CR Muhammad Ali\n2. GR Sidra Zaidi\n");
            }
            else if(option==1){
                while (true){
                    for(int d=0;d<votes.length;d++){
                        if(votes[d]=="")
                            cond2=1;
                        break;
                    }
                    if(cond2==0){break;}
                    else{
                        System.out.println("Enter your registeration number to cast vote.To finish voting enter '9999'.");
                        int regno=input.nextInt();
                        if(regno==9999){
                            break;
                        }
                        else{
                            boolean cond=false;
                            while(true){
                                for (int i =0;i<rolls.length;i++){
                                    if(regno==rolls[i]){
                                        for(int x=0;x<votes.length;x++){
                                            if(votes[i]=="Done"){cond1=1;break;}
                                        }
                                        if (cond1==1){System.out.println(names[i]+" You have already casted your vote.");   break;}
                                        else if (cond1!=1){
                                            while (true){
                                                System.out.println("Welcome to the election portal "+names[i]+"!");
                                                System.out.println("To cast vote for CR, Enter 1\nTo cast vote for GR, Enter 2");
                                                int VOTE=input.nextInt();
                                                if(VOTE==1){
                                                    CRs+=1;
                                                    break;
                                                }
                                                else if(VOTE==2){
                                                    GRs+=1;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("Wrong Input");
                                                }}
                                            TotalVotes+=1;
                                            votes[i]="Done";
                                            System.out.println(votes[i]+votes[i+1]+votes[i+2]);
                                            System.out.println("Your vote has been casted.\n");
                                            cond=true;
                                            break;
                                        }}
                                }
                                if(cond==false && cond1==0){
                                    System.out.println("Your entered reg number is not registered.");
                                    break;
                                }
                                else{
                                    cond1=0;
                                    cond=false;
                                    break;
                                }
                            }
                        }
                    }}
                break;
            }

        }
        System.out.println("\nThe result of election is as follows:\n");
        System.out.println("Total Votes:"+TotalVotes);
        System.out.println("CRs votes:"+CRs);
        System.out.println("GRs Votes:"+GRs);
        if (CRs==GRs){
            System.out.println("Both have got equal votes.");}
        else if(CRs>GRs){
            System.out.println("\nCongratulations CR Muhammad Ali!, you have got more votes than GR Sidra Zaidi.");
        }
        else if(GRs>CRs){
            System.out.println("\nCongratulations GR Sidra Zaidi!, you have got more votes than CR Muhammad Ali.");
        }
        while(true){
            System.out.println("\nTo view list of voters who casted there vote enter 1:\nTo view list of voters who did not caste there vote enter 2:\nTo exit enter 3:");
            int voterslist=input.nextInt();
            if(voterslist==1){
                System.out.println("The voters who casted there vote are: ");
                System.out.println("Reg no | Name");
                for (int m=0;m<votes.length;m++){
                    if(votes[m]=="Done"){
                        System.out.println(rolls[m]+":   "+names[m]);}
                }}

            else if(voterslist==2){
                System.out.println("The voters who did not cast their vote are: ");
                System.out.println("Reg no | Name");
                for (int m=0;m<votes.length;m++){
                    if(votes[m]!="Done"){
                        System.out.println(rolls[m]+":   "+names[m]);}
                }}
            else if(voterslist==3){
                System.out.println("Evaluation completed.");
                break;
            }
        }
    }
}
