import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserStore {
	HashMap<String, ArrayList<Double>> userMap;
	ArrayList<String> restaurants = new ArrayList<String>();
	public UserStore() {
		userMap = new HashMap<String, ArrayList<Double>>();
	}

	public void createUserStorage(File x) throws IOException {
		BufferedReader sc = new BufferedReader(new FileReader(x));
		String firstline = sc.readLine();
		String[] header = firstline.split("\t");
		int numRests = header.length;
		for (int i = 1; i < numRests; i++){
			restaurants.add(header[i]);
		}
		while(true) {
			String newline = sc.readLine();
			if (newline == null) {
				break;
			}
			String[] info = newline.split("\t");
			int infoLen = info.length;
			ArrayList<Double> dat = new ArrayList<Double>();
			for (int i = 1; i < infoLen; i++) {
				dat.add(Double.parseDouble(info[i]));
			}
			userMap.put(info[0], dat);
		}
		sc.close();
	}
	
	public HashMap<String, ArrayList<Double>> getUserInfo() {
		return userMap;
	}
	public ArrayList<String> getRestaurants(){
		return restaurants;
	}

	public static void main(String[] args) throws IOException {
		UserStore test = new UserStore();
		test.createUserStorage(new File("C:\\Users\\Allen\\Documents\\finalMatrix.txt"));
		HashMap<String, ArrayList<Double>> userInfo = test.getUserInfo();
		ArrayList<String> restaurants = test.getRestaurants();
		int maxUser = 0;
		for (String s: userInfo.keySet()) {
			int user = Integer.parseInt(s);
			maxUser = Math.max(user, maxUser);
			System.out.println("User: " + s);
			ArrayList<Double> k = userInfo.get(s);
			int numRatings = k.size();
			for (int i = 0; i < numRatings; i++) {
				System.out.println("Restaurant: " + restaurants.get(i));
				System.out.println("Rating: " + k.get(i));
			}
		}
		System.out.println("Max User: " + maxUser);
	}

	
}


