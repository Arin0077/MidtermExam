package status;

import java.util.Scanner;
/*
@author Arin Sharma 991667506
*/
public class Status {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0, 1, 2, 3)");
        int code = in.nextInt();
        StausUser statusUser = new StausUser();
        statusUser.statusDetail(UserStatus.fromCode(code));
    }
}