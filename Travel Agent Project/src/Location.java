
public class Location
	{
		//region is East, West, South, North
		private String region;
		//50 states
		private String state;
		//significant landmark in each state
		private String landmark;
		//asks if they want to be on the coast
		private boolean havePool;
		//asks if they want to go in Summer or Winter
		private boolean isWinter;
		//asks if they have family in the area
		private boolean haveFamily;
		//stay in the city or subarbs?
		private boolean inCity;
		
		public Location(String r, String s, String l, boolean p, boolean w, boolean f, boolean i)
		{
			region = r;
			state = s;
			landmark = l;
			havePool = p;
			isWinter = w;
			haveFamily = f;
			inCity = i;
		}
		
		
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
		public boolean havePool()
			{
				return havePool;
			}
		public void setHavePool(boolean havePool)
			{
				this.havePool = havePool;
			}
		public boolean isWinter()
			{
				return isWinter;
			}
		public void setWinter(boolean isWinter)
			{
				this.isWinter = isWinter;
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