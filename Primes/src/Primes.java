public class Primes 
{
	public static void main(String[] args)
	{
		int b = 2;
		while (b != 100)					// ���� ��� �������� ���� �������� �� 2 �� 100
		{
			if (isPrime(b))					// ��������� ������� �� �����
			{
				System.out.println(b);		// ������� �����
			}
			b ++;
		}
	}
	public static boolean isPrime(int n)	// ������� ��� �������� ����� 
	{
		int count = 2;
		while (count != 100)				// ���� ��� �������� �������� 
		{
			if (count != n)
			{
				if (n % count == 0)			// �������� �� ���������
				{
					return false;
				}
			}
			count ++;
		}
		return true;
	}
}
