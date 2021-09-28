
public class Location
	{
		//region is East, West, South, North
		private String region;
		//50 states
		private String state;
		//significant landmark in each state
		private String landmark;
		//asks if they want to be on the coast
		private boolean isCoastal;
		//asks if they want to go in Summer or Winter
		private boolean isSummer;
		//asks if they have family in the area
		private boolean haveFamily;
		//stay in the city or subarbs?
		private boolean inCity;
		
		
		public String getRegion()
			{
				return region;
			}
		public void setRegion(String region)
			{
				this.region = region;
			}
		public String getState()
			{
				return state;
			}
		public void setState(String state)
			{
				this.state = state;
			}
		public String getLandmark()
			{
				return landmark;
			}
		public void setLandmark(String landmark)
			{
				this.landmark = landmark;
			}
		public boolean isCoastal()
			{
				return isCoastal;
			}
		public void setCoastal(boolean isCoastal)
			{
				this.isCoastal = isCoastal;
			}
		public boolean isSummer()
			{
				return isSummer;
			}
		public void setSummer(boolean isSummer)
			{
				this.isSummer = isSummer;
			}
		public boolean isHaveFamily()
			{
				return haveFamily;
			}
		public void setHaveFamily(boolean haveFamily)
			{
				this.haveFamily = haveFamily;
			}
		public boolean isInCity()
			{
				return inCity;
			}
		public void setInCity(boolean inCity)
			{
				this.inCity = inCity;
			}

		

		
	}