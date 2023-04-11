package math.problems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */




				// Set up database connection
				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "mohammad123");
				} catch (SQLException e) {
					e.printStackTrace();
				}

				// Generate prime numbers and store them in the database
				List<Integer> primes = new ArrayList<>();
				for (int i = 2; i <= 1000000; i++) {
					if (isPrime(i)) {
						primes.add(i);
					}
				}
				try {
					PreparedStatement ps = conn.prepareStatement("INSERT INTO primes (value) VALUES (?)");
					for (int prime : primes) {
						ps.setInt(1, prime);
						ps.executeUpdate();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				// getting prime numbers from the database and count them
				int count = 0;
				try {
					PreparedStatement ps = conn.prepareStatement("SELECT * FROM primes");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						count++;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				// Print the number of prime numbers foun
				System.out.println("Number of prime numbers found: " + count);

				// Closing the connection
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

			//checks for prime number
			public static boolean isPrime(int n) {
				if (n <= 1) {
					return false;
				}
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						return false;
					}
				}
				return true;
			}

		}




