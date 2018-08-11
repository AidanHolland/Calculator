
package calculator;

public class ProcessInput 
{
    
    void GUI_Input()
    {
    }
    
    void CLI_Input(String input)
    {
        
        int firstIndex;
        int secondIndex;
        int thirdIndex;
        float var1;
        float var2;
        char operator;
        //Scan through input, detect first number, place into variable
        for(int i = 0; i < input.length(); i++)
        {
            Character c1 = new Character(input.charAt(i));
            boolean digit = Character.isDigit(input.charAt(i));
            boolean whitespace = Character.isWhitespace(input.charAt(i));
            boolean letter = Character.is(input.charAt(i));
            
            //if char is 0 - 9 or .
            if(digit == true || input.charAt(i) == '.')
            {
                
            }
            //Extract from substring to float
            var1 = Float.valueOf(input.substring(1, 5));
            
            //get index of char
            //if char is + - / * or ' '
            //get current index for operator value
            //get previous index of char
            //get substring of index and cast to float, put into var 1
            //
        }
        
        
        //Find first symbol, extract into char variable
        //Find second number, place into second variable
        //Call Calculate
        // Receive variable back, place into first variable
        //Find next symbol (if no symbol then return), place into char variable
        //Find next number (if no number then return previous number), place into second variable
        //Call Calculate
        
        
    }
    
    
}
