import java.util.Scanner;


public class Woodruff_p3 {
	static String[] s = {" Ocean Pollution ", " Poachers ", " Vaping/Juuling ", " Guns ", " Border Control "};
	  static int[][] c = new int [5][10]; 


	  public static void main(String[] args) {
	  double[] total = new double [] {
	    0,0,0,0,0
	  };
	  double average = 0;

	  Scanner in = new Scanner(System.in);

	  for (int i = 0; i < 10; i ++){
	       for(int j = 0; j < 5; j++){
	          System.out.print("Issue rating 1-10: \n" + (j + 1) + ":" + s[j]);
 
	          c[j][i] = in.nextInt();
	       }     
       
	  }
	

	    System.out.println("Survey Results: ");
	    for(int i = 0; i < 5; i++){
	      System.out.print("\n" + (i + 1) + ":" + s[i]);

	      for(int j = 0; j < 10; j++){
	        System.out.println(c[i][j] + "\t");
	        total [i] = total [i] + c[i][j];
	      }

	        average = total [i] / 10;
	        System.out.println("average: " + average);
	     }

	      double max = total[0];
	      double min = total[0];

	      int maxIssue = 0;
	      int minIssue = 0;

	      for(int i = 0; i < 5; i++){
	        if (max < total [i]){
	          max = total[i];
	          maxIssue = i;
	          }
	        if (min > total[0]){
	          min = total[0];
	          minIssue = i;
	        }
	      }

	    in.close();

	    System.out.println("");
	    System.out.println("Highest rated issue: " + s[maxIssue] + "\tRatings: " + max);
	    System.out.println("Highest rated issue: " + s[minIssue] + "\tRatings: " + min);
	    
	    

	  }
}
