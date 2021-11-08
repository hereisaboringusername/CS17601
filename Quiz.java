
public class Quiz implements Measurable 
	{
	  
	   private double score;

	 
   public Quiz ( double score)
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


