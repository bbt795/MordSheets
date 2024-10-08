package me.billbominecraft.mordsheets.utils;

public class RollUtil {

    public static String resultMessage(int diceroll){

        String result;

        switch(diceroll){

            case 1:
            case 2:
            case 3:
            case 4:
                result = "Catastrophic Penalty";
                break;

            case 5:
            case 6:
            case 7:
            case 8: //an
                result = "Major Penalty";
                break;

            case 9:
            case 10:
            case 11: //an
            case 12:
                result = "Minor Penalty";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                result = "Neutral Penalty";
                break;

            case 17:
            case 18: //an
            case 19:
            case 20:
                result = "No Penalty";
                break;

            default:
                result = "ERROR";
                break;

        }

        if(diceroll > 20){

            result = "No Penalty";

        } else if (diceroll < 1){

            result = "Catastrophic Penalty";

        }

        return result;

    }

}
