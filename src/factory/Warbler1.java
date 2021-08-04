package factory;

//import twitter4j.*;

/** ウグイス. */
public class Warbler1 {
// https://codezine.jp/article/detail/8571 の例が変な気がした
    /** さえずる. 
     * @throws Exception */
    public void warble(String env) throws Exception {
        Twitter twitter = makeTwitter(env);
        try {
            twitter.updateStatus("ケキョケキョケキョ");
        } catch (Exception exception) {
            throw new Exception("さへずらざりけり");
        }
    }

    /** Twitterクライアントのファクトリメソッド. */
    protected Twitter makeTwitter(String env) {
        Factory twitterFactory = new TwitterFactory(env);
        return twitterFactory.getInstance();
    }
}
