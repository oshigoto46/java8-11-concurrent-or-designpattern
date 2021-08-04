package factory;

public  class TwitterImpl implements Twitter {
	public void updateStatus(String message){
		System.out.println(message + "ガチで投稿しちゃうよおじさん");
	}

}
