package calculator;

public class WeirdStuff {
    public static String isItTheAnswerToUltimateQuestionOfLife(int n) {
        if (n < 0 || n > 100) return "Definetely no!";
        else if ((n > 0 && n < 10) || (n > 90)) return "Rather no";
        else if (n >= 10 && n < 20 || (n > 80)) return "Well no...";
        else if (n >= 20 && n < 30 || (n > 60)) return "No but close...";
        else if (n >= 30 && n < 40 || (n > 50)) return "No but close...";
        else if ((n >= 40 && n < 42) || (n > 42 && n < 50)) return "Almost there!";
        else if (n==42) return "Exactly!";
        else return "That should not happen at all";
    }
}
