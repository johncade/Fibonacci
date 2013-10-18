import java.util.HashMap;
import java.util.Map;

public class Main {
static Map<Integer, Integer> valTable = new HashMap<Integer, Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch clock = new Stopwatch();
		clock.start();
		System.out.print(Fib_Iterative(30) + "\n");
		clock.stop();
		System.out.print(clock.toString() + "\n");
		clock.start();
		System.out.print(Fib_Naive(30) + "\n");
		clock.stop();
		System.out.print(clock.toString() + "\n");
		clock.start();
		System.out.print(Fib_Memo(30) + "\n");
		clock.stop();
		System.out.print(clock.toString() + "\n");
		System.out.print("\nAll Done\n");
	}

static int Fib_Iterative(int n)
{
if (n<=1)
	return n;
else
{	
	int prev2 = 0;
	int prev = 1;
	int result = 0;
	for (int i = 2; i <= n; i++)
	{
		result = prev + prev2;
		prev2 = prev;
		prev = result;
	}
	return result;
}
}

static int Fib_Naive(int n)
{
if (n <= 1)
	return n;
else
	return Fib_Naive(n-1) + Fib_Naive(n-2);
}

static int Fib_Memo(int n)
{
	if(n <= 1)
		return n;
	else if(valTable.containsKey(n))
	{
		return valTable.get(n);
	}
	else
	{
		int result = Fib_Memo(n-2) + Fib_Memo(n-1);
		return result;
	}
}
}
