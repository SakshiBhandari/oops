package oops.basics;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class FacebookUser {
    public static int mostVotes(int[] votes){
        int userWithMostVotes = votes[0];
        for(int i = 0; i<votes.length; i++){

            if (votes[i] > userWithMostVotes){
                userWithMostVotes = i;
            }

        }
        return userWithMostVotes;
    }

    public static void main(String[] args){
        int[] a = {2,3,5,6,7,4,7,1};
        System.out.println(mostVotes(a));
    }
}

