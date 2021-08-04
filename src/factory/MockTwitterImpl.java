package factory;

public class MockTwitterImpl implements Twitter {

	public void updateStatus(String message){
		System.out.println(message + "mockで投稿しないのでセフセフ");
	}
}
