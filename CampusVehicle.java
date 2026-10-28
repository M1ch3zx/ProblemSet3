package edu.monmouth.campusvehicle;

public class CampusVehicle {
	
	
	//Attributes
	private String id;
	private String location; 
	private Color color; 
	private boolean available;
	
	private static final String UNKNOWN = "unknown";
	
	//Default constructor 
	public CampusVehicle() { 
		this(null, null, false);
	}	
	
	// Constructor with three attributes 
	public CampusVehicle(String id, String location, boolean available) { 
		
		this(id, location, available, Color.UNKNOWN);
		
	}
	
	// Constructor with four attributes
	public CampusVehicle(String id, String location, boolean available, Color color) {
		
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color);
	}
	
	// Accessor for id 
	public String getId() { 
		return id;
	}
	
	// Mutator for id 
	public void setId(String id) {
		if (id == null || id.length() < 6
				|| id.length() > 18 
				|| !id.substring(0,2).equalsIgnoreCase("MU")) {
			this.id = UNKNOWN;
		} else { 
			this.id = id.toLowerCase();
		}
	}
	
	// Accessor for location 
	public String getLocation() { 
		return location; 
	}
	
	// Mutator for location
	public void setLocation(String location) { 
		if (location != null
				&& (location.equalsIgnoreCase("Library")
				|| location.equalsIgnoreCase("University Bluffs")
				|| location.equalsIgnoreCase("Parking Lot")
				|| location.equalsIgnoreCase("Spruce Hall")
				|| location.equalsIgnoreCase("Laurel Hall"))) {
		    this.location = location.toLowerCase();
	    } else { 
	    	this.location = UNKNOWN;
	    }
	}
	    	
	  // Accessor for availability 
      public boolean isAvailable() { 
    	  return available; 
    	  
      }
	   
      // Mutator for availability 
      
      public void setAvailable(boolean available) {
    	  this.available = available; 
    	  
      }
	
      // Mutator for color 
      public void setColor(Color color) { 
    	  if (color == null) { 
    		  this.color = Color.UNKNOWN;
    	  } else { 
    		  this.color = color; 
    	  }
      }
      
      // Accessor for color 
      
      public Color getColor() { 
    	  return color; 
      }
      
      // Check out a vehicle if it is available 
      public void checkOut() { 
    	  if (available) { 
    		  available = false; 
    	  }
      }
    	 
      // Maintain compatibility with the old method name
      public void checkout() { 
    	  checkOut(); 
      }
      
      // Return a vehicle 
      public void returnVehicle() { 
    	  available = true; 
      }
      
}
