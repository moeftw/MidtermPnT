package datastructure;
import databases.ConnectToSqlDB;

import java.util.*;
public class UseMap {

	public static void main(String[] args) throws Exception {

		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		HashMap<Object, Object> map = new HashMap<>();
		map.put(2120, "Mohammad");
		map.put(2038, "Osama");
		map.put(8467, "Baruch");


		Iterator<Object> mapIt = map.keySet().iterator();
		Object key;
		while (mapIt.hasNext()) {
			key = mapIt.next();
			System.out.println("KEY: " + key);
			System.out.println("VALUE: " + map.get(key));
		}


		String tableName = "`test_hash_map`";
		ConnectToSqlDB sql = new ConnectToSqlDB();


	}
}


