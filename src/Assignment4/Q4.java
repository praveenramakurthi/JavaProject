package Assignment4;

public class Q4 {

    public static void towersOfHanoi(int n, char source, char auxillary, char destination){
        if(n==1){
            System.out.println("Disk 1 is place from "+source+" to "+destination);
            return;
        }
        //disk move from source to auxillary
        towersOfHanoi(n-1,source,destination,auxillary);
        //moves the largest  to destination
        System.out.println("Disk "+n+" is placed from "+source+" to "+destination);
        //Move the n-1 disks from auxiliary to destination
        towersOfHanoi(n-1,auxillary,source,destination);
    }
    public static void main(String[] args) {
        int numDisks=3;
        System.out.println("Steps to solve Towers of Hanoi with " + numDisks + " disks:");
        towersOfHanoi(numDisks,'A','B','C');
    }
}
