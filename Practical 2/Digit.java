public class Digit
{
public static void main(String args[])
{
int number=632;
int sum=0;
System.out.println("the number is "+number);

while(number > 0)
{

int digit = number % 10;

sum = sum + digit;

number = number / 10;
}

System.out.println("Sum of Digits: "+sum);
}
}