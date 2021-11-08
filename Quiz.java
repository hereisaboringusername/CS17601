
public class Quiz implements Measurable 
	{
	  
	   private int score;

	 
   public Quiz ( int score)
	   {
	    
	      this.score = score;
	   }

	   /**
	      Measurable interface method to retrieve measure.
	      @return the measured area
	   */
	   public double getMeasure()
	   {
	      return score;
	   }
	}

