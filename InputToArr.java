import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class InputToArr{
   
   private static BufferedReader in;

public ArrayList<Integer> Inputted() throws Exception {
      ArrayList<Integer> nums = new ArrayList<>();
      
      try{
    	    in = new BufferedReader(new FileReader("/Users/juliacai/Desktop/INPUT.txt"));
    	    String s;
    	    nums.add(1000000);
    	    while((s = in.readLine()) != null){

    	        String[] var = s.split(" ");

    	        if(var.length == 2)
    	        {
    	        nums.add(Integer.parseInt(var[1]));
    	        }
    	    }
System.out.println(nums);
    	}catch(Exception e){
    	    e.printStackTrace();
    	}
      
      return nums;
      
  
   }
}