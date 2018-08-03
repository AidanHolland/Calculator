package calculator;


public class Calculate 
{
    
    Calculate(float num1, char operator, float num2)
    {
        switch(operator)
        {
            case '+':
                add(num1, num2);
                break;
            case '-':
                subtract(num1, num2);
                break;
            case '*':
                multiply(num1, num2);
                break;
            case '/':
                divide(num1, num2);
                break;
        }
        
    }
    
    float add(float num1, float num2)
    {
        return num1 + num2;
    }
    
    float subtract(float num1, float num2)
    {
        return num1 - num2;
    }
       
    float multiply(float num1, float num2)
    {
        return num1 * num2;
    }
          
    float divide(float num1, float num2)
    {
        if(num2 == 0)
        {
            return 0;
        }
        return num1 / num2;
    }
             
             
}
