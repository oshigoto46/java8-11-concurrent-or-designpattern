package factory;

public  class TwitterFactory extends Factory {

	String env;
	
	public TwitterFactory(String env) {
		this.env = env ;
	}
	
	public  Twitter getInstance() {
		if(this.env == "production") {
			return new TwitterImpl();
		}
		else {
			return new MockTwitterImpl();
		}
	};
}
