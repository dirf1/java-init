package p08;

public class RemoconExec {


	
	public static void main(String[] args) {
	
			
			
			Remote[] remotes = new Remote[2];
			remotes[0] =new AirconRemocon();
			remotes[1] =new TVRemoconA();
			
				for (int i= 1;  i<remotes.length; i++) {
					remotes[i].on();
					remotes[i].off();
					remotes[i].up();
					remotes[i].down();
					
				}
		}
	
	
		

				
		
	}

