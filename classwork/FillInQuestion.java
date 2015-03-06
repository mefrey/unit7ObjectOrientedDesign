import java.util.Scanner;
public class FillInQuestion extends Question
{
    // specified text: "__derp?__"
    // this class converts specified text into the prompt and answer
    // text: derp?
    // answer: derp
    public FillInQuestion()
    {
        
    }

    public void setText(String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "___" + parser.next();
        super.setText( question );
        super.setAnswer( answer );
    }

}
