import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram
{   
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//System.out.println("Enter No of Words: ");
		int n = Integer.parseInt(br.readLine());
		String arr[] = br.readLine().split(" ");
		ArrayList<String> check = new ArrayList<>();
		ArrayList<List<String> > result = new ArrayList<>();
		HashMap<String, ArrayList<String> > occ = new HashMap<>();
		for(int i=0; i<n; i++)
		{
		    char a[] = arr[i].toCharArray();
		    Arrays.sort(a);
		    String k = String.valueOf(a);
		    ArrayList<String> grp = new ArrayList<>();
		    if(occ.containsKey(k))
		    {
		        grp = occ.get(k);
		    }
		    if(!check.contains(k))
		    {
		        check.add(k);
		    }
		    grp.add(arr[i]);
		    occ.put(k, grp);
		}
		for(String k : check)
		{
		    result.add(occ.get(k));
		}
		System.out.println(result);
	}
}